class NumberPattern
{
	public static void main(String args[])
	{
		int n=1, term=0;
		for(n=1;n<=20;n++)
		{
			term=(3*n)+2;
			if(term%4==0)
			break;
			System.out.println(term);
		}
	}
}