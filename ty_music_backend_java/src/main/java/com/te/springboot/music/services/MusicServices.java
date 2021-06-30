package com.te.springboot.music.services;

import java.util.List;

import com.te.springbooot.beans.Music;

public interface MusicServices {
	
	
	public List<Music> getMusic();
	
	public Music getMusicByName(String song_Id);

}
