package com.zoostarinc.workflow.example.action;

import com.zoostarinc.workflow.Action;
import com.zoostarinc.workflow.example.Timesheet;
import com.zoostarinc.workflow.example.state.StateSubmitted;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ActionSubmit implements Action<Timesheet> {

	@Override
	public void execute(Timesheet timesheet) {
		submit(timesheet);
		log.info("Timesheet submitted: {}.", timesheet);
		timesheet.setState(new StateSubmitted());
	}

	protected void submit(Timesheet timesheet) {
		log.info("{}...", "Submitting timesheet");
	}

}
