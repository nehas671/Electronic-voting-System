package com.cg.votingapp.dao;

<<<<<<< HEAD
import java.util.List;

import com.cg.votingapp.entity.ElectionEntity;
=======
>>>>>>> branch 'master' of https://github.com/nehas671/Electronic-voting-System
import com.cg.votingapp.entity.ScheduleEntity;

public interface ScheduleDAO {
	public void addSchedule(ElectionEntity entity);
	public List<ScheduleEntity> viewSchedule();
}
