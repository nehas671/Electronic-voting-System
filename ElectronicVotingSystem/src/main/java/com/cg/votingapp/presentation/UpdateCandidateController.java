package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import java.util.logging.Logger;

import com.cg.votingapp.dto.Candidate;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.service.UpdateCandiateServiceImpl;
import com.cg.votingapp.service.UpdateCandidateService;

public class UpdateCandidateController {
	private static Logger logger = LogManager.getLogger(UpdateCandidateController.class.getName());
	UpdateCandidateService updatecandidateService = new UpdateCandiateServiceImpl();
	
	
	public Candidate updateCandidateName(int candidate_id, String candidate_name) throws NullValueFoundException{
		logger.info("Updating Candidate List");
		Candidate candidate= null;
		try {
			candidate = updatecandidateService.updateCandidateName(candidate_id, candidate_name);
		}
		catch(Exception e) {
			logger.error("NullValueFoundException: " + e.getMessage());
			throw new NullValueFoundException(e.getMessage());
		}
		return candidate;
    }
	
	public Candidate updateAddress(int candidate_id, String address) throws NullValueFoundException{
		logger.info("Updating Candidate List");
		Candidate candidate= null;
		try {
			candidate = updatecandidateService.updateAddress(candidate_id, address);
		}
		catch(Exception e) {
			logger.error("NullValueFoundException: " + e);
			throw new NullValueFoundException(e.getMessage());
		}
		return candidate;
    }
	
	public Candidate updateAge(int candidate_id, int age) throws NullValueFoundException{
		logger.info("Updating Candidate List");
		Candidate candidate= null;
		try {
			candidate = updatecandidateService.updateAge(candidate_id, age);
		}
		catch(Exception e) {
			logger.error("NullValueFoundException: " + e);
			throw new NullValueFoundException(e.getMessage());
		}
		return candidate;
    }
	
	public Candidate updateContactDetails(int candidate_id, int contact_details) throws NullValueFoundException{
		logger.info("Updating Candidate List");
		Candidate candidate= null;
		try {
			candidate = updatecandidateService.updateContactDetails(candidate_id, contact_details);
		}
		catch(Exception e) {
			logger.error("NullValueFoundException: " + e);
			throw new NullValueFoundException(e.getMessage());
		}
		return candidate;
    }
}
