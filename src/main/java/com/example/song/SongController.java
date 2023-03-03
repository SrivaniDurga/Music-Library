/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.song;
import com.example.song.SongService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.*;

@RestController
public class SongController{
    SongService ss = new SongService();
    @GetMapping("/songs")
    public ArrayList<Song> getSongs(){
        return ss.getSongs();
    }
    @GetMapping("/songs/{songId}")
    public Song getSongsById(@PathVariable ("songId") int songId){
        return ss.getSongsById(songId);
    }
    @PostMapping("/songs")
    public Song addSongs(@RequestBody Song song){
        return ss.addSongs(song);
    }
    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable ("songId") int songId , @RequestBody Song song){
        return ss.updateSong(songId, song);
    }
    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable ("songId") int songId){
        ss.deleteSong(songId);
    }
}