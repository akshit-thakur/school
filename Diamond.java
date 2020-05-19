class Diamond
{
	public static void main(String args[])
	{
		int a=0,b=0,c=0,i=0,j=0,k=0,n=5,d=(n-1);
		UpperHalf(i,j,k,n);
		LowerHalf(a,b,c,d);
	}	
	public static void UpperHalf(int x,int y,int z,int s)
	{
		for(x=1;x<=s;x++)
		{
			for(z=5-x;z>0;z--)
			{
				System.out.print("  ");
			}
			for(y=x;y>1;y--)
			{
				System.out.print(y+" ");
			}
			for(y=1;y<=x;y++)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
	public static void LowerHalf(int x,int y,int z,int s)
	{
			for(x=s;x>=0;x--)
			{
			System.out.println();
			for(z=5-x;z>=1;z--)
			{
				System.out.print("  ");
			}
			for(y=x;y>1;y--)
			{
				System.out.print(y+" ");
			}
			for(y=1;y<=x;y++)
			{
				System.out.print(y+" ");
			}
		}
	}
}
	
		
		