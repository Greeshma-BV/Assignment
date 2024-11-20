package assignment_Package_07;

public class Estore 
{
	static int totalamount;
	public static int calculateTotalAmount(int price1, int price2)
	{
	    totalamount=price1+price2;
		return totalamount;
	}
	public static void checkDiscount()
	{
		if(totalamount>5000)
		{
			int discountamount=(totalamount*20)/100;
			int payableamount= totalamount-discountamount;
			System.out.println("Payable amount"+payableamount);
		}
		else
		{
			System.out.println(totalamount);
		}
	}
	public static void main(String[] args) 
	{
		Estore.calculateTotalAmount(4000, 2000);
		System.out.println("Total amount without reduction:"+Estore.totalamount);
		Estore.checkDiscount();
	}

}
