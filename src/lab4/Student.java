package lab4;


/*�ڼ��� 1613665 ������а�
 * 21-06-25
 * Human Ŭ������ �� Ŭ������ ����� Student Ŭ������ �׽�Ʈ�ϴ� ���α׷��Դϴ�. */

public class Student extends Human
{
	private String major;                                //�Ӽ� ������ ǥ���ϴ� �ʵ�
	private String studentID;
	
	public String getMajor()                           //�����ڿ� ������ �޼ҵ�
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
	
	public Student()                                                      //������ �޼ҵ�
	{
		super();
	}
	
	public Student(String name, int age, String major, String studentID) 
	{
		super(name, age);
		this.major = major;
		this.studentID = studentID;
	}
	
	@Override                                                                  //�ʵ� ������ ���ڿ��� �����ϴ� �޼ҵ�
	public String toString() 
	{
		return "[�л� ����]�̸�: " + getName() + ", ����: " + getAge() 
		+ ", ����: " + major + ", �й�: " + studentID + "\n";
	}
}
