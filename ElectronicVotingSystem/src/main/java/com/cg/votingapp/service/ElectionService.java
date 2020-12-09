package com.cg.votingapp.service;


import com.cg.votingapp.dto.Election;

import com.cg.votingapp.entity.ElectionEntity;


import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.exceptions.InvalidStateException;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;




public interface ElectionService {
	void addElection(ElectionEntity entity) throws  InvalidStateException, RecordNotFoundException, NullValueFoundException;
	
	
	Election findById(int itemId) throws RecordNotFoundException;


	Boolean viewElection() throws RecordNotFoundException;


	Boolean viewElectionById(int election_id) throws NullValueFoundException;
}
