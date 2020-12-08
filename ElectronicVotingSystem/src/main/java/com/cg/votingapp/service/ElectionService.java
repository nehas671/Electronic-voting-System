package com.cg.votingapp.service;

<<<<<<< HEAD
import com.cg.VotingApp.dto.Election;

import com.cg.VotingApp.entity.ElectionEntity;
import com.cg.VotingApp.exception.ElectionNotFoundException;
import com.cg.VotingApp.exception.ItemNotFoundException;
=======
import com.cg.votingapp.dto.Election;
import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.exceptions.RecordNotFoundException;

>>>>>>> branch 'master' of https://github.com/nehas671/Electronic-voting-System


public interface ElectionService {
	void addElection(ElectionEntity entity) throws RecordNotFoundException;
	
	
	Election findById(int itemId) throws RecordNotFoundException;
}
