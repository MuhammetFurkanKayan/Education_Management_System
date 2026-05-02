package source;

public class AnkaraLectureCenter extends LectureCenter{
	
	public Lecture createLecture(String request) {
		
		if (request.equals("english")) {
			return new AnkaraEnglishLecture(null,null);
		} 
		else if (request.equals("math")) {
			return new AnkaraMathLecture(null,null);
		} 
		else if (request.equals("physics")) {
			return new AnkaraPhysicsLecture(null,null);
		}  
		else return null;
		
	}
}
