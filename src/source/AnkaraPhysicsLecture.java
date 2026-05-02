package source;

public class AnkaraPhysicsLecture extends PhysicsLecture{
	
	public AnkaraPhysicsLecture(String classDate, String weeklyClassTopic) {
		super(classDate,weeklyClassTopic);
		className = "Ankara Physics Class";
	}
	
	public int cost() {
		return 100;
	}

}
