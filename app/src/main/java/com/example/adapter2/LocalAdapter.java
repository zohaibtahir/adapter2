package com.example.adapter2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LocalAdapter extends BaseAdapter {

    private Context context;
    private String[] names;
    private int[] images;

    LocalAdapter(Context context,String[] names,int[] imgs){
        this.names=names;
        this.context=context;
        this.images=imgs;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView txtview;
        ImageView imgview;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.layout_temp,null);
        txtview = v.findViewById(R.id.namesScreen);
        imgview = v.findViewById(R.id.imgBox);
        txtview.setText(names[i]);
        imgview.setImageResource(images[i]);
        return v;
    }
}
