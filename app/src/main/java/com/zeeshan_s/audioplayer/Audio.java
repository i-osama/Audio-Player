package com.zeeshan_s.audioplayer;

import android.net.Uri;

import java.io.Serializable;

public class Audio implements Serializable {
    String audioName;
    long audioId;
    Uri audioUri;

    public Audio(String audioName, long audioId, Uri audioUri) {
        this.audioName = audioName;
        this.audioId = audioId;
        this.audioUri = audioUri;
    }

    public String getAudioName() {
        return audioName;
    }

    public long getAudioId() {
        return audioId;
    }

    public Uri getAudioUri() {
        return audioUri;
    }
}
