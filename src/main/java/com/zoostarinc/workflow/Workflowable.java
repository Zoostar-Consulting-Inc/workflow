package com.zoostarinc.workflow;

public interface Workflowable {
	<T extends Workflowable> State<T> getCurrentState();
}
