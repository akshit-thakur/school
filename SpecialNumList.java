class SpecialNumList
{
	public static void main(String args[])
	{
		int d=0,s=0,f,n;
		for(n=1;n<=200;n++)
		{
			int x=n;
			while(x>0)
			{
				d=x%10;
				f=1;
				for(int i=1;i<=d;i++)
				f=f*i; 
				s=s+f;
				x=x/10;
			}			
			if(s==n) 
				System.out.println(n+" is a special number."); 
		}
	}
}

		