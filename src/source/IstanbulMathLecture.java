package source;

public class IstanbulMathLecture extends MathLecture{
	
	public IstanbulMathLecture(String classDate, String weeklyClassTopic) {
		super(classDate,weeklyClassTopic);
		className = "Istanbul Math Class";
	}
	
	public int cost() {
		return 350;
	}

}
