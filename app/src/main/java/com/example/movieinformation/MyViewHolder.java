package com.example.movieinformation;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView,titleView,desc,link;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.ImageView);
        nameView = itemView.findViewById(R.id.name);
        titleView = itemView.findViewById(R.id.item_title);
        desc = itemView.findViewById(R.id.item_description);
        link = itemView.findViewById(R.id.link_item);
    }
}
