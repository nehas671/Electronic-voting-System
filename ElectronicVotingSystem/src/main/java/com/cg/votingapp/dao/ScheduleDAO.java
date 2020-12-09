package com.cg.votingapp.dao;

import java.util.List;

import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.entity.ScheduleEntity;

public interface ScheduleDAO {
	public void addSchedule(ElectionEntity entity);
	public List<ScheduleEntity> viewSchedule();
}
