package com.example.recyclerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.databinding.RecviewrowBinding;

import java.util.ArrayList;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder> {

    ArrayList<LandMark> landList;

    public LandmarkAdapter(ArrayList<LandMark> landList) {
        this.landList = landList;
    }

    //xml'i bağlama işlemi
    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecviewrowBinding recviewrowBinding=RecviewrowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LandmarkHolder(recviewrowBinding);
    }

    //layoutta hangi verilerin gösterileceği
    @Override
    public void onBindViewHolder(@NonNull LandmarkHolder holder, int position) {

        holder.binding.recViewText.setText(landList.get(position).name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(holder.itemView.getContext(),DetailActiviy.class);
                intent.putExtra("landmark",landList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return landList.size();
    }

    //Görünümleri tutar
    public class LandmarkHolder extends RecyclerView.ViewHolder{

        RecviewrowBinding binding;

        public LandmarkHolder(RecviewrowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
