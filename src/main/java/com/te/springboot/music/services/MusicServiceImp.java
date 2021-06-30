package com.te.springboot.music.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springbooot.beans.Music;
import com.te.springboot.music.dao.MusicServiceDao;


@Service
public class MusicServiceImp implements MusicServices {

	   @Autowired
	   MusicServiceDao dao;
	
	   @Override
	public List<Music> getMusic(){
		return dao.getMusic();
	}

	@Override
	public Music getMusicByName(String song_Id) {
		return dao.getMusicByName(song_Id);
	}

}
