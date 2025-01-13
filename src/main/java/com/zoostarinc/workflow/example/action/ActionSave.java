package com.zoostarinc.workflow.example.action;

import com.zoostarinc.workflow.Action;
import com.zoostarinc.workflow.example.Timesheet;
import com.zoostarinc.workflow.example.state.StateCreated;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ActionSave implements Action<Timesheet> {

	@Override
	public void execute(Timesheet timesheet) {
		save(timesheet);
		log.info("Timesheet saved: {}.", timesheet);
		timesheet.setState(new StateCreated());
	}

	protected void save(Timesheet timesheet) {
		log.info("{}...", "Saving timesheet");
	}
	
	@Override
	public String toString() {
		return "Save";
	}

}
