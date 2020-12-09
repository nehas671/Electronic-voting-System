package com.cg.votingapp.dao;

import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.exceptions.InvalidStateException;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;

public interface ElectionDAO {

	
	public void addElection(ElectionEntity entity) throws  InvalidStateException;
	
	ElectionEntity findById(int ElectionId) throws RecordNotFoundException;
	
	boolean viewElection();
	
	boolean viewElectionById(int election_id) throws  NullValueFoundException;
}
