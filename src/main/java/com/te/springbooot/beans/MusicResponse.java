package com.te.springbooot.beans;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.te.springboot.music.services.MusicServices;

import lombok.Data;


@SuppressWarnings("serial")
@Data
@JsonRootName("response")
public class MusicResponse  implements Serializable{
	
	@JsonProperty("status")
	private int status;

	private String msg;
	
	private List<Music> musicbeans;

	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<Music> getMusicbeans() {
		return musicbeans;
	}

	public void setMusicbeans(List<Music> musicbeans) {
		this.musicbeans = musicbeans;
	}
	
}
