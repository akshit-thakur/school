class Compare 
{
	public static void main(String args[])
	{
		int n1=80,n2=90;		char ch1='x',ch2='X';		String s1="Fifty",s2="Fifty-One";	
		compare(n1,n2);
		compare(ch1,ch2);
		// compare(s1,s2);
	}
	public static void compare(int a,int b)
	{
		System.out.println(Math.max(a,b));
	}
	public static void compare(char a,char b)
	{
		int x=a; int y=b;
		System.out.println(Math.max(x,y));
	}
	public static void compare(String a,String b)
	{
		// don't klnow what to do :(

	}
}