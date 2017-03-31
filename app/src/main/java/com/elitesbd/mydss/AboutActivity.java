package com.elitesbd.mydss;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by forhad on 09-10-2016.
 */

public class AboutActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_about);
        initInstancesDrawer();
    }

    private void initInstancesDrawer() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
}