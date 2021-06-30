package com.te.springboot.music.controller.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.springbooot.beans.MusicResponse;

@RestControllerAdvice
public class MusicControllerAdvice {
	
	@ExceptionHandler(MusicException.class)
	public MusicResponse handleMusicException(MusicException exception) {
		
		MusicResponse response  = new MusicResponse();
		response.setStatus(404);
		response.setMsg("failure");
		return response;
	}
	

}
