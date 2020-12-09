package com.cg.votingapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.entity.ResultEntity;
import com.cg.votingapp.exceptions.ResultNotFoundException;

public class ViewResultDAOImpl implements ViewResultDAO {
	
	
	private static Logger logger = LogManager.getLogger(ViewResultDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("VotingAppPU");
		entityManager = entityManagerFactory.createEntityManager();
		
	}

	public boolean viewResult() throws ResultNotFoundException {
		// TODO Auto-generated method stub
		
		Query query = entityManager.createQuery("Select result from ResultEntity result");
		
		List<ResultEntity> resultlist = query.getResultList();
		for(ResultEntity result : resultlist) {
			
			logger.info("Result Display" +result);
		}
		
		return true;
	}

}
