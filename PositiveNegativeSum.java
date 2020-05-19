//icse 2005 success
import java .io.*;
class PositiveNegativeSum
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream input=new DataInputStream(System.in);
		int n=1; //token value. 
		int osum=0,esum=0,nsum=0;
		while(n!=0)
		{
			System.out.println("Enter a postitve or negative number. To end the list,enter 0.");
			n=Integer.parseInt(input.readLine());
			if(n>0&&(n%2)!=0)
			{
				osum+=n;
			}
			else if(n<0)
			{
				nsum+=n;
			}
			else
			{
				esum+=n;
			}
		}
		System.out.println("The sum of positive odd numbers is: "+osum);
		System.out.println("The sum of positive even numbers is: "+esum);
		System.out.println("The sum of negative number is: "+nsum);
	}
}
		
	