package com.zoostarinc.workflow.example;

import com.zoostarinc.workflow.State;
import com.zoostarinc.workflow.Workflowable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@ToString
public class Timesheet implements Workflowable<Timesheet> {

	private State<Timesheet> state;
	
	public Timesheet() {
		this.state = AbstractTimesheetState.STATE_NEW;
	}
	
}
