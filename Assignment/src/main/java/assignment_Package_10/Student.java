package assignment_Package_10;

public class Student 
{
	int a,b,c;
	int totalmark;
	
	Student(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public int mark()
	{
	    totalmark=a+b+c;
		return totalmark;
		
	}
	public void grade()
	{
		if(totalmark>=270)
		{
			System.out.println("A+ Grade");
		}
		else if(totalmark>=250 && totalmark<270)
		{
			System.out.println("A Grade");
		}
		else if(totalmark>=230 && totalmark<250)
		{
			System.out.println("B+ Grade");
		}
		else if(totalmark>=210 && totalmark<230)
		{
			System.out.println("B Grade");
		}
		else
		{
			System.out.println("c Grade");
		}
	}


	public static void main(String[] args) 
	{
		Student student=new Student(90,95,60);
		System.out.println(student.mark());
		student.grade();
		Student student2=new Student(95,50,60);
		System.out.println(student2.mark());
		student2.grade();
	}

}
