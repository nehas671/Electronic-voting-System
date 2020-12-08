package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.cg.votingapp.entity.ResultEntity;
import com.cg.votingapp.exceptions.ResultNotFoundException;
import com.cg.votingapp.service.ResultService;
import com.cg.votingapp.service.ResultServiceImpl;



public class ResultController {

	private static Logger logger = LogManager.getLogger(ResultController.class.getName());
ResultService resultService=new ResultServiceImpl();

public void declareResult() throws ResultNotFoundException
{
	
	logger.info("Adding result");
	try
	{
		resultService.declareResult();
	}
	catch(Exception e)
	{
		logger.error("ResultNotFoundException: " + e);
		throw new ResultNotFoundException(e.getMessage());
	}
	
		
	}
}



