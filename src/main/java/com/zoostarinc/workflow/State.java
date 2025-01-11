package com.zoostarinc.workflow;

import java.util.List;

public interface State<T extends Workflowable> {
	String toString();
	List<Action<T>> getActions();
}
