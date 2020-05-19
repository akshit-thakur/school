import java.io.*;
class PythagorusTriplets
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		int a,b,c; 
		System.out.println("Enter three numbers : ");
		String ch=input.readLine(); a=Integer.parseInt(ch);
		ch=input.readLine(); b=Integer.parseInt(ch);
		ch=input.readLine(); c=Integer.parseInt(ch);
		if((a*a)==((b*b)+(c*c)))
		{
		System.out.println("The given set of number are pythagorus triplets with "+a+" as the hyptonuse.");
		}
		else if((b*b)==((a*a)+(c*c)))
		{
		System.out.println("The given set of number are pythagorus triplets with "+b+" as the hyptonuse.");
		}
		else if((c*c)==((a*a)+(b*b)))
		{
		System.out.println("The given set of number are pythagorus triplets with "+c+" as the hyptonuse.");
		}
		else
		{
		System.out.println("The given set of number are not pythagorus triplets");
		}
	}
}