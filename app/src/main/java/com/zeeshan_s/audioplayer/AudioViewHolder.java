package com.zeeshan_s.audioplayer;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AudioViewHolder extends RecyclerView.ViewHolder {
    TextView audioName;
    public AudioViewHolder(@NonNull View itemView) {
        super(itemView);
        audioName = itemView.findViewById(R.id.audioName);
    }
}
