import java.io.*;
class Bibliography
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		System.out.println("Enter your name: ");
		String S=input.readLine();
		char ch;  int j=0,k=1,len=S.length(),a[]=new int[len];
		for(int i=0;i<len;i++)
		{
			if(S.charAt(i)==' ')
			{
				j=i+1;
				a[k]=j;
				k++;
			}
		}
		for(int i=0;i<(k-1);i++)
		{
			ch=S.charAt(a[i]);
			System.out.print(ch+".");
		}
		String str=S.substring(j,len);
		System.out.print(str);
	}
}