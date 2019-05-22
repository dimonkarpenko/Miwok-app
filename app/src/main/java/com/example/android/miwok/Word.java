package com.example.android.miwok;


import android.media.Image;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mResourceId = NO_IMAGE_PROVIDED;

    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int resourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mResourceId = resourceId;
        mAudioResourceId = audioResourceId;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public Integer getmResourceId() {
        return mResourceId;
    }

    public boolean hasImage() {
        return mResourceId != NO_IMAGE_PROVIDED;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
