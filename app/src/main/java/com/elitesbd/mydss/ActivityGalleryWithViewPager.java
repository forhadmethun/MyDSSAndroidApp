package com.elitesbd.mydss;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.elitesbd.mydss.fragment.FragmentGalleryFragment;

import java.util.ArrayList;
import java.util.List;

public class ActivityGalleryWithViewPager extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ArrayList<Integer> itemData;
    private  int totalImage;
    int[] flags = new int[]{
            R.mipmap.mydss_images01,
            R.mipmap.mydss_images02,
            R.mipmap.mydss_images03,
            R.mipmap.mydss_images04,
            R.mipmap.mydss_images05,
            R.mipmap.mydss_images06,
            R.mipmap.mydss_images07,
            R.mipmap.mydss_images09

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_with_view_pager);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // add back arrow to toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        //change name of title
        ((AppCompatActivity) ActivityGalleryWithViewPager.this).getSupportActionBar().setTitle("ফটো গ্যালারী");

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);







    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        FragmentGalleryFragment f= new FragmentGalleryFragment();

        for(int i=0;i<flags.length;i++) {
            Bundle bundle = new Bundle();
            bundle.putString("edttext", ""+i);
            FragmentGalleryFragment fragobj = new FragmentGalleryFragment();
            fragobj.setArguments(bundle);
            int x= i+1;
            adapter.addFragment(fragobj, ""+x);
        }




        viewPager.setAdapter(adapter);
    }
    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

}
