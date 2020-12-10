package com.cg.votingapp.dao;
import com.cg.votingapp.exceptions.CandidateNotFoundException;
import com.cg.votingapp.exceptions.ElectionNotFoundException;
import com.cg.votingapp.exceptions.InvalidInputException;

//DAO Interface for Cast Vote
public interface ElectionCastVoteDAO
{	
	Boolean castVote(int electionId, int candidateId) throws CandidateNotFoundException,ElectionNotFoundException, InvalidInputException;
}
