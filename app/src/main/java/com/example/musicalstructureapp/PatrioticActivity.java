package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PatrioticActivity extends AppCompatActivity implements ListView.OnItemClickListener {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_patriotic);

      ArrayList<Songs> patriotic = new ArrayList<Songs>();

      patriotic.add(new Songs("Kesari","Teri Mitti"));
      patriotic.add(new Songs("A.R.Rehmaan","Maa Tujhe Salaam"));
      patriotic.add(new Songs("Raazi","Aye Watan"));
      patriotic.add(new Songs("Border","Sandeshe Aate Hain"));
      patriotic.add(new Songs("Swadesh","Ye Jo Desh Hai Tera"));
      patriotic.add(new Songs("Rang De Basanti","Luka Chhupi"));
      patriotic.add(new Songs("Kesari","Teri Mitti"));
      patriotic.add(new Songs("A.R.Rehmaan","Maa Tujhe Salaam"));
      patriotic.add(new Songs("Raazi","Aye Watan"));
      patriotic.add(new Songs("Border","Sandeshe Aate Hain"));
      patriotic.add(new Songs("Swadesh","Ye Jo Desh Hai Tera"));
      patriotic.add(new Songs("Rang De Basanti","Luka Chhupi"));

      SongsAdapter songsAdapter = new SongsAdapter(this,patriotic);

      ListView listView = findViewById(R.id.patriotic_list);

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