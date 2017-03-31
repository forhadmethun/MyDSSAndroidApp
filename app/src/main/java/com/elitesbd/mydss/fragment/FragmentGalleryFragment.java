package com.elitesbd.mydss.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.elitesbd.mydss.R;

/**
 * Created by forhad on 11-11-2016.
 */

public class FragmentGalleryFragment extends Fragment{
    ImageView iv;
    TextView tv;
    View root;
    int[] flags = new int[]{
            R.mipmap.mydss_images01,
            R.mipmap.mydss_images00,
            R.mipmap.mydss_images02,
            R.mipmap.mydss_images03,
            R.mipmap.mydss_images04,
            R.mipmap.mydss_images05,
            R.mipmap.mydss_images06,
            R.mipmap.mydss_images07,
            R.mipmap.mydss_images09

    };

  //  String mDrawableName = "myappicon";
    //int resID = getResources().getIdentifier(mDrawableName , "drawable", getPackageName());

    public FragmentGalleryFragment() {
        // Required empty public constructor
    }
    public static FragmentGalleryFragment newInstance(int index)
    {
        FragmentGalleryFragment f= new  FragmentGalleryFragment();
        f.setImage(index);
        return f;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //View root = inflater.inflate()
        // Inflate the layout for this fragment
         root =  inflater.inflate(R.layout.fragment_gallery_with_viewpager, container, false);
       // iv = (ImageView) root.findViewById(R.id.gallery);
       // iv.setImageResource(R.mipmap.mydss_images01);

        String strtext = getArguments().getString("edttext");

        //iv = (ImageView) root.findViewById(R.id.gallery);
        iv = (ImageView) root.findViewById(R.id.gallery);
        iv.setImageResource(flags[Integer.parseInt(strtext)]);
       // tv = (TextView) root.findViewById(R.id.tv_bal);
      //  tv.setText("Test...");

        return root;
    }
    public  void setImage(int index)
    {
        //if(index == 0)
       // iv = (ImageView) root.findViewById(R.id.gallery);
        //tv = (TextView) root.findViewById(R.id.tv_bal);
//        tv.setText("Test..dtrfyguhuijij.uhygjth.");
        //iv.setImageResource(flags[index]);
    }

}