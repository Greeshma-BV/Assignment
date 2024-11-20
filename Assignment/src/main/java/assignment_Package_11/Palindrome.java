package assignment_Package_11;

public class Palindrome 
{
	

	public static void main(String[] args) 
	{
		String val="java";
		String rev="";
		int strlength=val.length();
		
		for(int i=(strlength-1); i>=0;i--)
		{
			rev=rev+val.charAt(i);
		}
			System.out.println(rev);
			
		if(rev.equals(val))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");

		}
	}

}
