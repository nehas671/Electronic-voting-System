package com.cg.votingapp.dao;

public class VoterRequestServiceImpl implements VoterRequestService {
	
	private static Logger logger = LogManager.getLogger(VoterRequestImpl.class.getName());	
	VoterRequestDAO voterRequestDAO = new VoterRequestDAOImpl();
	
	public VoterRequest addVoterRequest(VoterRequest voterRequest){
	
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
		logger.info("User with Id" + entity.getUser_id()+ "is added");
		return entity;
	}
	
	public VoterRequestEntity checkId(int userId) throws NullValueFoundException {
		VoterRequestEntity voterRequestEntity = entityManager.find(VoterRequestEntity.class, userId);
		logger.info("Checking user with id: " + voterRequestEntity);
		if(voterRequestEntity==null)
			throw new NullValueFoundException("Voter Request Id: " + userId);
		return voterRequestEntity;
	}
	
	public VoterRequestEntity checkName(String userName) throws NullValueFoundException {
		String jpql = "SELECT voterRequest FROM VoterRequestEntity voterRequest where voterRequest.voterRequest_name=:pname";
		TypedQuery<VoterRequestEntity> query = entityManager.createQuery(jpql, VoterRequestEntity.class);
		query.setParameter("pname", userName);
		query.setMaxResults(1);
		VoterRequestEntity entity = query.getSingleResult();
		if (entity == null) {
			throw new NullValueFoundException("Not found");
		}
		return entity;
	}
	
	public VoterRequestEntity viewVoterRequest(int user_id) throws RecordNotFoundException {
		VoterRequestEntity entity = entityManager.find(VoterRequestEntity.class, user_id);
		Query query = entityManager.createQuery("SELECT v from VoterRequestEntity v");
		@SuppressWarnings("unchecked")
		List<VoterRequestEntity> list = (List<VoterRequestEntity>)query.getResultList();
	    logger.info("Voter Request List");
		for(VoterRequestEntity v: list) {
			System.out.println(v);
		}
		if(entity==null)
		{
			throw new RecordNotFoundException("User Id"+user_id);
		}
		return entity;
	}
}
