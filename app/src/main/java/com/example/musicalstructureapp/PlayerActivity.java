package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_player);

      Intent opusIntent = getIntent();

      TextView SongNameTextView = findViewById(R.id.song_name_text);
      TextView ComposerNameTextView = findViewById(R.id.composer_name_text);

      String Song = opusIntent.getStringExtra("song");
      SongNameTextView.setText(Song);

      String Composer = opusIntent.getStringExtra("composer");
      ComposerNameTextView.setText(Composer);


   }

}