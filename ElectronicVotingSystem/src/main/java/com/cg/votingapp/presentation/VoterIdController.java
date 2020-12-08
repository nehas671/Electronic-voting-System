package com.cg.votingapp.presentation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dto.VoterId;
import com.cg.votingapp.exceptions.*;
import com.cg.votingapp.service.VoterIdService;
import com.cg.votingapp.service.VoterIdServiceImpl;

public class VoterIdController {
	
	private  static Logger logger = LogManager.getLogger(VoterIdController.class.getName());
	VoterIdService voterIdService = new VoterIdServiceImpl();

	public VoterId findByUserId(int user_id) throws UserNotFoundException {
		logger.info("Finding voter id for userId: " + user_id);
		VoterId voterId = null;
		try {
			voterId = voterIdService.findByUserId(user_id);
		}
		catch(Exception e) {
			logger.error("UserNotFoundException: " + e);
			throw new UserNotFoundException(e.getMessage());
		}
		return voterId;
	}
}
