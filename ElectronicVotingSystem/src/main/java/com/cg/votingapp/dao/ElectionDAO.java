package com.cg.votingapp.dao;

import com.cg.votingapp.entity.ElectionEntity;

import com.cg.votingapp.exceptions.ItemNotFoundException;

public interface ElectionDAO {

	
	public void addElection(ElectionEntity entity);
	
	ElectionEntity findById(int ElectionId) throws ItemNotFoundException;
}
