package assignment_Package_04;

public class Hdfc implements RBI
{
public void recurringDeposit()
{
	int amount=2000;
	int duration=10;
	double interest=(amount*duration*INTERESTRATE)/100;
	double totalamount=(amount*duration)+interest;
	System.out.println(totalamount);
	
}
	public static void main(String[] args) 
	{
		RBI rbi=new Hdfc();
		rbi.recurringDeposit();
	}

}
