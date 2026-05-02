package source;

public abstract class MathLecture extends Lecture{
	
	public MathLecture(String classDate, String weeklyClassTopic) {
		super(classDate,weeklyClassTopic);
		className = "Math Class";
		strategy = new ExamBasedEvaluation();
	}
}
