package com.cg.votingapp.presentation;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.exceptions.ResultNotFoundException;

public class DeclareResultControllerTest 
{

	private static DeclareResultControllerTest declareResultControllerTest;
	private static Logger logger;
	
	
	@BeforeClass
	public static void setUp()
	{
		logger = LogManager.getLogger(DeclareResultControllerTest.class.getName());
		declareResultControllerTest= new DeclareResultControllerTest();
	}
		
	@Test                         
	public void testDeclareResultInsertSuccess()throws ResultNotFoundException   //test Result data inserted successfully into resultEntity
	{
		logger.info("[Start] testDeclareResultInsertSuccess()");
		assertEquals("inserted Succesfully", ResultController.declareResult());
		logger.info("[End] testDeclareResultInsertSuccess()  ");
		
	}
		
	@Test(expected=ResultNotFoundException.class)   				
	public void testDeclareResultIdSearchFailure() throws ResultNotFoundException   //test ResultNotFounddException by passing Invalid ResultId
	{
		logger.info("[Start] testDeclareResultIdSearchFailure()");
		ResultController.findByResultId(109);
		logger.info("[END] estDeclareResultIdSearchFailure()");	
	}
	
	@Test
	public void testDeclareResultIdSearchSucess() throws ResultNotFoundException	//test NotNull by passing correct ResultId
	{
		logger.info("[Start] testDeclareResultIdSearchSucess()");
		assertNotNull(ResultController.findByResultId(198));
		logger.info("[END] testDeclareResultIdSearchSucess()");
	
	}
}
	
	
	
	
	
	
