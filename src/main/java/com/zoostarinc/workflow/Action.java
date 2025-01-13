package com.zoostarinc.workflow;

public interface Action<T extends Workflowable<T>> {
	void execute(T workflowable);
}
