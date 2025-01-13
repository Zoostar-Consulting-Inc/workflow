package com.zoostarinc.workflow.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class TimesheetTest {

	@Test
	void testTimesheet() {
		var timesheet = new Timesheet();
		log.info("New Timesheet created: {}", timesheet);
		assertThat(timesheet).isNotNull();
		
		var state = timesheet.getState();
		log.info("Timesheet state: {}", state);
		assertThat(state).isEqualTo(AbstractTimesheetState.STATE_NEW);
		
		var actions = state.getActions();
		log.info("{} Timesheet has {} actions.", timesheet, actions.size());
		assertThat(actions.size()).isEqualTo(2);
		
		for(var action : actions) {
			log.info("Action: {}", action);
			action.execute(timesheet);
			log.info("Timesheet: {}", timesheet);
		}
	}

}
