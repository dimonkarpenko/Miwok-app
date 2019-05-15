package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mcolorId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorId) {
        super(context, 0, words);
        mcolorId = colorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listView = convertView;

        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwok = (TextView) listView.findViewById(R.id.miwok_tv);

        miwok.setText(currentWord.getmMiwokTranslation());

        TextView defaultTranslation = (TextView) listView.findViewById(R.id.default_tv);

        defaultTranslation.setText(currentWord.getmDefaultTranslation());

        ImageView images = (ImageView) listView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            images.setImageResource(currentWord.getmResourceId());
            images.setVisibility(View.VISIBLE);
        } else {
            images.setVisibility(View.GONE);
        }

        View container = listView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mcolorId);

        container.setBackgroundColor(color);

        return listView;
    }
}
