//error
import java.io.*;
class Palindrome
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		System.out.println("Choose what you want to check. Press 1 for no. or 2 for String");
		int choice=Integer.parseInt(input.readLine());
		switch(choice)
		{
			case 1:  System.out.println("Enter a number :");
				int num=Integer.parseInt(input.readLine());
				CheckNumberPalindrome(num); break;
			case 2:  System.out.println("Enter a sentence/word :");
				String S=input.readLine();
				CheckStringPalindrome(S); break;
			default:  System.out.println("Invalid choice.");
		}
	}
	public static void CheckNumberPalindrome(int n)
	{
		int d=0,r=0,c=n;
		while(n!=0)
		{
			d=n%10;
			r=(r*10)+d;
			n=n/10;
		}
		if(c==r)
		{
			System.out.println(c+" is a palindrome number.");
		}
		else
		{	
			System.out.println(c+" is not a palindrome number.");
		}
	}
	public static void CheckStringPalindrome(String S)
	{
		StringBuffer word=new StringBuffer(S);
		StringBuffer temp=word.reverse();
		String str=temp.toString();		
		if(str.equals(S))
		{
			System.out.println("The String is a palindrome.");
		}
		else
		{
			System.out.println("The String is not a palindrome.");
		}
	}
}
					