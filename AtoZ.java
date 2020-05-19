//to print series A to Z 
class AtoZ
{
	public static void main(String args[])
	{
		char ch='A';				 //ch assigned the value 'A' of data type..... you know it :P
		do				       	//initializes do-while loop
		{
			System.out.print(ch+" ");		//prints the value of ch
			ch++;				//increases the value of ch by 1..from 'A' to 'B', 'B' to 'C'
		}while(ch<='Z');				//exit-control loop
	}
}
