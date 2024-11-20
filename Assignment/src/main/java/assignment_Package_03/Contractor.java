package assignment_Package_03;

public class Contractor implements Employee
{
	public void calculateSalary()
	{
		int paymentperhour=300;
		double workinghours=1.5;
		double salary=paymentperhour*workinghours;
		System.out.println(salary);
		
		
	}
	public void calculateSalary( int days )
	{
	double salary=days*HOURS*400;
	System.out.println(salary);
	}

	public static void main(String[] args) 
	{
		Contractor contractor=new Contractor();
		contractor.calculateSalary();
		contractor.calculateSalary(30);
	}

}
