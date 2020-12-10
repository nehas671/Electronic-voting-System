package com.cg.votingapp.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.utils.CandidateUtils;
import com.cg.votingapp.utils.VoterRequestUtils;
import com.cg.votingapp.dao.VoterRequestDAO;
import com.cg.votingapp.dao.VoterRequestDAOImpl;
import com.cg.votingapp.dto.VoterRequest;
import com.cg.votingapp.entity.VoterIdEntity;
import com.cg.votingapp.entity.VoterRequestEntity;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VoterRequestServiceImpl implements VoterRequestService {
	
	private static Logger logger = LogManager.getLogger(VoterRequestServiceImpl.class.getName());	
	VoterRequestDAO voterRequestDAO = new VoterRequestDAOImpl();
	
	
	public VoterRequestEntity viewVoterRequest(int user_id) throws RecordNotFoundException {
		VoterRequestEntity VoterRequestEntity = voterRequestDAO.viewVoterRequest(user_id);
		logger.info("VoterRequestEntity: " + VoterRequestEntity);
		return VoterRequestEntity;
	}
	public VoterRequestEntity approveVoterRequest(int user_id) throws NullValueFoundException {
		VoterRequestEntity voterRequestEntity = voterRequestDAO.approveVoterRequest(user_id);
		logger.info("VoterRequestEntity: "+voterRequestEntity);
		return voterRequestEntity;
	}
	public VoterRequestEntity addVoterRequest(VoterRequestEntity voterRequestEntity) {
		// TODO Auto-generated method stub
		return null;
	}


}
