package com.allsocialsite.bd;

import android.app.Activity;
import android.os.Bundle;
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



public class imageloader extends BaseAdapter implements Filterable
{
    private Context context;
    private ArrayList<String> originalData = null;
    //private ArrayList<String> originalData = null;

    ArrayList<String> filteredData = null;
    //ArrayList<model> filteredData = null;

    //private String[] originalData = null;
    //String[] filteredData = null;

    LayoutInflater layoutInflater;
    ValueFilter valueFilter = new ValueFilter();


    //private String[] gridViewString;
    private int[] gridViewImageId;




    public imageloader(Context context, ArrayList<String> mobileValues,  int[] gridViewImageId)
    {
        this.context = context;
        this.originalData = mobileValues;
        this.filteredData = mobileValues;
        this.gridViewImageId = gridViewImageId;

    }

    @Override
    public int getCount() {
        return filteredData.size();
    }

    @Override
    public Object getItem(int position) {


        return filteredData.get(position);
    }

    @Override
    public long getItemId(int position) {


        return filteredData.indexOf(getItem(position));

    }

    public View getView(int position, View convertView, ViewGroup parent)
    {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(context);

            // get layout from mobile.xml
            //gridView = inflater.inflate(R.layout.singleitem, null);
            gridView = inflater.inflate(R.layout.singleitem, parent, false);
            // set value into textview
            //TextView textView = (TextView) gridView
                   // .findViewById(R.id.textview);
            //textView.setText(originalData.get(position));
           // textView.setText(getItem(position).toString());

            // set image based on selected text
            // ImageView imageView = (ImageView)
             //gridView.findViewById(R.id.imageview);

            // imageView.setImageResource(R.drawable.city_image);

        } else {
            gridView = (View) convertView;
        }

        ImageView imageView = (ImageView)
                gridView.findViewById(R.id.imageview);


        imageView.setImageResource(gridViewImageId[position]);
        // set value into textview
        TextView textView = (TextView) gridView.findViewById(R.id.textview);
        textView.setText(getItem(position).toString());



        return gridView;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override
    public Filter getFilter() {


        return valueFilter;
    }

    public class model{


        private String name;
        private int image_drawable;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getImage_drawable() {
            return image_drawable;
        }

        public void setImage_drawable(int image_drawable) {
            this.image_drawable = image_drawable;
        }

    }

    private class ValueFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            String filterString = constraint.toString().toUpperCase();

            FilterResults results = new FilterResults();


            /*
             * if (constraint != null && constraint.length() > 0) {
             */
            final ArrayList<String> lst = imageloader.this.originalData;
            //final ArrayList<model> lst =new ArrayList<model>();
            final int[] lsta = imageloader.this.gridViewImageId;

            int count = lst.size();

            final ArrayList<String> filterList = new ArrayList<String>(count);
            //final ArrayList<model> filterList = new ArrayList<model>(count);


            String filterableString;
            model filterableimage ;






            for (int i = 0; i < count; i++) {
                filterableString = lst.get(i);



                if ((filterableString.toUpperCase().contains(filterString))) {

                    filterList.add(filterableString);

                    //filterList.add(filterableimage);




                }

/*

                if ((filterableString().contains(filterString)) {

                    filterList.add(filterableString);




                }
                */


            }
            results.count = filterList.size();
            results.values = filterList;
            /* } *//*
             * else { results.count = mStringFilterList.size();
             * results.values = mStringFilterList; }
             */
            return results;

        }

        @SuppressWarnings("unchecked")
        @Override
        protected void publishResults(CharSequence constraint,
                                      FilterResults results) {
            filteredData = (ArrayList<String>) results.values;
            notifyDataSetChanged();
        }

    }
}