import java.io.*;
class ExchangeSelectionSort
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
			int a[]=new int[10],temp=0,small=0;
		System.out.println("Enter 10 elements: ");
		for(int i=0;i<10;i++)
		{
			a[i]=Integer.parseInt(input.readLine());
		}
		for(int i=0;i<10;i++)
		{
			small=i;
			for(int j=i+1;j<10;j++)
			{
				if(a[j]<a[small])
				{
					small=j;
				}
			}
			temp=a[small];
			a[small]=a[i];	
			a[i]=temp;
		}
		System.out.println("\nSorted Array: ");
		for(int l=0;l<10;l++)
		{
			System.out.print(a[l]+" ");
		}
	}
}
	