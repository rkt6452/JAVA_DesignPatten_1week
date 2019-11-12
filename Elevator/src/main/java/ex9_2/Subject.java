package ex9_2;

import java.util.List;
import java.util.ArrayList;

public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void addobserver(Observer observer) {
		observers.add(observer);
	}

	public void rmobserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(Observer o:observers)
			o.update();
	}
}
