package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dto.VoterRequest;
import com.cg.votingapp.entity.VoterRequestEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.service.VoterRequestService;
import com.cg.votingapp.service.VoterRequestServiceImpl;

public class VoterRequestController {
	private static Logger logger = LogManager.getLogger(CandidateController.class.getName());
	VoterRequestService voterRequestService = new VoterRequestServiceImpl();
	
	/*public VoterRequestEntity addVoterRequest(VoterRequest voterrequest)
	{
		logger.info("Adding user");
		VoterRequestEntity v =voterRequestService.addVoterRequest(v);
	    return v;
	}*/
	
	public VoterRequestEntity viewVoterRequest(String constituency) throws RecordNotFoundException{
		logger.info("Viewing VoterRequest List");
		VoterRequestEntity voterRequest= null;
		try {
			voterRequest = voterRequestService.viewVoterRequest(constituency);
		}
		catch(Exception e) {
			logger.error("RecordNotFoundException: " + e);
			throw new RecordNotFoundException(e.getMessage());
		}
		return voterRequest;
    }

}
