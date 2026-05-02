package source;

public class OnlineEnglishLecture extends OnlineLectureDecorator{
	
	public OnlineEnglishLecture(Lecture lesson,String classDate, String weeklyClassTopic) {
		super(lesson,classDate,weeklyClassTopic);
	}
	
	public String getClassName() {
		return lesson.getClassName() + "+Online English Class";
	}
	
	public int cost() {
		return 75+lesson.cost();
	}

}
