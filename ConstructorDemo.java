class ConstructorDemo
{
	private int l;
	private int b;
	public ConstructorDemo()
	{
		l=0;
		b=0;
	}
	public static void main(String args[])
	{
		ConstructorDemo obj=new ConstructorDemo();
		obj.l=100;
		obj.b=20;
		System.out.print("Length="+obj.l+",Breadth="+obj.b);
	}
}