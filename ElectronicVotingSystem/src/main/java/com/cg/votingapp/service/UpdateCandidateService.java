package com.cg.votingapp.service;

import com.cg.votingapp.dto.Candidate;
import com.cg.votingapp.exceptions.NullValueFoundException;

public interface UpdateCandidateService {
	Candidate updateCandidateName(int candidate_id, String candidate_name) throws NullValueFoundException ;
	Candidate updateAddress(int candidate_id, String address) throws NullValueFoundException ;
	Candidate updateAge(int candidate_id, int age) throws NullValueFoundException ;
	Candidate updateContactDetails(int candidate_id, int contact_details) ;
}
