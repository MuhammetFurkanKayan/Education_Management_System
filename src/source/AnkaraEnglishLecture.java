package source;

public class AnkaraEnglishLecture extends EnglishLecture{

	public AnkaraEnglishLecture(String classDate, String weeklyClassTopic) {
		super(classDate,weeklyClassTopic);
		className = "Ankara English Class";
	}
	
	public int cost() {
		return 200;
	}
}
