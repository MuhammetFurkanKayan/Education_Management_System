package source;

public abstract class LectureCenter {
	
	public Lecture selectLecture(String request) {
		Lecture lesson;
		lesson = createLecture(request);
		System.out.println(lesson.getClassName());
		return lesson;
	}
	
	public abstract Lecture createLecture(String request);

}
