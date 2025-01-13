package com.zoostarinc.workflow.example.state;

import java.util.ArrayList;
import java.util.Collection;

import com.zoostarinc.workflow.Action;
import com.zoostarinc.workflow.State;
import com.zoostarinc.workflow.example.Timesheet;
import com.zoostarinc.workflow.example.action.ActionSave;
import com.zoostarinc.workflow.example.action.ActionSubmit;

public class StateNew implements State<Timesheet> {
	
	@Override
	public Collection<Action<Timesheet>> getActions() {
		var actions = new ArrayList<Action<Timesheet>>();
		actions.add(new ActionSave());
		actions.add(new ActionSubmit());
		return actions;
	}
	
	@Override
	public String toString() {
		return "New";
	}

}
