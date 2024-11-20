package assignment_Package_02;

public class User 
{
	
	
	public static void main(String[] args) 
	{
		Bank bank=new Bank();
		bank.setPin(1001);
		System.out.println(bank.getPin());
		bank.validatePin();
	}

}
