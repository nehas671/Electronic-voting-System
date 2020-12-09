package com.cg.votingapp.dao;

import com.cg.votingapp.entity.CandidateEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;

public interface CandidateDAO {
	public CandidateEntity addCandidate(CandidateEntity entity);
	CandidateEntity checkId(int candidateId) throws NullValueFoundException;
	CandidateEntity checkName(String candidateName) throws NullValueFoundException;
	boolean viewCandidate();
	//public List<CandidateEntity> viewCandidate();
	public CandidateEntity updateCandidateName(int candidate_id, String candidate_name) throws NullValueFoundException ;
	public CandidateEntity updateAddress(int candidate_id, String address) throws NullValueFoundException ;
	public CandidateEntity updateAge(int candidate_id, int age) throws NullValueFoundException ;
	public CandidateEntity updateContactDetails(int candidate_id, int contact_details) ;

}
