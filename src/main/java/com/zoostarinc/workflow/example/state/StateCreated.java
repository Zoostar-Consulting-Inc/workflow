package com.zoostarinc.workflow.example.state;

import java.util.List;

import com.zoostarinc.workflow.Action;
import com.zoostarinc.workflow.State;
import com.zoostarinc.workflow.example.Timesheet;

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
