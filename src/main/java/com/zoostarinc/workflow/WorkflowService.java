package com.zoostarinc.workflow;

public interface WorkflowService<T extends Workflowable<T>> {
	T newInstance();
}
