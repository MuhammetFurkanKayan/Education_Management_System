package source;

public class IstanbulLectureCenter extends LectureCenter{
	
	public Lecture createLecture(String request) {
		
		if (request.equals("english")) {
			return new IstanbulEnglishLecture(null,null);
		} 
		else if (request.equals("math")) {
			return new IstanbulMathLecture(null,null);
		} 
		else if (request.equals("physics")) {
			return new IstanbulPhysicsLecture(null,null);
		}  
		else return null;
	}

}
