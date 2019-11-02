package com.example.app1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

 class viewHolder extends RecyclerView.ViewHolder {
    TextView offer;

     viewHolder(@NonNull View itemView) {
        super(itemView);
        offer = itemView.findViewById(R.id.offers);
    }
}
