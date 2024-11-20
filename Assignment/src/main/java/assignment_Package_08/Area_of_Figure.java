package assignment_Package_08;

public class Area_of_Figure 
{
	public static void area(int radious)
	{
		double circlearea=radious*Math.PI;
		System.out.println(circlearea);
	}
	public static void area(int width, int length)
	{
		int trectaglearea=width*length;
		System.out.println(trectaglearea);
	}
	public static void area(float a)
	{
		float squarearea =a*a;
		System.out.println(squarearea);
	}
	public static void main(String[] args) 
	{
		Area_of_Figure.area(8);
		Area_of_Figure.area(9.5f);
		Area_of_Figure.area(5, 6);
		
	}

}
