package com.cg.votingapp.service;

import com.cg.votingapp.dto.Candidate;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.entity.CandidateEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;

public interface CandidateService {
	Candidate addCandidate(Candidate candidate);
	Candidate checkId(int candidateId) throws NullValueFoundException;
	Candidate checkName(String candidateName) throws NullValueFoundException;
	Candidate viewCandidate(int candidate_id) throws RecordNotFoundException;
	Candidate updateCandidateName(int candidate_id, String candidate_name) throws NullValueFoundException ;
	Candidate updateAddress(int candidate_id, String address) throws NullValueFoundException ;
	Candidate updateAge(int candidate_id, int age) throws NullValueFoundException ;
	Candidate updateContactDetails(int candidate_id, int contact_details) ;
}

