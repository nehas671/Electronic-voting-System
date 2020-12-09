package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dto.Election;
import com.cg.votingapp.dto.Result;
import com.cg.votingapp.entity.ResultEntity;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.exceptions.ResultNotFoundException;
import com.cg.votingapp.service.ResultService;
import com.cg.votingapp.service.ResultServiceImpl;



public class ResultController
{
	private static Logger logger = LogManager.getLogger(ResultController.class.getName());
	static ResultService resultService=new ResultServiceImpl();        //Service Interface implimentation class object
	public static String declareResult() throws ResultNotFoundException   
	{
		String s="";
		logger.info("Adding result");
		try
			{
				s=resultService.declareResult();          //calling declareResult from ServiceImpl class
			}
		catch(Exception e)
			{
				logger.error("ResultNotFoundException: " + e); 
				throw new ResultNotFoundException(e.getMessage());   //if no result found throw ResultNotFoundException
			}
		return s;
	}

	public static Result findByResultId(int result_id) throws ResultNotFoundException
		{
			logger.info("Finding result by id: " + result_id);
			Result result = null;
			try
				{
					result = resultService.findByResultId(result_id);  //finding result id 
				}
			catch(Exception e)                     //if no result id found throw ResultNotFoundException
				{
					logger.error("ItemNotFoundException: " + e);
					throw new ResultNotFoundException(e.getMessage());
				}
		return result;
		}
}



