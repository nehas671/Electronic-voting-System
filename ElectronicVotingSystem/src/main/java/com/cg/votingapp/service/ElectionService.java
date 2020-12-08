package com.cg.votingapp.service;

import com.cg.votingapp.dto.Election;
import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.exceptions.ElectionNotFoundException;
import com.cg.votingapp.exceptions.ItemNotFoundException;


public interface ElectionService {
	void addElection(ElectionEntity entity) throws ElectionNotFoundException;
	
	
	Election findById(int itemId) throws ElectionNotFoundException, ItemNotFoundException;
}
