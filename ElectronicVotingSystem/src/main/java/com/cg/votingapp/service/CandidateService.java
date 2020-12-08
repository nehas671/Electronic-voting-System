package com.cg.votingapp.service;

import com.cg.votingapp.dto.Candidate;
//import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.entity.CandidateEntity;

public interface CandidateService {
	Candidate addCandidate(Candidate candidate);
	//List<CandidateEntity> viewCandidate();  
}

