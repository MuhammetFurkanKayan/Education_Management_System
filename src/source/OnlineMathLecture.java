package source;

public class OnlineMathLecture extends OnlineLectureDecorator{
	
	public OnlineMathLecture(Lecture lesson,String classDate, String weeklyClassTopic) {
		super(lesson,classDate,weeklyClassTopic);
	}
	
	public String getClassName() {
		return lesson.getClassName() + "+Online Math Class";
	}
	
	public int cost() {
		return 100+lesson.cost();
	}

}
