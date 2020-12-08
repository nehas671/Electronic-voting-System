package com.cg.votingapp.service;

import com.cg.votingapp.exceptions.CandidateNotFoundException;

public interface ElectionServiceCastVote {
	
	void castVote() throws CandidateNotFoundException;
}
