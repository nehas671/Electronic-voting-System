package com.cg.votingapp.dao;

import com.cg.votingapp.entity.CandidateEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;

public interface CandidateDAO {
	public CandidateEntity addCandidate(CandidateEntity entity);
	CandidateEntity checkId(int candidateId) throws NullValueFoundException;
	CandidateEntity checkName(String candidateName) throws NullValueFoundException;
	boolean viewCandidate();
	//public List<CandidateEntity> viewCandidate();

}
