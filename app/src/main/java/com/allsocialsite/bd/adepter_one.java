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

public class adepter_one extends BaseAdapter {


    private Context context;
    private final  String[] gridViewString;
   // private final int[] gridViewImageId;
    private int[] gridViewImageId;


    public adepter_one(Context ct, String[]gridViewString, int[] gridViewImageId) {
        context = ct;
        this.gridViewImageId = gridViewImageId;
        this.gridViewString = gridViewString;
    }

    @Override
    public int getCount() {


        return gridViewString.length;

      //  return filteredData.size();
    }




    @Override
    public Object getItem(int i){


    return i;
    }

    @Override
    public long getItemId(int i) {


        return i;
    }











    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View gridViewAndroid;
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //if (convertView == null) {


            gridViewAndroid = new View(context);
            gridViewAndroid = inflater.inflate(R.layout.singleitem, null);
            TextView textViewAndroid = (TextView) gridViewAndroid.findViewById(R.id.textview);
            ImageView imageViewAndroid = (ImageView) gridViewAndroid.findViewById(R.id.imageview);
            textViewAndroid.setText(gridViewString[i]);
            imageViewAndroid.setImageResource(gridViewImageId[i]);




        //} else {
            //gridViewAndroid = (View) convertView;
       // }



        return gridViewAndroid;
    }


}












