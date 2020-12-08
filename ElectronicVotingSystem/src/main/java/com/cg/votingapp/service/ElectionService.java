package com.cg.votingapp.service;

import com.cg.VotingApp.dto.Election;

import com.cg.VotingApp.entity.ElectionEntity;
import com.cg.VotingApp.exception.ElectionNotFoundException;
import com.cg.VotingApp.exception.ItemNotFoundException;


public interface ElectionService {
	void addElection(ElectionEntity entity) throws ElectionNotFoundException;
	
	
	Election findById(int itemId) throws ElectionNotFoundException, ItemNotFoundException;
}
