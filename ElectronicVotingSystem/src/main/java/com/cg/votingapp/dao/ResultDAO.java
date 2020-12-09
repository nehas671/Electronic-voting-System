package com.cg.votingapp.dao;
import javax.persistence.EntityManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.entity.ResultEntity;
import com.cg.votingapp.exceptions.*;

public interface ResultDAO 
{                        	
	ResultEntity findByResultId(int result_id) throws ResultNotFoundException;	//method to find resultid
	public String declareResult() throws ResultNotFoundException;  //method to estimate result and insert into result table
}
