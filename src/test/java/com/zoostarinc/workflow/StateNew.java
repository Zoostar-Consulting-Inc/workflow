package com.zoostarinc.workflow;

import java.util.ArrayList;
import java.util.Collection;

public class StateNew implements State<Timesheet> {
	
	@Override
	public Collection<Action<Timesheet>> getActions() {
		var actions = new ArrayList<Action<Timesheet>>();
		actions.add(new ActionSave());
		return actions;
	}
	
	@Override
	public String toString() {
		return "New";
	}

}
