package com.elitesbd.mydss;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.elitesbd.mydss.fragment.RecyclerViewFragment;
import com.elitesbd.mydss.fragment.RecyclerViewFragmentCitizenCharter;

public class ActivityCitizenCharter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citizen_charter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // add back arrow to toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        //change name of title
        ((AppCompatActivity) ActivityCitizenCharter.this).getSupportActionBar().setTitle("সিটিজেন চার্টার");

        SamplePageAdapter adapter = new SamplePageAdapter(getSupportFragmentManager());
        Fragment fragment1 = new RecyclerViewFragment();
        Bundle data1 = new Bundle();
        data1.putInt("id", 0);
        fragment1.setArguments(data1);
        adapter.addFrag(fragment1, getString(R.string.UsageOne));

        //getSupportFragmentManager().beginTransaction().replace(R.id.content_activity_citizen_charter, RecyclerViewFragment.newInstance()).commit();

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        setupViewPager(viewPager);


    }


    private void setupViewPager(ViewPager viewPager) {
        SamplePageAdapter adapter = new SamplePageAdapter(getSupportFragmentManager());

        Fragment fragment1 = new RecyclerViewFragmentCitizenCharter();
        Bundle data1 = new Bundle();
        data1.putInt("id", 0);
        fragment1.setArguments(data1);
        adapter.addFrag(fragment1, getString(R.string.UsageOne));
        viewPager.setAdapter(adapter);

    }

    //for back button in toolbar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

}


    /*







        extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_center);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // add back arrow to toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        //change name of title
        ((AppCompatActivity) ActivityHelpCenter.this).getSupportActionBar().setTitle("সেবা কুঞ্জ");

    }


    //for back button in toolbar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

}
*/