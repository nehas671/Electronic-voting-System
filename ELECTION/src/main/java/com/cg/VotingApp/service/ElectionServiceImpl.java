

package com.cg.VotingApp.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.cg.VotingApp.dao.ElectionDAO;
import com.cg.VotingApp.dao.ElectionDAOImpl;
import com.cg.VotingApp.dto.Election;
import com.cg.VotingApp.entity.ElectionEntity;
import com.cg.VotingApp.exception.ElectionNotFoundException;
import com.cg.VotingApp.presentation.ElectionController;
import com.cg.VotingApp.utils.ElectionUtils;



public class ElectionServiceImpl implements ElectionService {
	
	private static Logger logger;
	


ElectionDAO electionDAO = new ElectionDAOImpl();

public void addElection(ElectionEntity entity)
{
	logger = LogManager.getLogger(ElectionServiceImpl.class.getName());
	logger.info("addddiggg");
	
	 electionDAO.addElection(entity);
	//logger.info("ElectionEntity: " + Electionentity);
	//return ElectionUtils.convertElectionEntityIntoElection(Electionentity);
}

}