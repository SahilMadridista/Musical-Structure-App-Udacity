package com.example.musicalstructureapp;

public class Songs {

   public String composerName;
   public String songName;

   public Songs(String composerName, String songName) {
      this.composerName = composerName;
      this.songName = songName;
   }

   public String getComposerName() {
      return composerName;
   }

   public String getSongName() {
      return songName;
   }

}
