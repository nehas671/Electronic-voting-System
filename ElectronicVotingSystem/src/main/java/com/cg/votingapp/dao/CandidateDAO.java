package com.cg.votingapp.dao;

import com.cg.votingapp.entity.CandidateEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;

public interface CandidateDAO {
	public CandidateEntity addCandidate(CandidateEntity entity);
	CandidateEntity checkId(int candidateId) throws NullValueFoundException;
	CandidateEntity checkName(String candidateName) throws NullValueFoundException;
	public CandidateEntity viewCandidate(int candidate_id) throws RecordNotFoundException;
}