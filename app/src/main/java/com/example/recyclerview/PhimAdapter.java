package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PhimAdapter extends RecyclerView.Adapter<PhimAdapter.ViewHolder>{
    @NonNull
    ArrayList<Phim> dataPhims;
    Context context;

    public PhimAdapter(@NonNull ArrayList<Phim> dataPhims, Context context) {
        this.dataPhims = dataPhims;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.line_row,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.ten.setText(dataPhims.get(position).getTen());
        holder.hinhAnh.setImageResource(dataPhims.get((position)).getHinhAnh());
    }

    @Override
    public int getItemCount() {
        return dataPhims.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView ten,moTa;
        ImageView hinhAnh;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ten = itemView.findViewById(R.id.txtTen);
            hinhAnh = itemView.findViewById(R.id.imageView);
        }
    }
}
