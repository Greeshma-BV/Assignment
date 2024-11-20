package assignment_Package_05;

public class Class2 extends Class1
{

	public void addition()
	{
		System.out.println(super.addition(10, 20));
		if(sum%10==0)
		{
			System.out.println("Sum is divisible by 10");
		}
			else
			{
				System.out.println("Sum is not divisible by 10");
			}
		
	}
	public static void main(String[] args) 
	{
		Class2 class2=new Class2();
		class2.addition();
	}

}
