package com.cg.votingapp.service;


import com.cg.votingapp.dto.Election;

import com.cg.votingapp.entity.ElectionEntity;


import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.exceptions.RecordNotFoundException;




public interface ElectionService {
	void addElection(ElectionEntity entity) throws RecordNotFoundException;
	
	
	Election findById(int itemId) throws RecordNotFoundException;
}
