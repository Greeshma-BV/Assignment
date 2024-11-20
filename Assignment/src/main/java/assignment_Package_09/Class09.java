package assignment_Package_09;


public class Class09 
{
  int totalamount;
	Class09(int price1, int price2)
	{
	    totalamount=price1+price2;
		System.out.println(totalamount);
	}
	public void checkDiscount()
	{
		if(totalamount>5000)
		{
			int discountamount=(totalamount*20)/100;
			System.out.println("Discount amount: "+discountamount);
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
		Class09 class09=new Class09(4000,2000);
		class09.checkDiscount();
	}



}
