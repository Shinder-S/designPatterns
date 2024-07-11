package ObaserverPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper implements Observable{

	private String name;
	public List<Observer> suscribeList;

	public NewsPaper(String name) {
		this.name = name;
		suscribeList = new ArrayList<Observer>();
	}

	@Override
	public void notifyAllObservers() {
		for (Observer observer : suscribeList) {
			observer.update();
		}
	}

	@Override
	public void addObserver(Observer observer) {
		suscribeList.add(observer);		
	}

	@Override
	public void removeObserver(Observer observer) {
		suscribeList.remove(observer);		
	}
	
	public void publish() {
		System.out.println("We have an update");
		notifyAllObservers();
	}
	
}
