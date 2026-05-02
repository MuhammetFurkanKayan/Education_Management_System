package source;

public class MainClass {

	public static void main(String[] args) {
		Lecture lesson = new IstanbulMathLecture("k","l");
		Lecture lesson1 = new AnkaraPhysicsLecture("x","y");
		MathStudent student1 = new MathStudent(lesson);
		PhysicsStudent student2 = new PhysicsStudent(lesson1);
		EducationalPublisher publisher = new EducationalPublisherA(lesson,"yayıncı mail");
		student1.addStudentEmail("öğrenci mail");
		student2.addStudentEmail("mat öğrenci mail");
		//Observer Design Pattern
		lesson.notifyObservers();
		lesson1.notifyObservers();
		lesson.setWeeklyClassTopic("Türev");
		//Factory Design Pattern and Strategy Design Pattern
		LectureCenter cent = new IstanbulLectureCenter();
		Lecture lesson2 = cent.selectLecture("math");
		
		lesson2.showEvaluationSystem();
		lesson2.setEvaluationStrategy(new ExamAndProjectEvaluation());
		lesson2.showEvaluationSystem();
		//Decorator Design Pattern
		Lecture lesson5 = new IstanbulEnglishLecture("2019","verbs");
		lesson5 = new OnlineMathLecture(lesson5,"2017","üslü");
		lesson5 = new OnlinePhysicsLecture(lesson5,"2018","hareket");
		
		System.out.println(lesson5.getClassName());
		System.out.println(lesson5.cost());
	}

}
