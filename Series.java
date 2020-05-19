//to print x+x^2/2!+......x^n/n!
class Series1{
	public static void main(String args[]){
		float n=2,s=0,a,f,r;
		for(int i=1;i<=n;i++){
			f=1;
			for(int j=1;j<=i;j++)
			f=f*j;
			a=(float)Math.pow(n,i);
			r=(float)a/f;
			s=(float)(s+r);
		}
		System.out.print(s);
	}
}
//to be continued......
