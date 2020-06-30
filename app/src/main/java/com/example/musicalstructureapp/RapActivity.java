package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RapActivity extends AppCompatActivity implements ListView.OnItemClickListener{

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_rap);

      ArrayList<Songs> rap = new ArrayList<Songs>();

      rap.add(new Songs("Eminem","Rapgod"));
      rap.add(new Songs("Eminem","Stan"));
      rap.add(new Songs("Eminem","Lose Yourself"));
      rap.add(new Songs("Dino James","Unstoppable"));
      rap.add(new Songs("Baadshah","Mercy"));
      rap.add(new Songs("Chester Bennington","In The End"));
      rap.add(new Songs("Eminem","Godzila"));
      rap.add(new Songs("Dino James","Hancock"));
      rap.add(new Songs("Baadshah","Mercy"));
      rap.add(new Songs("Chester Bennington","In The End"));
      rap.add(new Songs("Eminem","Godzila"));
      rap.add(new Songs("Dino James","Hancock"));

      SongsAdapter songsAdapter = new SongsAdapter(this,rap);

      ListView listView = findViewById(R.id.rap_list);

      listView.setAdapter(songsAdapter);

      listView.setOnItemClickListener(this);

   }

   @Override
   public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

      Songs currentitem = (Songs) adapterView.getItemAtPosition(i);

      String SongForPlaying = currentitem.getSongName();
      String SongComposer = currentitem.getComposerName();

      Intent SongIntent = new Intent(this, PlayerActivity.class);
      SongIntent.putExtra("song", SongForPlaying);
      SongIntent.putExtra("composer", SongComposer);
      startActivity(SongIntent);


   }

}