package com.te.springboot.music.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.springbooot.beans.Music;

@Repository
public class MusicServiceDaoImp implements MusicServiceDao {
	
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	@Override
	public List<Music> getMusic() {
		
		List<Music> musicbeans = null;
		try {
			    EntityManager manager  = entityManagerFactory.createEntityManager();
				Query query = manager.createQuery("from Music");
				musicbeans = query.getResultList();
			} catch (Exception e) {
				musicbeans = null;
				e.printStackTrace();
			}
		return musicbeans;
	}

	@Override
	public Music getMusicByName(String song_Id) {
		
		Music music = null;
		
		try {
		    EntityManager manager  = entityManagerFactory.createEntityManager();
			Query query = manager.createQuery("from Music where song_Id=:id ");
			query.setParameter("id",song_Id);	
            music = (Music) query.getSingleResult();
		} catch (Exception e) {
			music = null;
			e.printStackTrace();
		}
		return music;
	}

}
