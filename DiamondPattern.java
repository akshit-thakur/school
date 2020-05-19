class DiamondPattern
{
	public static void main(String args[])
	{
		int a=1;
		while(a<29)
		{
		if(a==10||a==20) { System.out.println(); }
		if(a==5||a==13||a==14||a==24)
		System.out.print("*");
		System.out.print(" ");
		a++;
		}
	}
}

	