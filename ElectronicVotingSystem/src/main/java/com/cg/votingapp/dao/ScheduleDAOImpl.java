package com.cg.votingapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.VotingApp.entity.ScheduleEntity;

public class ScheduleDAOImpl implements ScheduleDAO{

	private static Logger logger = LogManager.getLogger(ScheduleDAOImpl.class.getName());	
	private static EntityManager entityManager;

	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("VotingAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	
	public void addSchedule(ScheduleEntity entity) {
		// TODO Auto-generated method stub
		logger.info("Schedule data start");
		entityManager.getTransaction().begin();
		logger.info("Schedule  begin persist");
		entityManager.merge(entity);
		logger.info("Election after persist");
		entityManager.getTransaction().commit();
		logger.info("Schedule data inserted successfully");
		
	}

}
