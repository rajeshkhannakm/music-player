package com.example.rajeshkhanna.musicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongViewAdapter extends ArrayAdapter<Song> {

    public SongViewAdapter(Context context, ArrayList<Song> songArrayList) {
        super(context, R.layout.song_view, songArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.song_view, parent, false);

        Song current_song = getItem(position);
        TextView textView = (TextView) customView.findViewById(R.id.textView);
        TextView textView2 = (TextView) customView.findViewById(R.id.textView2);

        textView.setText(current_song.getTitle());
        textView2.setText(current_song.getArtist());

        return customView;
    }
}
