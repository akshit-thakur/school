class ListOfArmstrongNum
{
	public static void main(String args[])
	{
		int x=100,n=x; //n is a temp variable.
		for(x=100;x<=1000;x++)
		while(n>0)
		{	int d=0,s=0;
			d=(int)(n%10);
			s=s+(int)Math.pow(d,3);
			n=(int)(n/10);
		if(s==x)
		System.out.println(x+" is an armstrong number.");
		}
	}
}