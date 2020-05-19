import java.io.*;
class BankNotes
{
	private int amt,T,FH,H,F,Tw,Te,Fi,On;
	BankNotes(int a)
	{
		amt=a;
		T=(a/1000);
		FH=((a%1000)/500);
		H=((a%500)/100);
		F=((a%100)/50);
		Tw=((a%50)/20);
		Te=((a-(T*1000)-(FH*500)-(H*100)-(F*50)-(Tw*20))/10);
		Fi=((a%10)/5);
		On=(a%5);
	}
	void disp()
	{
		System.out.println("Net Amount: "+amt);
		System.out.println("\nRs 1000 Notes: "+T);
		System.out.println("Rs 500 Notes: "+FH);
		System.out.println("Rs 100 Notes: "+H);
		System.out.println("Rs 50 Notes: "+F);
		System.out.println("Rs 20 Notes: "+Tw);
		System.out.println("Rs 10 Notes: "+Te);
		System.out.println("Rs 5 Notes: "+Fi);
		System.out.println("Re 1 Notes: "+On);
	}
	public static void main(String args[]) throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter the amount: ");
		int n=Integer.parseInt(in.readLine());
		BankNotes obj=new BankNotes(n);
		obj.disp();
	}
}