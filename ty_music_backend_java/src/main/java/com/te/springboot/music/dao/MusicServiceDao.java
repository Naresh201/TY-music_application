package com.te.springboot.music.dao;

import java.util.List;

import com.te.springbooot.beans.Music;

public interface MusicServiceDao {
	
	
	public List<Music> getMusic();
	
	public Music getMusicByName(String song_Id);

}
