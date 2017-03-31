package com.elitesbd.mydss;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.elitesbd.mydss.fragment.AboutFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setCheckedItem(R.id.nav_about);
        this.onNavigationItemSelected(navigationView.getMenu().getItem(0));

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }





    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_about) {
            // Handle the camera action
            getSupportFragmentManager().beginTransaction().replace(R.id.content_home, AboutFragment.newInstance()).commit();

        } else if (id == R.id.nav_citizen_charter) {
            //getSupportFragmentManager().beginTransaction().replace(R.id.content_home, CitizenCharter.newInstance()).commit();
            Intent intent = new Intent(this, ActivityCitizenCharter.class);
            startActivity(intent);


        } else if (id == R.id.nav_help_center) {
                startActivity(new Intent(this,ActivityHelpCenter.class));

        }
        /*else if (id == R.id.nav_manage) {
            startActivity(new Intent(this,ActivityContact.class));

        }*/
        else if (id == R.id.nav_live_events) {
            startActivity(new Intent(this,ActivityLifeEvents.class));

        }else if (id == R.id.nav_photo_gallery) {
            //startActivity(new Intent(this,ActivityPhotoGallery.class));
            startActivity(new Intent(this,ActivityGalleryWithViewPager.class));

        }
        else if (id == R.id.nav_innovation) {
            startActivity(new Intent(this,ActivityPhotoGallery.class));

        }

        //work of map
        else if (id == R.id.nav_map) {

            if(!isConnected(MainActivity.this)) buildDialog(MainActivity.this).show();
            //if(!isLocationEnabled(MainActivity.this)) buildDialog(MainActivity.this).show();
            else {
                Intent intent = new Intent(this, MapsActivity3.class);
                // EditText editText = (EditText) findViewById(R.id.edit_message);
                // String message = editText.getText().toString();
                //   intent.putExtra(EXTRA_MESSAG
                startActivity(intent);
            }




        }

        //open fb page
        else if (id == R.id.nav_fb) {

            if(isInstalledFb()) {
                Intent LaunchIntent = getPackageManager()
                        .getLaunchIntentForPackage("com.facebook.katana");//if this name does not work provide the other one

                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                String facebookUrl = getFacebookPageURL(this);
                facebookIntent.setData(Uri.parse(facebookUrl));
                startActivity(facebookIntent);
                //startActivity(LaunchIntent);
            }
            else if(isInstalledChrome()){
                String url = "https://www.facebook.com/dss.gov.bd";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.setPackage("com.android.chrome");
                try {
                    startActivity(i);
                } catch (ActivityNotFoundException e) {
                    // Chrome is probably not installed
                    // Try with the default browser
                    i.setPackage(null);
                    startActivity(i);
                }
            }
            else{
                Toast.makeText(MainActivity.this,"fb not installed ",Toast.LENGTH_LONG).show();

                 String url = "https://www.facebook.com/dss.gov.bd";


                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);

                }


        }
        else if(id ==R.id.nav_website){
            if(isInstalledChrome()){
                String url = "http://dss.gov.bd/";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.setPackage("com.android.chrome");
                try {
                    startActivity(i);
                } catch (ActivityNotFoundException e) {
                    // Chrome is probably not installed
                    // Try with the default browser
                    i.setPackage(null);
                    startActivity(i);
                }
            }
            else{
                Toast.makeText(MainActivity.this,"fb not installed ",Toast.LENGTH_LONG).show();

                String url = "http://dss.gov.bd/";


                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);

            }

        }
        else if(id == R.id.district){
            startActivity(new Intent(this,ActivityDistrictOffice.class));
        }
        else if(id == R.id.division){
            startActivity(new Intent(this,ActivityHeadQuarter.class));

        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
    public boolean isInstalledFb(){

        try{
            ApplicationInfo info = getPackageManager().
                    getApplicationInfo("com.facebook.katana", 0 );
            return true;
        } catch( PackageManager.NameNotFoundException e ){
            return false;
        }

    }
    public boolean isInstalledChrome(){

        try{
            ApplicationInfo info = getPackageManager().
                    getApplicationInfo("com.android.chrome", 0 );
            return true;
        } catch( PackageManager.NameNotFoundException e ){
            return false;
        }

    }

    private boolean isPackageInstalled(String packagename, PackageManager packageManager) {
        try {
            packageManager.getPackageInfo(packagename, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public static String FACEBOOK_URL = "https://www.facebook.com/dss.gov.bd/";
    public static String FACEBOOK_PAGE_ID = "393984390722146";

    //method to get the right URL to use in the intent
    public String getFacebookPageURL(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            int versionCode = packageManager.getPackageInfo("com.facebook.katana", 0).versionCode;
            if (versionCode >= 3002850) { //newer versions of fb app
                return "fb://facewebmodal/f?href=" + FACEBOOK_URL;
            } else { //older versions of fb app
                return "fb://page/" + FACEBOOK_PAGE_ID;
            }
        } catch (PackageManager.NameNotFoundException e) {
            return FACEBOOK_URL; //normal web url
        }
    }




    public boolean isConnected(Context context) {

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo = cm.getActiveNetworkInfo();

        if (netinfo != null && netinfo.isConnectedOrConnecting()) {
            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if((mobile != null && mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting())) return true;
            else return false;
        } else return false;
    }
    public static boolean isLocationEnabled(Context context) {
        int locationMode = 0;
        String locationProviders;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            try {
                locationMode = Settings.Secure.getInt(context.getContentResolver(), Settings.Secure.LOCATION_MODE);

            } catch (Settings.SettingNotFoundException e) {
                e.printStackTrace();
            }

            return locationMode != Settings.Secure.LOCATION_MODE_OFF;

        }else{
            locationProviders = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);
            return !TextUtils.isEmpty(locationProviders);
        }


    }

    public AlertDialog.Builder buildDialog(Context c) {

        AlertDialog.Builder builder = new AlertDialog.Builder(c);
        builder.setTitle("No Internet connection.");
        builder.setMessage("You have no internet connection");

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });

        return builder;
    }



}
