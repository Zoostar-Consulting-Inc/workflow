package com.zoostarinc.workflow;

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
	
	public static void main(String[] args) {
		var timesheet = new Timesheet();
		log.info("New Timesheet created: {}", timesheet);
		
		var state = timesheet.getState();
		log.info("Timesheet state: {}", state);
		
		var actions = state.getActions();
		log.info("{} Timesheet has {} actions.", timesheet, actions.size());
		
		for(var action : actions) {
			log.info("Action: {}", action);
			action.execute(timesheet);
			log.info("Timesheet: {}", timesheet);
		}
	}

}
