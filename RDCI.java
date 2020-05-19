import java.io.*;
class RDCI
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream input=new DataInputStream(System.in);
		System.out.println("Enter 1 to calculate RD and 2 to calculate Amount on CI");
		int choice=Integer.parseInt(input.readLine());
		switch(choice)
		{
			case 1: System.out.println("Enter the no. of months.");
				int n=Integer.parseInt(input.readLine());
			             System.out.println("Enter the Monthly Deposit.");
				int md=Integer.parseInt(input.readLine());
			             System.out.println("Enter rate of interest.");	
				float r=Float.parseFloat(input.readLine());
				double m=((n*md)+(n*(n+1)*r*md/(2*100*12)));
				System.out.println("The maturity value is: "+m);
				break;
			case 2: System.out.println("Enter the time.");
				int t=Integer.parseInt(input.readLine());
			             System.out.println("Enter the Principal.");
				int p=Integer.parseInt(input.readLine());
			             System.out.println("Enter rate of interest.");	
				float R=Float.parseFloat(input.readLine());
				double a=(p*(Math.pow(((100+R)/100),t)));
				System.out.println("The amount is: "+a);
				break;
			default: System.out.println("Invalid");
		}
	}
}