package source;

public class IstanbulPhysicsLecture extends PhysicsLecture{
	
	public IstanbulPhysicsLecture(String classDate, String weeklyClassTopic) {
		super(classDate,weeklyClassTopic);
		className = "Istanbul Physics Class";
	}
	
	public int cost() {
		return 150;
	}

}
