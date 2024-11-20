package assignment_Package_06;

public class Bank 
{
	static double balance=500;
	static double currentbalance;
	static double newbalance;
	public static void deposit()
	{
		System.out.println(balance);
		double depositamount=300.75;
		currentbalance=balance+depositamount;
		System.out.println(currentbalance);
	}
	public static void withdraw()
	{
		System.out.println(currentbalance);
		int withdrrawamount=200;
		if(currentbalance>withdrrawamount)
		{
			newbalance=currentbalance-withdrrawamount;
		System.out.println(newbalance);
		}
		else
		{
			System.out.println("Insufficient amount");
		}
		
	}
	public static void balance()
	{
		System.out.println("Current balance after deposit"+Bank.currentbalance);
		System.out.println("Current balance after withdrow"+Bank.newbalance);
	}
	public static void main(String[] args) 
	{
		Bank.deposit();
		Bank.withdraw();
		Bank.balance();
		
	}

}
