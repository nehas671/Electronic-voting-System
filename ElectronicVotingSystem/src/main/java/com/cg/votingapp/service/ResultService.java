package com.cg.votingapp.service;

import com.cg.votingapp.dto.Election;
import com.cg.votingapp.dto.Result;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.exceptions.ResultNotFoundException;

public interface ResultService    //Service interface
{
	String  declareResult() throws ResultNotFoundException;    
	Result findByResultId(int result_id) throws ResultNotFoundException;	
}
