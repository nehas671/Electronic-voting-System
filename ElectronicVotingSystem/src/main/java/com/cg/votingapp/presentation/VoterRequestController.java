package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dto.VoterId;
import com.cg.votingapp.dto.VoterRequest;
import com.cg.votingapp.entity.VoterIdEntity;
import com.cg.votingapp.entity.VoterRequestEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.service.VoterRequestService;
import com.cg.votingapp.service.VoterRequestServiceImpl;

public class VoterRequestController {
	private static Logger logger = LogManager.getLogger(CandidateController.class.getName());
	VoterRequestService voterRequestService = new VoterRequestServiceImpl();
	
	public VoterRequest addVoterRequest(VoterRequest voterRequest)
	{
		logger.info("Adding user");
		VoterRequest v =voterRequestService.addVoterRequest(voterRequest);
	    return v;
	}
	
	public VoterRequestEntity viewVoterRequest(int user_id) throws RecordNotFoundException{
		logger.info("Viewing VoterRequest List");
		VoterRequestEntity voterRequest= null;
		try {
			voterRequest = voterRequestService.viewVoterRequest(user_id);
		}
		catch(Exception e) {
			logger.error("RecordNotFoundException: " + e);
			throw new RecordNotFoundException(e.getMessage());
		}
		return voterRequest;
    }
	public VoterRequestEntity approveVoterRequest(int user_id) throws NullValueFoundException {
		logger.info("Approving VoterRequest");
		VoterRequestEntity voterRequest = null;
		try {
			voterRequest = voterRequestService.approveVoterRequest(user_id);
		}
		catch(Exception e) {
			logger.error("NullvalueFoundException:"+ e);
			throw new NullValueFoundException(e.getMessage());

		}
		return voterRequest;
	}

}
