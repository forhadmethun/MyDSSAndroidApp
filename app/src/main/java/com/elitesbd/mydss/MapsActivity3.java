package com.elitesbd.mydss;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity3 extends AppCompatActivity implements OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, LocationListener, GoogleMap.OnMapLoadedCallback, GoogleMap.OnCameraChangeListener {

    private GoogleMap mMap;


    LocationRequest mLocationRequest;
    GoogleApiClient mGoogleApiClient;
    LatLng latLng;
    GoogleMap mGoogleMap;
    SupportMapFragment mFragment;
    Marker currLocationMarker;
    Toolbar toolbar;
    CameraUpdate update;
    private ProgressBar mProgress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps3);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        */

        // add back arrow to toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        ((AppCompatActivity) MapsActivity3.this).getSupportActionBar().setTitle("Nearest DSS");


        LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);


        if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            Toast.makeText(this, "GPS is Enabled in your devide", Toast.LENGTH_SHORT).show();
        } else {
            showGPSDisabledAlertToUser();
        }


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        mProgress = (ProgressBar) findViewById(R.id.progress_spinner);
        update = null;






        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */


    }

    private void showGPSDisabledAlertToUser() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("GPS is disabled in your device. Would you like to enable it?")
                .setCancelable(false)
                .setPositiveButton("Goto Settings Page To Enable GPS",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent callGPSSettingIntent = new Intent(
                                        android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                                startActivity(callGPSSettingIntent);
                            }
                        });
        alertDialogBuilder.setNegativeButton("Cancel",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }

    /*
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
    */
    @Override
    public void onMapReady(GoogleMap gMap) {

//        Toast.makeText(this, "ONMAPREADY--->>!!!!", Toast.LENGTH_SHORT).show();


        mGoogleMap = gMap;
        mGoogleMap.setMyLocationEnabled(true);
        mGoogleMap.setOnCameraChangeListener(this);
        gotoLocation(23.7259407, 90.392416, 5);


        if (update != null)//gotoLocation(update.)
        {
//            Toast.makeText(this, "updated ... ", Toast.LENGTH_LONG).show();
            mGoogleMap.moveCamera(update);
        } else {
  //          Toast.makeText(this, "not updated...", Toast.LENGTH_LONG).show();
        }
        //mGoogleMap.moveCamera(update);


        mGoogleMap.setPadding(50, 150, 50, 150);
        mGoogleMap.animateCamera(CameraUpdateFactory.zoomTo(11));

        mGoogleMap.getUiSettings().setCompassEnabled(true);
        mGoogleMap.getUiSettings().setMapToolbarEnabled(false);
    //    Toast.makeText(this, "ShouldEnabledCompass", Toast.LENGTH_SHORT).show();


        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

        buildGoogleApiClient();
        mGoogleApiClient.connect();
        mGoogleMap.setMyLocationEnabled(true);


    }

    protected synchronized void buildGoogleApiClient() {
        //  Toast.makeText(this, "buildGoogleApiClient", Toast.LENGTH_SHORT).show();
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();
    }

    private void gotoLocation(double lat, double lng) {
        mGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(lat, lng)));

    }

    private void gotoLocation(double lat, double lng, float zoom) {
        mGoogleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(lat, lng), zoom));

    }

    /*
    @Override
    public void onConnected(Bundle bundle) {
         Toast.makeText(this, "onConnected", Toast.LENGTH_SHORT).show();
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            Toast.makeText(MapsActivity3.this,"................Added",Toast.LENGTH_LONG).show();


            return;
        }

        Location mLastLocation = LocationServices.FusedLocationApi.getLastLocation(
                mGoogleApiClient);
        if (mLastLocation != null) {
            //place marker at current position
            //mGoogleMap.clear();
            latLng = new LatLng(mLastLocation.getLatitude(), mLastLocation.getLongitude());
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.position(latLng);
            markerOptions.title("Current Position");
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
            //mGoogleMap.addMarker(markerOptions).showInfoWindow();
            currLocationMarker =
                    mGoogleMap.addMarker(markerOptions);


            Location selected_location=new Location("locationA");
            selected_location.setLatitude(mLastLocation.getLatitude());
            selected_location.setLongitude(mLastLocation.getLongitude());

            double lats[] = {23.7259407,23.73751,23.7529848,23.7679385,23.7393379};
            double longs[] = {90.392416,90.3944529,90.3813189,90.4127464,90.3809464};
            String place[] = {"BUET","National Museum","Square hospital","hatir jheel","star kabab"};

            double min_distance = Integer.MAX_VALUE;
            for(int i=0;i<5;i++) {


                Location near_locations = new Location("locationA");
                near_locations.setLatitude(lats[i]);
                near_locations.setLongitude(longs[i]);

                double distance = selected_location.distanceTo(near_locations);
                if(distance<min_distance){
                    min_distance = distance;
                    Toast.makeText(MapsActivity3.this,"Added",Toast.LENGTH_LONG).show();
                    mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(lats[i],longs[i])).title(place[i]).snippet("").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))).showInfoWindow();

                }
                else{
                    Toast.makeText(MapsActivity3.this,"Added",Toast.LENGTH_LONG).show();
                    mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(lats[i],longs[i])).title(place[i]).snippet("").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));


                }

            }

        }


        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(5000); //5 seconds
        mLocationRequest.setFastestInterval(3000); //3 seconds
        mLocationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
        //mLocationRequest.setSmallestDisplacement(0.1F); //1/10 meter


        //the following line generates error
        // LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest,MapsActivity.this);



    }
    */
    @Override
    public void onConnected(Bundle bundle) {
       // Toast.makeText(this, "onConnected", Toast.LENGTH_SHORT).show();
        Location selected_location = new Location("locationA");


        double lats[] = {23.7259407, 23.73751, 23.7529848, 23.7679385, 23.7393379};
        double longs[] = {90.392416, 90.3944529, 90.3813189, 90.4127464, 90.3809464};
        String place[] = {"BUET", "National Museum", "Square hospital", "hatir jheel", "star kabab"};

        double min_distance = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {


            Location near_locations = new Location("locationA");
            near_locations.setLatitude(lats[i]);
            near_locations.setLongitude(longs[i]);

            double distance = selected_location.distanceTo(near_locations);
         //   Toast.makeText(this, "ADDED ON THE MAP", Toast.LENGTH_SHORT).show();
            if (distance < min_distance) {
                min_distance = distance;
                mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(lats[i], longs[i])).title(place[i]).snippet("").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))).showInfoWindow();

            } else {
                mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(lats[i], longs[i])).title(place[i]).snippet("").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));


            }

        }

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
    /*
    Location mLastLocation = LocationServices.FusedLocationApi.getLastLocation(
            mGoogleApiClient);
    */
   //     Toast.makeText(this, "Befor Last Location", Toast.LENGTH_SHORT).show();
    /*
    if (mLastLocation != null) {


        latLng = new LatLng(mLastLocation.getLatitude(), mLastLocation.getLongitude());
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title("Current Position");
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        //mGoogleMap.addMarker(markerOptions).showInfoWindow();
        currLocationMarker =
                mGoogleMap.addMarker(markerOptions);


        Location selected_location=new Location("locationA");
        selected_location.setLatitude(mLastLocation.getLatitude());
        selected_location.setLongitude(mLastLocation.getLongitude());

        double lats[] = {23.7259407,23.73751,23.7529848,23.7679385,23.7393379};
        double longs[] = {90.392416,90.3944529,90.3813189,90.4127464,90.3809464};
        String place[] = {"BUET","National Museum","Square hospital","hatir jheel","star kabab"};

        double min_distance = Integer.MAX_VALUE;
        for(int i=0;i<5;i++) {


            Location near_locations = new Location("locationA");
            near_locations.setLatitude(lats[i]);
            near_locations.setLongitude(longs[i]);

            double distance = selected_location.distanceTo(near_locations);
            Toast.makeText(this, "ADDED ON THE MAP", Toast.LENGTH_SHORT).show();
            if(distance<min_distance){
                min_distance = distance;
                mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(lats[i],longs[i])).title(place[i]).snippet("").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))).showInfoWindow();

            }
            else{
                mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(lats[i],longs[i])).title(place[i]).snippet("").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));


            }

        }

    }
    */

    /*
    mLocationRequest = new LocationRequest();
    mLocationRequest.setInterval(5000); //5 seconds
    mLocationRequest.setFastestInterval(3000); //3 seconds
    mLocationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
    */
        //mLocationRequest.setSmallestDisplacement(0.1F); //1/10 meter


        //the following line generates error
        // LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest,MapsActivity.this);


    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    /*
        @Override
        public void
        (Location location) {

        }*/
    public void onLocationChanged(Location location) {
        Toast.makeText(this, "onLocation Changed Called", Toast.LENGTH_SHORT).show();
        //place marker at current position
        //mGoogleMap.clear();
        if (currLocationMarker != null) {
            currLocationMarker.remove();
        }
        latLng = new LatLng(location.getLatitude(), location.getLongitude());
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title("Current Position");
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        currLocationMarker = mGoogleMap.addMarker(markerOptions);


        // Toast.makeText(this,"Location Changed",Toast.LENGTH_SHORT).show();

        //zoom to current position:
        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(latLng).zoom(14).build();

        // mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

        //If you only need one location, unregister the listener
        //LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);

    }

    /*
        @Override
        public void onMapLoaded() {

        }

        @Override
        public void onCameraChange(CameraPosition cameraPosition) {

        }
    */
    @Override
    protected void onStop() {
        super.onStop();
        MapStateManager mapStateManager = new MapStateManager(this);
        mapStateManager.saveMapState(mGoogleMap);
        CameraPosition position = mapStateManager.getCameraPosition();

        CameraUpdate update = CameraUpdateFactory.newCameraPosition(position);
    //    Toast.makeText(this, "OnStop() ....." + position.target.longitude + "--- " + position.target.latitude, Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onResume() {
        super.onResume();
        MapStateManager mapStateManager = new MapStateManager(this);
        CameraPosition position = mapStateManager.getCameraPosition();
        if (position != null) {
//            Toast.makeText(this, "Resumed ..  ....." + position.target.longitude + "--- " + position.target.latitude, Toast.LENGTH_SHORT).show();
            // gotoLocation(position.target.latitude,position.target.longitude);


            //if(position!=null && mGoogleMap != null){
            update = CameraUpdateFactory.newCameraPosition(position);
        }

        //}


    }

    @Override
    public void onMapLoaded() {
        //TODO: Hide your progress indicator
        mProgress.setVisibility(View.GONE);
        setProgressBarIndeterminateVisibility(Boolean.FALSE);
        // getSupportActionBar().setIcon(R.drawable.ic_launcher);

    }

    @Override
    public void onCameraChange(final CameraPosition cameraPosition) {
        mGoogleMap.setOnMapLoadedCallback(this);

        //TODO: Show your progress indicator
        mProgress.setVisibility(View.VISIBLE);
        //  setProgressBarIndeterminateVisibility(Boolean.TRUE);
        //   getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
//for adding toolbar back icon
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

    private static final int LOCATION_REQUEST_CODE = 1;

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
   //     Toast.makeText(this, "ON REQUEST PERMISSION RESULT", Toast.LENGTH_SHORT).show();
        if (requestCode == LOCATION_REQUEST_CODE) {
            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                mGoogleMap.setMyLocationEnabled(true);
                Toast.makeText(this, "DHUKSE...", Toast.LENGTH_SHORT).show();
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }

        }
    }



}
