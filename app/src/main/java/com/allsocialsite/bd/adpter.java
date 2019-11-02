package com.allsocialsite.bd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.GridView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import androidx.annotation.NonNull;


public class adpter extends BaseAdapter implements Filterable {

    List<model> filterdata= Collections.emptyList();
    List<model> data= Collections.emptyList();
    Context context;
    model current;
    int currentPos=0;
    LayoutInflater inflater = null;
    //ImageLoader imageLoader;

    adpter(Context context, List<model> data) {
        this.context=context;
        inflater= LayoutInflater.from(context);
        this.data=data;
        this.filterdata=data;
    }

    public int getCount() {

        return filterdata.size();
    }

    public Object getItem(int position) {

        return filterdata.get(position);
    }

    public long getItemId(int position) {

        return position;
    }



    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }


    public class ViewHolder {
        TextView rank;
        TextView country;
        TextView population;
        ImageView flag;
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
        holder.rank.setText(filterdata.get(position).getName());

        holder.flag.setImageResource(filterdata.get(position)
                .getImage_drawable());
        // Listen for ListView Item Click
        view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
       if (position==0){

           context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 0));

          }
       if (position==1){

           context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 1));

                }
        if (position==2){

            context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 2));



        }
        if (position==3){

            context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 3));


        }
                if (position==4){

                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 5));


                }



                if (position==5){

                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 6));
                }

                if (position==6){

                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 7));
                }
                if (position==7){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 8));
                }
                if (position==8){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 9));
                }
                if (position==9){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 10));
                }
                if (position==10){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 11));
                }
                if (position==11){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 12));
                }if (position==12){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 13));
                }
                if (position==13){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 14));
                }if (position==14){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 15));
                }if (position==15){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 16));
                }if (position==16){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 17));
                }
                if (position==17){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 18));
                }if (position==18){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 19));
                }if (position==19){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 20));
                }if (position==20){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 21));
                }
                if (position==21){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 22));
                }
                if (position==22){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 23));
                }if (position==23){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 24));
                }if (position==24){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 25));
                }if (position==25){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 26));
                }if (position==26){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 27));
                }if (position==27){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 28));
                }if (position==28){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 29));
                }if (position==29){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 30));
                }if (position==30){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 31));
                }
                if (position==31){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 32));
                }
                if (position==32){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 33));
                }
                if (position==33){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 34));
                }if (position==34){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 35));
                }
                if (position==35){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 36));
                }if (position==36){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 37));
                }if (position==37){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 38));
                }
                if (position==38){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 39));
                }if (position==39){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 40));
                }if (position==40){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 41));
                }if (position==41){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 42));
                }if (position==42){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 43));
                }
                if (position==43){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 44));
                }
                if (position==44){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 45));
                }if (position==45){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 46));
                }
                if (position==46){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 47));
                }if (position==47){
                    context.startActivity(new Intent((Context) context, webview.class).putExtra("v", 48));
                }










            }

        });

        return view;
    }

/*
    @Override
    public Filter getFilter() {

        Filter filter = new Filter() {

            @SuppressWarnings("unchecked")
            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {

                filterdata = (List<model>) results.values;
                notifyDataSetChanged();
            }

            @Override
            protected FilterResults performFiltering(CharSequence constraint) {

                FilterResults results = new FilterResults();
                ArrayList<String> FilteredArrayNames = new ArrayList<String>();

                if (mOriginalNames == null && mOriginalPictures == null)    {
                    mOriginalNames = new ArrayList<String>(arrayListNames);
                    mOriginalPictures = new ArrayList<String>(arrayPictures);
                }
                if (constraint == null || constraint.length() == 0) {
                    results.count = mOriginalNames.size();
                    results.values = mOriginalNames;
                } else {
                    constraint = constraint.toString().toLowerCase();
                    for (int i = 0; i < mOriginalNames.size(); i++) {
                        String dataNames = mOriginalNames.get(i);
                        if (dataNames.toLowerCase().startsWith(constraint.toString()))  {
                            FilteredArrayNames.add(dataNames);
                        }
                    }

                    results.count = FilteredArrayNames.size();
                    System.out.println(results.count);

                    results.values = FilteredArrayNames;
                    Log.e("VALUES", results.values.toString());
                }

                return results;
            }
        };

        return filter;
    }*/




    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                String ST=constraint.toString();

                if (ST.isEmpty()){
                    filterdata=data;

                }else {



                    List<model> FILTEREDdata= new ArrayList<>();
                    for (model row :data) {


                        // name match condition. this might differ depending on your requirement
                        // here we are looking for name or phone number match
                        if (row.getName().toLowerCase().contains(ST.toLowerCase()))  {
                            FILTEREDdata.add(row);
                        }

                    }


                    filterdata=FILTEREDdata;
                }


                FilterResults fr=new FilterResults();
                fr.values=filterdata;
                return fr;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {

                // filterdata=(ArrayList<DataFish>)results.values;


                filterdata=(ArrayList<model>)results.values;

                notifyDataSetChanged();

            }
        };
    }








}