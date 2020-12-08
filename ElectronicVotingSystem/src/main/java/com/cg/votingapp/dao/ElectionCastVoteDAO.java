package com.cg.votingapp.dao;

import com.cg.votingapp.exceptions.CandidateNotFoundException;

public interface ElectionCastVoteDAO {
	
	void castVote(int candidateId) throws CandidateNotFoundException;
}
