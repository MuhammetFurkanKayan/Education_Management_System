package source;

public abstract class EnglishLecture extends Lecture {
	
	public EnglishLecture(String classDate, String weeklyClassTopic) {
		super(classDate,weeklyClassTopic);
        className = "English Class";
        strategy = new ExamAndProjectEvaluation();
	}
	
}
