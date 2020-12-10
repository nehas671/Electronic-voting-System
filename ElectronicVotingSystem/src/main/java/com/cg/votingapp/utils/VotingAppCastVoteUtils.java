package com.cg.votingapp.utils;

import com.cg.votingapp.dto.Elections;
import com.cg.votingapp.entity.ElectionsEntity;

public class VotingAppCastVoteUtils
{
		public static ElectionsEntity convertItemIntoItemEntity(Elections election)
		{
			return new ElectionsEntity(election.getElection_id(), election.getElection_name(), election.getState(), election.getConstituency(), election.getDate());
		}

		public static Elections convertItemEntityIntoItem(ElectionsEntity electionEntity)
		{
			return new Elections(electionEntity.getElectionId(),electionEntity.getElectionName(),electionEntity.getState(),electionEntity.getConstituency(),electionEntity.getDate());
		}
}