package com.cg.votingapp.dao;
import com.cg.votingapp.exceptions.CandidateNotFoundException;

//DAO Interface for Cast Vote
public interface ElectionCastVoteDAO
{	
	Boolean castVote(int candidateId) throws CandidateNotFoundException;
}
