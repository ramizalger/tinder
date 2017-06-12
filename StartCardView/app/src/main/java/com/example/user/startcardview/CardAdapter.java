package com.example.user.startcardview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;

public class CardAdapter extends ArrayAdapter<Integer> {

    public CardAdapter(Context context, int resource) {

        super(context, resource);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgView = (ImageView)convertView.findViewById(R.id.image_content);
        imgView.setImageResource(getItem(position));
        return convertView;

    }
}