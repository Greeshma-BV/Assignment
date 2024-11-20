package assigment_Package_01;

public class Offseason extends Onseason
{
	public void discount()
	{
		double orginalprice=200;
		double disamount2=(orginalprice*15)/100;
		super.discount();
		System.out.println(disamount2);
		
	}
	public static void main(String[] args) 
	{
		Offseason offseason=new Offseason();
		offseason.discount();
	}

}
