class NestedIf
{
	public static void main(String args[])
	{
		char ch='A';
		if((ch<=57&&ch>=48)||(ch<=90&&ch>=65)||(ch<=122&&ch>=97))
		{
			if((ch<=90&&ch>=65)||(ch<=122&&ch>=97))
			{
				if(ch<=90&&ch>=65)
				System.out.println("if-if-if");
				else
				System.out.println("if-if-else");
			}
			else
			{
				System.out.println("if-else");
			}
		}
		else
		{
			System.out.println("else");
		}
	}
}	