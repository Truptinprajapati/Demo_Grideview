package com.example.trupti.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by vaksys-android-4 on 19/8/17.
 */


class ImageAdapter extends BaseAdapter{

Context context;
int[] image;
    public ImageAdapter(Context context, int[] img) {
        this.context=context;
        this.image=img;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder
    {
        ImageView holderimg;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder hd = new Holder();

        convertView= LayoutInflater.from(context).inflate(R.layout.single_row,parent,false);
         hd.holderimg=(ImageView)convertView.findViewById(R.id.rowimg);
        hd.holderimg.setImageResource(image[position]);




        return convertView;
    }
}
