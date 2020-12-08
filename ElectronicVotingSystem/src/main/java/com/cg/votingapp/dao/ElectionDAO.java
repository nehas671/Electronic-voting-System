package com.cg.votingapp.dao;

import com.cg.VotingApp.entity.ElectionEntity;

import com.cg.VotingApp.exception.ItemNotFoundException;

public interface ElectionDAO {

	
	public void addElection(ElectionEntity entity);
	
	ElectionEntity findById(int ElectionId) throws ItemNotFoundException;
}
