import java.io.*;
class LCM
{
	public static void lcm(int x,int y)
	{
		int lcm=x*y;						//maximum possible lcm
		for(int i=2;i<=lcm;i++)
		{
			if((lcm%i)==0&&(i>x)&&(i>y)&&(x%i==0)&&(y%i==0))	//conditions
			lcm=i;
		}
		System.out.println(lcm+" is the LCM.");
	}			
	public static void main(String args[]) throws IOException
	{
		InputStreamReader rdr=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(rdr);
		System.out.println("Enter first no. :");
		int a=Integer.parseInt(input.readLine()); 		//a initialized
		System.out.println("Enter second no. :");
		int b=Integer.parseInt(input.readLine());		//b initialized
		lcm(a,b);
	}
}