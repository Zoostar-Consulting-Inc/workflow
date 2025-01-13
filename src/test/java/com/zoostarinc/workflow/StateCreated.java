package com.zoostarinc.workflow;

import java.util.List;

public class StateCreated implements State<Timesheet> {

	@Override
	public List<Action<Timesheet>> getActions() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "Created";
	}

}
