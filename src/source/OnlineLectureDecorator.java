package source;

public abstract class OnlineLectureDecorator extends Lecture{
	
	protected Lecture lesson;
	
	public OnlineLectureDecorator(Lecture lesson,String classDate, String weeklyClassTopic) {
		super(classDate,weeklyClassTopic);
		this.lesson = lesson;
	}
	@Override
	public abstract String getClassName();

}
