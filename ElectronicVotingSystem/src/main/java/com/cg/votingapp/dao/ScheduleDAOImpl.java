package com.cg.votingapp.dao;

import java.util.List;



import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




import com.cg.votingapp.entity.ElectionEntity;

import com.cg.votingapp.entity.ScheduleEntity;
import com.cg.votingapp.exceptions.ScheduleNotFound;

public class ScheduleDAOImpl implements ScheduleDAO{

	private static Logger logger = LogManager.getLogger(ScheduleDAOImpl.class.getName());	
	private static EntityManager entityManager;

	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("VotingAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	
	public boolean addSchedule() {
		// TODO Auto-generated method stub
		logger.info("Schedule data start");
	
		ScheduleEntity s=null;
		Query query=entityManager.createQuery("SELECT e.election_id,e.election_name,e.state,e.constituency,e.date FROM ElectionEntity e");
		List<Object[]> li=query.getResultList();
		for(Object[] obj : li) {
			int sid=(Integer) obj[0];
			String sname=(String) obj[1];
			String sstate=(String) obj[2];
			String sconstituency=(String) obj[3];
			String sdate=(String) obj[4];
			s=new ScheduleEntity(sdate,sid,sname,sstate,sconstituency);
			entityManager.getTransaction().begin();
			entityManager.merge(s);
			entityManager.getTransaction().commit();
			
		}
		logger.info("Schedule data inserted successfully");
		return true;
		
	}
	



	public boolean viewSchedule() {
		//Query query=entityManager.createQuery("SELECT DISTINCT s.schedule_id,s.date,s.election_id,s.election_name,s.state,s.constituency FROM ScheduleEntity s order by s.date,s.election_id");
		Query query=entityManager.createQuery("SELECT DISTINCT s FROM ScheduleEntity s ORDER BY s.date");

			List<ScheduleEntity> se=query.getResultList();
		
		for(ScheduleEntity schedule: se) {
			
			logger.info("Election Schedule:    "+schedule);
		}
		return true;
		
	}

	public ScheduleEntity viewScheduleById(int election_id) throws ScheduleNotFound {
		ScheduleEntity scheduleEntity = entityManager.find(ScheduleEntity.class, election_id);
		logger.info("Database returned Schedule Entity for id: " + scheduleEntity);
		if(scheduleEntity==null)
			throw new ScheduleNotFound("ItemId: " + election_id);
		return scheduleEntity;
	}




	







	/*public ScheduleEntity viewScheduleByState(String state) throws ScheduleNotFound {
		Query query=entityManager.createQuery("SELECT s FROM ScheduleEntity s");
		
		List<Object[]> se=query.getResultList();
		for(Object[] li: se) {
			if(li[2]==state)
				logger.info("Election Schedule of:    "+state+" "+li);
		}
		return (ScheduleEntity) se;
	}*/

}
