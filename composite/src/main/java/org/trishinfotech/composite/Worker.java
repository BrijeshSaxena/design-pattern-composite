package org.trishinfotech.composite;

public interface Worker {

	void assignWork(Employee manager, Work work);

	void performWork();
}
