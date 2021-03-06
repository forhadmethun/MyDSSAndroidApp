package com.elitesbd.mydss;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by forhad on 11-10-2016.
 */

public class MapStateManager {
    public static final String LONGITUDE = "longitude";
    public static final String LATITUDE = "latitude";
    public static final String ZOOM = "zoom";
    public static final String BEARING = "bearing";
    public static final String TILT = "tilt";
    public static final String MAPTYPE = "maptype";

    public static final String PREFS_NAME = "mapCameraState";
    private SharedPreferences mapStatePrefs;

    public MapStateManager(Context context){
        mapStatePrefs = context.getSharedPreferences(PREFS_NAME,Context.MODE_PRIVATE);


    }
    public void saveMapState(GoogleMap map)
    {
        SharedPreferences.Editor editor = mapStatePrefs.edit();
        CameraPosition position = map.getCameraPosition();

        editor.putFloat(LATITUDE,(float)position.target.latitude);
        editor.putFloat(LONGITUDE,(float)position.target.longitude);
        editor.putFloat(ZOOM,position.zoom);
        editor.putFloat(TILT,position.tilt);
        editor.putFloat(BEARING,position.bearing);
        editor.putInt(MAPTYPE,map.getMapType());
        editor.commit();

    }

    public CameraPosition getCameraPosition() {
        double latitude = mapStatePrefs.getFloat(LATITUDE, 0);
        if (latitude == 0) {
            return null;
        }
        double longitude = mapStatePrefs.getFloat(LONGITUDE, 0);
        LatLng target = new LatLng(latitude, longitude);

        float zoom = mapStatePrefs.getFloat(ZOOM, 0);
        float tilt = mapStatePrefs.getFloat(TILT, 0);
        float bearing = mapStatePrefs.getFloat(BEARING, 0);


        return new CameraPosition(target, zoom, tilt, bearing);

    }

}
