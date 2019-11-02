package com.allsocialsite.bd;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class imageloaderb extends BaseAdapter {

    //List<model> worldpopulationlist;
    //List<model> mOriginalNames;
    // Declare Variables
    Context mainActivity;
    LayoutInflater inflater;
    public List<model> worldpopulationlist = null;

    public ArrayList<model> arraylist;


    public imageloaderb(Context context,
                        List<model> worldpopulationlist) {
        mainActivity = context;
        this.worldpopulationlist = worldpopulationlist;
        inflater = LayoutInflater.from(mainActivity);
        this.arraylist = new ArrayList<model>();

        this.arraylist.addAll(worldpopulationlist);
        //imageLoader = new ImageLoader(activity.getApplicationContext());








    }

    public class ViewHolder {
        TextView rank;
        TextView country;
        TextView population;
        ImageView flag;
    }

    @Override
    public int getCount() {
        return worldpopulationlist.size();
    }

    @Override
    public model getItem(int position) {
        return worldpopulationlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, final ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.singleitem, null);
            // Locate the TextViews in listview_item.xml
            holder.rank = (TextView) view.findViewById(R.id.textview);

            holder.flag = (ImageView) view.findViewById(R.id.imageview);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        // Set the results into TextViews
        holder.rank.setText(worldpopulationlist.get(position).getName());

        holder.flag.setImageResource(worldpopulationlist.get(position)
                .getImage_drawable());
        // Listen for ListView Item Click
        view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                switch (position){

                    case 0:
                        if (position == 1) {
                            mainActivity.startActivity(new Intent((Context) mainActivity, webview.class).putExtra("v", 1));
                        }

                    case 2:
                        mainActivity.startActivity(new Intent((Context) mainActivity, webview.class).putExtra("v",2));

                }












            }

        });

        return view;
    }

    // Filter Class
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        worldpopulationlist.clear();
        if (charText.length() == 0) {
            worldpopulationlist.addAll(arraylist);
        } else {
            for (model wp : arraylist) {
                if (wp.getName().toLowerCase(Locale.getDefault())
                        .contains(charText)) {
                    worldpopulationlist.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }







}