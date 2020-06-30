package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ClassicalActivity extends AppCompatActivity implements ListView.OnItemClickListener{

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_classical);

      ArrayList<Songs> classics = new ArrayList<Songs>();

      classics.add(new Songs("Radhamohan Tarang","Sangeet Tarang"));
      classics.add(new Songs("Somnath","Raag Bodh"));
      classics.add(new Songs("Raja Bhoja","Shringar Prakash"));
      classics.add(new Songs("Narad","Nari Shiksha"));
      classics.add(new Songs("Parshva Deva","Sangeet Samay Saar"));
      classics.add(new Songs("Abhinav Gupta","Lochan Teeka"));
      classics.add(new Songs("Narad","Sangeet Makarand"));
      classics.add(new Songs("Bhava Bhatta","Shruti Bhaskar"));
      classics.add(new Songs("Sharang Deva","Sangeet Ratnakar"));
      classics.add(new Songs("Kallinath","Sangeet Ratnakar Teeka"));
      classics.add(new Songs("Narad","Nari Shiksha"));
      classics.add(new Songs("Parshva Deva","Sangeet Samay Saar"));
      classics.add(new Songs("Abhinav Gupta","Lochan Teeka"));
      classics.add(new Songs("Narad","Sangeet Makarand"));

      SongsAdapter songsAdapter = new SongsAdapter(this,classics);

      ListView listView = findViewById(R.id.classical_list);

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