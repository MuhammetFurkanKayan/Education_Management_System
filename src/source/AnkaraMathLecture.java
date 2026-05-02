package source;

public class AnkaraMathLecture extends MathLecture{
	
	public AnkaraMathLecture(String classDate, String weeklyClassTopic) {
		super(classDate,weeklyClassTopic);
		className = "Ankara Math Class";
	}
	
	public int cost() {
		return 300;
	}

}
