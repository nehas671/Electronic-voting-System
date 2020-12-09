package com.cg.votingapp.dao;

import com.cg.votingapp.entity.CandidateEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;

public interface CandidateDAO {
	CandidateEntity addCandidate(CandidateEntity entity);
	CandidateEntity checkId(int candidateId) throws NullValueFoundException;
	CandidateEntity checkName(String candidateName) throws NullValueFoundException;
	CandidateEntity viewCandidate(int candidate_id) throws RecordNotFoundException;
}