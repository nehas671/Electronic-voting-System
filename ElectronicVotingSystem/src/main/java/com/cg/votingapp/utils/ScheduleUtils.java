package com.cg.votingapp.utils;

import com.cg.votingapp.dto.Schedule;
import com.cg.votingapp.entity.ScheduleEntity;

public class ScheduleUtils {
	public static ScheduleEntity convertScheduleIntoScheduleEntity(Schedule schedule) {
		return new ScheduleEntity(schedule.getSchedule_id(),schedule.getDate(),schedule.getElection_id(),schedule.getElection_name(),schedule.getState(),schedule.getConstituency());
	}
	public static Schedule convertScheduleEntityIntoSchedule(ScheduleEntity scheduleEntity) {
		return new Schedule(scheduleEntity.getSchedule_id(),scheduleEntity.getDate(),scheduleEntity.getElection_id(),scheduleEntity.getElection_name(),scheduleEntity.getState(),scheduleEntity.getConstituency());
		
	}
}
