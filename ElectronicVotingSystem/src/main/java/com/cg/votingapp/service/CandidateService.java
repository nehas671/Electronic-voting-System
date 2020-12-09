package com.cg.votingapp.service;

import com.cg.votingapp.dto.Candidate;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.exceptions.NullValueFoundException;

public interface CandidateService {
	Candidate addCandidate(Candidate candidate);
	Candidate checkId(int candidateId) throws NullValueFoundException;
	Candidate checkName(String candidateName) throws NullValueFoundException;
	Candidate viewCandidate(int candidate_id) throws RecordNotFoundException;
}

