package com.cg.votingapp.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dao.VoterIdDAO;
import com.cg.votingapp.dao.VoterIdDAOImpl;
//import com.cg.votingapp.dto.VoterId;
//import com.cg.votingapp.entity.VoterIdEntity;
import com.cg.votingapp.exceptions.*;
//import com.cg.votingapp.presentation.VoterIdController;
//import com.cg.votingapp.utils.VoterIdUtils;

public class VoterIdServiceImpl implements VoterIdService{
	private  static Logger logger = LogManager.getLogger(VoterIdServiceImpl.class.getName());
	VoterIdDAO voterIdDao = new VoterIdDAOImpl();
	
	public String findByUserId(int user_id) throws UserNotFoundException {
		String VoterIdEntity = voterIdDao.findByUserId(user_id);
		logger.info("VoterIdEntity: " + VoterIdEntity);
		return VoterIdEntity;
	}
	public String findByReqId(int request_id) throws ReqNotFoundException {
		String VoterIdEntity = voterIdDao.findByReqId(request_id);
		logger.info("VoterIdEntity: " + VoterIdEntity);
		return VoterIdEntity;
	}


	}


