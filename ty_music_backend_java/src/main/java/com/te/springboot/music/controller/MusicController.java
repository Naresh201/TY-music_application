package com.te.springboot.music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.springbooot.beans.Music;
import com.te.springbooot.beans.MusicResponse;
import com.te.springboot.music.controller.advice.MusicControllerAdvice;
import com.te.springboot.music.services.MusicServices;

@RestController
public class MusicController  extends MusicControllerAdvice{
	
	@Autowired
	MusicServices services;
	
@GetMapping( path = "/musicapp", produces = {MediaType.APPLICATION_JSON_VALUE})
	public MusicResponse getPlayaSong() {
	
	MusicResponse response = new MusicResponse();
	
	 List<Music>  musicbeans =  services.getMusic();
	 
	 if(musicbeans != null) {
	 response.setMusicbeans(musicbeans);
	 response.setMsg("sucess");
	 response.setStatus(200);
	 }else {
		response.setStatus(404);
		response.setMsg("failed to fetch the data");
	 }
		return response;
	}

 @GetMapping(path="/musicapp/serarchsong{song_Id} ", produces= {MediaType.APPLICATION_JSON_VALUE})
    public MusicResponse getMusicByName() {
	 
	 MusicResponse response = new MusicResponse();
		
	 List<Music>  musicbeans =  services.getMusic();
	 
	 if(musicbeans != null) {
	 response.setMusicbeans(musicbeans);
	 response.setMsg("sucess");
	 response.setStatus(200);
	 }else {
		response.setStatus(404);
		response.setMsg("failed to fetch the data");
	 }
		return response;
	 
	 
	 
    	
    }

}
