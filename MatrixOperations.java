class MatrixOperations
{
	public static void main(String args[])
	{
			int m[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("The original matrix");
			int k=2,d1=0,d2=0,r=0,c=0; //d1,d2,r,c are for sums and k for right diagonal
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(m[i][j]+" ");
			}
				System.out.println();
		}
		for(int i=0;i<3;i++)		//for row
		{	r=0;
			for(int j=0;j<3;j++)
			{
				r+=(m[i][j]);
			}
				System.out.println("The sum of elements in "+(i+1)+"th row is : "+r);
		}	
		for(int j=0;j<3;j++)		//for column
		{
			for(int i=0;i<3;i++)
			{
				c+=(m[i][j]);
			}
				System.out.println("The sum of elements in "+(j+1)+"th column is: "+c);
		}
		for(int i=0;i<3;i++)		//for left diagonal
		{	
			d1+=(m[i][i]);
		}
			System.out.println("The sum of elements in left diagonal is: "+d1);
		for(int i=0;i<3;i++)		//for right diagonal
		{
			d2+=(m[i][k]);
			k--;
		}
				System.out.println("The sum of elements in right diagonal is: "+d2);
	}
}
		