package source;

import java.util.*;

public abstract class Lecture implements Subject {
	
	protected EvaluationStrategy strategy;
	private List <Observer> observers;
	protected String className;
	private String classDate;
	private String weeklyClassTopic;

	public Lecture(String classDate, String weeklyClassTopic) {
		observers = new ArrayList<Observer>();
		this.classDate = classDate;
		this.weeklyClassTopic = weeklyClassTopic;
	}

	public void setClassDate(String classDate) {
		this.classDate = classDate;
		notifyObservers();
	}
	public void setClassName(String className) {
		this.className =  className;
		notifyObservers();
	}
	
	public void setWeeklyClassTopic(String weeklyClassTopic) {
		this.weeklyClassTopic =  weeklyClassTopic;
		notifyObservers();
	}
	
	public String getClassDate() {
		return classDate;
	}
	
	public String getClassName() {
		return className;
	}
	
	public String getWeeklyClassTopic() {
		return weeklyClassTopic;
	}
	
	public void setEvaluationStrategy(EvaluationStrategy strategy) {
		this.strategy = strategy;
		}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		}
	
	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		}
	
	@Override
	public void notifyObservers() {
		for (Observer observer: observers) {
		observer.update(this.className,this.classDate,this.weeklyClassTopic);
		}
	}
	
	public void showEvaluationSystem() {
		strategy.evaluationSystem();
	}
	
	public abstract int cost();

}
