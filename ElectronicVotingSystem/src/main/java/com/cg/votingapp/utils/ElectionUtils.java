package com.cg.votingapp.utils;

import com.cg.votingapp.dto.Election;
import com.cg.votingapp.entity.ElectionEntity;

public class ElectionUtils {

	
		public static ElectionEntity convertElectionIntoElectionEntity(Election election) {
			return new ElectionEntity(election.getElection_id(), election.getElection_name(), election.getState(), election.getConstituency(), election.getDate());
		}
		public static Election convertElectionEntityIntoElection(ElectionEntity electionEntity) {
			return new Election(electionEntity.getElection_id(), electionEntity.getElection_name(), electionEntity.getState(), electionEntity.getConstituency(), electionEntity.getDate());
		}
		
		
		
	
}
