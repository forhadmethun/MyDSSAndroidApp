package com.elitesbd.mydss;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.elitesbd.mydss.fragment.Data;
import com.silencedut.expandablelayout.ExpandableLayout;

import java.util.HashSet;
import java.util.List;


/**
 * Created by SilenceDut on 16/6/7.
 */
public class SummonerAdapter extends RecyclerView.Adapter<SummonerAdapter.SummonerHolder>{
    private LayoutInflater mInflater;

    private HashSet<Integer> mExpandedPositionSet = new HashSet<>();

    private List<Data> listData;
    class SummonerHolder extends RecyclerView.ViewHolder {
        private ExpandableLayout expandableLayout ;
        public TextView title,body;

        private SummonerHolder(final View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.summoner);
            body = (TextView)itemView.findViewById(R.id.summoner_story_tv);


            expandableLayout = (ExpandableLayout) itemView.findViewById(R.id.expandable_layout);

        }

        private void updateItem(Data data,final int position) {


            expandableLayout.setOnExpandListener(new ExpandableLayout.OnExpandListener() {
                @Override
                public void onExpand(boolean expanded) {
                    registerExpand(position);
                }
            });
            expandableLayout.setExpand(mExpandedPositionSet.contains(position));

        }
    }



    public SummonerAdapter(List<Data> ld,Context context) {

        this.mInflater = LayoutInflater.from(context);
        this.listData = ld;
    }

    @Override
    public SummonerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //View item = mInflater.inflate(viewType==0?R.layout.item_ezreal:R.layout.item_jinx,parent,false);
        View view = mInflater.inflate(R.layout.item_ezreal,parent,false);
        return new SummonerHolder(view);
    }

    @Override
    public void onBindViewHolder(SummonerHolder holder, int position) {

        Data data = listData.get(position);
        holder.title.setText(data.getTitle());
        holder.body.setText(data.getDescription());


        holder.updateItem(data,position);
    }

    /*
    @Override
    public int getItemViewType(int position) {
        return position%2;
    }
    */

    @Override
    public int getItemCount() {
        return listData.size();

    }



    private void registerExpand(int position) {
        if (mExpandedPositionSet.contains(position)) {
            removeExpand(position);
        }else {
            addExpand(position);
        }
    }

    private void removeExpand(int position) {
        mExpandedPositionSet.remove(position);
    }

    private void addExpand(int position) {
        mExpandedPositionSet.add(position);
    }

}
