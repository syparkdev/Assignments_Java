package lab4;


/*박세연 1613665 영어영문학과
 * 21-06-25
 * Human 클래스와 그 클래스를 상속한 Student 클래스를 테스트하는 프로그램입니다. */

public class Student extends Human
{
	private String major;                                //속성 정보를 표현하는 필드
	private String studentID;
	
	public String getMajor()                           //접근자와 설정자 메소드
	{
		return major;
	}
	public void setMajor(String major) 
	{
		this.major = major;
	}
	public String getStudentID() 
	{
		return studentID;
	}
	public void setStudentID(String studentID) 
	{
		this.studentID = studentID;
	}
	
	public Student()                                                      //생성자 메소드
	{
		super();
	}
	
	public Student(String name, int age, String major, String studentID) 
	{
		super(name, age);
		this.major = major;
		this.studentID = studentID;
	}
	
	@Override                                                                  //필드 정보를 문자열로 서술하는 메소드
	public String toString() 
	{
		return "[학생 정보]이름: " + getName() + ", 나이: " + getAge() 
		+ ", 전공: " + major + ", 학번: " + studentID + "\n";
	}
}
