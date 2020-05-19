import java.io.*;
class DateToDay
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("dd.mm.yyyy\n\n");
		System.out.println("Enter dd :");
			int d=Integer.parseInt(in.readLine());
		System.out.println("Enter month :");
			int m=Integer.parseInt(in.readLine());
		System.out.println("Enter year :");
			int y=Integer.parseInt(in.readLine());
			int mon=assignVal(m);
			int yr=y%100;
			int l=yr/4;
			int sum=yr+l+mon+d;
			int result=sum%7;
			getResult(result);
	}
	public static void getResult(int x)
	{
		switch(x)
		{
			case 0: System.out.println("The day is Sunday.");
				break;
			case 1: System.out.println("The day is Monday.");
				break;
			case 2: System.out.println("The day is Tuesday.");
				break;
			case 3: System.out.println("The day is Wednesday.");
				break;
			case 4: System.out.println("The day is Thursday.");
				break;
			case 5: System.out.println("The day is Friday.");
				break;
			case 6: System.out.println("The day is Saturday.");
				break;
			default: System.out.println("Invalid.");
		}
	}
	public static int assignVal(int x)	
	{
		int y=0;
		switch(x)
		{
			case 1: y=0;
				break;
			case 2: y=3;
				break;
			case 3: y=3;
				break;
			case 4: y=6;
				break;
			case 5: y=1;
				break;
			case 6: y=4;
				break;
			case 7: y=6;
				break;
			case 8: y=2;
				break;
			case 9: y=5;
				break;
			case 10: y=0;
				break;
			case 11: y=3;
				break;
			case 12: y=5;
				break;
			default: System.out.println("Invalid.");			
		}
			return y;
	}
}