package Students;
import Students.University;
public class Student extends University
{
	
	private String name;
	private Integer age;
	private Integer mark;
	public Student(){}
	public Student(String name, Integer age, Integer mark)
	{
		this.name = name;
		this.age =  age;
		this.mark = mark;
		
		
	}
	
	public String getName()
	{
		return name;
	}
public Integer getAge()
{
	return age;
}
	public Integer getMark()
	{
		return mark;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(Integer age)
	{
		this.age = age;
	}
	public void setMark(Integer mark)
	{
		this.mark = mark;
	}
	
	void display()
	{
		System.out.println("___________________________________" );
		
		System.out.println("Numele Studentului: "+ name +"\n" );
		System.out.println("Varsta studentului: " + age+ "\n");
		System.out.println("Nota studentului "+ mark+ "\n");
		System.out.println("____________________________________" );
		
	}
	
	
}