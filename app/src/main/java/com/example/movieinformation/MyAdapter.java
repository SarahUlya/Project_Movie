package com.example.movieinformation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{

    Context context;
    OnItemClickListener listener;
    List<Item> itemList;

    public interface OnItemClickListener{
        void onItemClick(Item item);
    }

    public MyAdapter(Context context, List<Item> itemList, OnItemClickListener listener) {
        this.context = context;
        this.itemList = itemList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Item item = itemList.get(position);

        holder.imageView.setImageResource(item.getImage());
        holder.nameView.setText(item.getName());
        holder.itemView.setOnClickListener(v -> listener.onItemClick(item));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}

