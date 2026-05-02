package source;

public abstract class PhysicsLecture extends Lecture{
	
	public PhysicsLecture(String classDate, String weeklyClassTopic) {
		super(classDate,weeklyClassTopic);
		className = "Physics Class";
		strategy = new ProjectBasedEvaluation();
	}

}
