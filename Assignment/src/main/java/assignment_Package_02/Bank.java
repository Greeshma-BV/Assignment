package assignment_Package_02;

public class Bank 
{
private int pin;

public int getPin() 
{
	return pin;
}

public void setPin(int pin) 
{
	this.pin = pin;
}
public void validatePin()
{
	if (pin==1001)
	{
		System.out.println("Vaild");
	}
	else if(pin==1234)
	{
		System.out.println("Vaild");
	}
	else if(pin==1212)
	{
		System.out.println("Vaild");
	}
	else
	{
		System.out.println("INVALID");
	}
}
}

