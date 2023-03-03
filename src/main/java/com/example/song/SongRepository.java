package com.example.song;
import java.util.*;

public interface SongRepository{
    public ArrayList<Song> getSongs();
    public Song getSongsById(int songId);
    public Song addSongs(Song song);
    public Song updateSong(int songId , Song song);
    public void deleteSong(int songId);
}