package com.zoostarinc.workflow;

public interface Workflowable<T extends Workflowable<T>> {
	void setState(State<T> state);
}
