package com.cg.votingapp.dao;

import com.cg.votingapp.exception.CandidateNotFoundException;

public interface ElectionCastVoteDAO {
	
	void castVote() throws CandidateNotFoundException;
}
