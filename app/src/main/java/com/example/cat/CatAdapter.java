package com.example.cat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.MyViewHolder> {


    Context context ;
    ArrayList<Cats>list;

    public CatAdapter(Context context, ArrayList<Cats> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_cat,parent,false);

        return new MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Cats user = list.get(position);
        holder.Catname.setText(user.getCatname());
        holder.Catdescription.setText(user.getCatDes());
        holder.CatBreed.setText(user.getCatBreed());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView Catname , Catdescription , CatBreed ;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Catname = itemView.findViewById(R.id.Catname);
            Catdescription = itemView.findViewById(R.id.CatDescription);
            CatBreed = itemView.findViewById(R.id.CatBreed);
        }
    }
}
