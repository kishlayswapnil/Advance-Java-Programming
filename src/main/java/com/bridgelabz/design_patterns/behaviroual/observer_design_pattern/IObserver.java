package com.bridgelabz.design_patterns.behaviroual.observer_design_pattern;



public interface IObserver {
	
	//method to update the observer, used by subject
	void update();
	
	//attach with subject to observe
	void setSubject(ISubject sub);
}
