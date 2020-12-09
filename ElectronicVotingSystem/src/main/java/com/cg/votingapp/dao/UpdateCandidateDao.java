package com.cg.votingapp.dao;

import com.cg.votingapp.entity.CandidateEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;

public interface UpdateCandidateDao {
	public CandidateEntity updateCandidateName(int candidate_id, String candidate_name) throws NullValueFoundException ;
	public CandidateEntity updateAddress(int candidate_id, String address) throws NullValueFoundException ;
	public CandidateEntity updateAge(int candidate_id, int age) throws NullValueFoundException ;
	public CandidateEntity updateContactDetails(int candidate_id, int contact_details) ;

}
