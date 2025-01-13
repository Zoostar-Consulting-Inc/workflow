package com.zoostarinc.workflow;

public abstract class AbstractTimesheetState {

	public static final State<Timesheet> STATE_NEW = new StateNew();
	public static final State<Timesheet> STATE_CREATED = new StateCreated();
	
	private AbstractTimesheetState() {
		
	}
}
