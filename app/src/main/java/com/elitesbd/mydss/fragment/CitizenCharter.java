package com.elitesbd.mydss.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.elitesbd.mydss.ListItem;
import com.elitesbd.mydss.R;
import com.elitesbd.mydss.SummonerAdapter;

import java.util.List;

/**
 * Created by forhad on 05-10-2016.
 */

public class CitizenCharter extends Fragment {

    public static CitizenCharter newInstance() {
        CitizenCharter recyclerViewFragment = new CitizenCharter();
        return recyclerViewFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_citigen_charter,container,false);
        RecyclerView summonerList;
        summonerList = (RecyclerView)rootView.findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        summonerList.setLayoutManager(linearLayoutManager);
        List<Data> datas  = ListItem.getListData();
        SummonerAdapter summonerAdapter = new SummonerAdapter(datas,getActivity());
        summonerList.setAdapter(summonerAdapter);
        return rootView;
    }
}
