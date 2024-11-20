package assignment_Package_08;

public class Average 
{
	public static void average(int a, int b, int c)
	{
		int average=(a+b+c)/3;
		System.out.println(average);
	}
	public static void average(float a, float b, float c)
	{
		float average1=(a+b+c)/3;
		System.out.println(average1);

	}
	public static void main(String[] args) 
	{
		Average.average(2, 4, 6);
		Average.average(3.5f,6.7f,5.4f);
	}

}
