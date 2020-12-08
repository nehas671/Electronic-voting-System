package com.cg.votingapp.utils;

import com.cg.votingapp.dto.Election;
import com.cg.votingapp.dto.Result;
import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.entity.ResultEntity;

public class ResultUtils {

	
	public static ResultEntity convertResultIntoResultEntity(Result result) {
		return new ResultEntity( result.getResult_id(), result.getElection_id(), result.getState(), result.getDate(),result.getCandidate_id(),result.getCandidate_name(),result.getParty_name(),result.getVotes());
	}
		
	public static Result convertResultEntityIntoResult(ResultEntity resultEntity) {
		return new Result(resultEntity.getResult_id(),resultEntity.getElection_id(),resultEntity.getState(),resultEntity.getDate(),resultEntity.getCandidate_id(),resultEntity.getCandidate_name(),resultEntity.getParty_name(),resultEntity.getVotes());
	}
	
	
}
