import java.io.*;
class ElementFind
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
			int a[]=new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter a number: ");
			a[i]=Integer.parseInt(in.readLine());
		}
		System.out.println("\n Enter a number you want to find in the array of numbers: ");
			int item=Integer.parseInt(in.readLine());
			int no=0,found=0;
		System.out.println("\n");
		for(int i=0;i<10;i++)
		{
			if(a[i]==item)
			{
				found=1; no=no+1;
			}
			
		}
		if(found==1)
		{
			System.out.println("The number "+item+" was found "+no+ " times.");
		}
		else
			System.out.println("The number wasn't found");
	}
}	