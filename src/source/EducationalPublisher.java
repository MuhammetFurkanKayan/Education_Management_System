package source;

public abstract class EducationalPublisher implements Observer,EmailSender{
	
	private Lecture lesson;
	protected String publisherName;
	private String publisherEmail;
    private String className;
    private String classDate;
    private String weeklyClassTopic;

    public EducationalPublisher(Lecture lesson,String publisherEmail) {
    	this.lesson = lesson;
    	this.publisherEmail = publisherEmail;
        lesson.registerObserver(this);
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
    public void setPublisherEmail(String publisherEmail) {
    	this.publisherEmail = publisherEmail;
    }
    public void setPublisherName(String publisherName) {
    	this.publisherName = publisherName;
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
    	System.out.println("Eğitim Kaynağı Yayıncıları e-mail: "+publisherEmail+"  Ders Adı: "+this.getStudentClassName()+"  Ders Tarihi: "+this.getStudentClassDate()+
    	"  Haftalık Ders Konusu: "+this.getStudentWeeklyClassTopic() + "(Bilgiler Gönderildi.)");
	}

}
