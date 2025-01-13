package com.zoostarinc.workflow.example;

import com.zoostarinc.workflow.State;
import com.zoostarinc.workflow.example.state.StateCreated;
import com.zoostarinc.workflow.example.state.StateNew;

public abstract class AbstractTimesheetState {

	public static final State<Timesheet> STATE_NEW = new StateNew();
	public static final State<Timesheet> STATE_CREATED = new StateCreated();
	
	private AbstractTimesheetState() {
		
	}
}
