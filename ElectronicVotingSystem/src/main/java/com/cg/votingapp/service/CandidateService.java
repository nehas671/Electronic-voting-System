package com.cg.votingapp.service;

import com.cg.votingapp.dto.Candidate;
//import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.entity.CandidateEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;

public interface CandidateService {
	Candidate addCandidate(Candidate candidate);
	Candidate checkId(int candidateId) throws NullValueFoundException;
	//List<CandidateEntity> viewCandidate();  
}

