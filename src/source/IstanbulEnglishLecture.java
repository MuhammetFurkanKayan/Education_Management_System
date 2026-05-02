package source;

public class IstanbulEnglishLecture extends EnglishLecture{
	
	public IstanbulEnglishLecture(String classDate, String weeklyClassTopic) {
		super(classDate,weeklyClassTopic);
		className = "Istanbul English Class";
	}
	
	public int cost() {
		return 250;
	}

}
