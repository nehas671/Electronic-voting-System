package com.cg.VotingApp.service;

import com.cg.VotingApp.dto.Election;
import com.cg.VotingApp.entity.ElectionEntity;

public interface ElectionService {
	void addElection(ElectionEntity entity);
}
