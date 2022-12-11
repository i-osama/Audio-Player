package com.zeeshan_s.audioplayer;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AudioAdapter extends RecyclerView.Adapter<AudioViewHolder> {
    Context context;
    List<Audio> audioList;

    public AudioAdapter(Context context, List<Audio> audioList) {
        this.context = context;
        this.audioList = audioList;
        Log.i("tag", "AudioAdapter: Constructor worked--------");
    }

    @NonNull
    @Override
    public AudioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.audio_option_recycler, parent, false);
        AudioViewHolder audioViewHolder = new AudioViewHolder(view);
        return audioViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AudioViewHolder holder, int position) {

//        Log.i("tag", "AudioAdapter: Bindview worked---------");
        Audio allAudio = audioList.get(position);
        String musicName = audioList.get(position).getAudioName();
        String audioUri = String.valueOf(allAudio.getAudioUri());

        holder.audioName.setText(musicName);

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(context, AudioClicked.class);
            intent.putExtra("audioName", allAudio.getAudioName());
//            intent.putExtra("uri", allAudio.getAudioUri().toString());
            intent.putExtra("uri", audioUri);
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return audioList.size();
    }
}
