package source;

public class OnlinePhysicsLecture extends OnlineLectureDecorator{
	
	public OnlinePhysicsLecture(Lecture lesson,String classDate, String weeklyClassTopic) {
		super(lesson,classDate,weeklyClassTopic);
	}
	
	public String getClassName() {
		return lesson.getClassName() + "+Online Physics Class";
	}
	
	public int cost() {
		return 50+lesson.cost();
	}
	

}
