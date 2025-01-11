package com.zoostarinc.workflow;

public interface Action<T extends Workflowable> {
	void execute(T workflowable);
}
