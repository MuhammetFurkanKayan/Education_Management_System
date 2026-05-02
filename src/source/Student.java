package source;

import java.util.*;

public abstract class Student implements Observer,EmailSender {
	
	private Lecture lesson;
	private List <String> studentEmail;
    private String className;
    private String classDate;
    private String weeklyClassTopic;

    public Student(Lecture lesson) {
    	this.lesson = lesson;
        studentEmail = new ArrayList<String>();
        lesson.registerObserver(this);
    }
    public void addStudentEmail(String email) {
    	this.studentEmail.add(email);
    }
    public void removeStudentEmail(String email) {
    	this.studentEmail.remove(email);
    }
    
    public String getStudentClassName() {
    	return this.className;
    }
    public String getStudentClassDate() {
    	return this.classDate;
    }
    public String getStudentWeeklyClassTopic() {
    	return this.weeklyClassTopic;
    }

    @Override
    public void update(String className ,String classDate, String weeklyClassTopic) {
        this.className = className;
        this.classDate = classDate;
        this.weeklyClassTopic = weeklyClassTopic;
        send();
    }

    @Override
    public void send() {
    	for (String studentsEmails: studentEmail) {
    	System.out.println("Öğrenci e-mail: "+studentsEmails+"  Ders Adı: "+this.getStudentClassName()+"  Ders Tarihi: "+this.getStudentClassDate()+
    	"  Haftalık Ders Konusu: "+this.getStudentWeeklyClassTopic() + "(Bilgiler Gönderildi.)");
    	}
	}
}
