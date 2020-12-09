package com.cg.votingapp.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.cg.votingapp.dao.ResultDAO;
import com.cg.votingapp.dao.ResultDAOImpl;
import com.cg.votingapp.dto.Election;
import com.cg.votingapp.dto.Result;
import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.entity.ResultEntity;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.exceptions.ResultNotFoundException;
import com.cg.votingapp.utils.ElectionUtils;
import com.cg.votingapp.utils.ResultUtils;


public class ResultServiceImpl implements ResultService  //Service Interface implementation class
{

	private static Logger logger = LogManager.getLogger(ResultServiceImpl.class.getName());
	ResultDAO resultDao = new ResultDAOImpl();
	public  String declareResult() throws ResultNotFoundException 
		{	
			
				String s="";
				logger.info("Declaring Result");
				s=resultDao.declareResult();    //calling declareResult from ResultDaoImpl class 
				return s;
				
		}
	
	public Result findByResultId(int result_id) throws ResultNotFoundException
		{
			ResultEntity resultEntity;
			resultEntity= resultDao.findByResultId(result_id);  //calling method from ResultDaoImpl class
			logger.info("ResultEntity:" +resultEntity);
		return  ResultUtils.convertResultEntityIntoResult(resultEntity);   // converting ResultEntity into Result
		}
}
