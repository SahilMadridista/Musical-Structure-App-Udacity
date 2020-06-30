package com.example.musicalstructureapp;

import android.content.Context;
import android.icu.util.VersionInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {

   public SongsAdapter (Context context, ArrayList<Songs> object) {
      super(context, 0, object);
   }

   @NonNull
   @Override
   public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      View listItemView = convertView;
      if(listItemView == null) {
         listItemView = LayoutInflater.from(getContext()).inflate(
                 R.layout.list_item, parent, false);


      }
      Songs currentWord= (Songs) getItem(position);

      TextView SongNameTextView = (TextView) listItemView.findViewById(R.id.opus_text_view);

      assert currentWord != null;

      SongNameTextView.setText(currentWord.getSongName());

      TextView ComposerNameTextView = (TextView) listItemView.findViewById(R.id.composer_text_view);

      ComposerNameTextView.setText(currentWord.getComposerName());

      return listItemView;
   }
}
