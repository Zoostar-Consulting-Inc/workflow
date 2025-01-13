package com.zoostarinc.workflow;

import java.util.Collection;

public interface State <T extends Workflowable<T>> {
	Collection<Action<T>> getActions();
}
