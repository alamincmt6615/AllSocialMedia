package com.allsocialsite.bd;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class adepter extends BaseAdapter {

    Context context;
    private final String [] values;
    private final int [] images;
    LayoutInflater layoutInflater;

    public adepter(Context context, String[] values, int[] images) {
        this.context = context;
        this.values = values;
        this.images = images;
    }

    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        Holder holder = new Holder();
        View rowView;

        rowView = layoutInflater.inflate(R.layout.singleitem, null);

        holder.tv =( TextView) rowView.findViewById(R.id.textview);
        holder.img = (ImageView) rowView.findViewById(R.id.imageview);

        holder.tv.setText(values[position]);
        holder.img.setImageResource(images[position]);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {

                    // Toast.makeText(listnewspaper.this, "Nice one: " + gridViewString[+i], Toast.LENGTH_LONG).show();

                    //startActivity(new Intent(listnewspaper.this,DetailsActivity.class).putExtra("v",1));


                    Intent intent = new Intent(context, webview.class);
                    intent.putExtra("v", "1");
                    context.startActivity(intent);





                }


                Toast.makeText(context, "You Clicked " + values[position], Toast.LENGTH_LONG).show();

            }
        });

        return rowView;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;
    }

}
