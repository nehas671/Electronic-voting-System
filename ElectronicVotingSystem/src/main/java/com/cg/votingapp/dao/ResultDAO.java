package com.cg.votingapp.dao;

import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.entity.ResultEntity;
import com.cg.votingapp.exceptions.ResultNotFoundException;

public interface ResultDAO {

	public String declareResult() throws ResultNotFoundException;
	ResultEntity findByResultId(int result_id) throws ResultNotFoundException;
	
	
}
