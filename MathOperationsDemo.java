class MathOperationsDemo{
    public static void main(String args[]){
        MathOperations obj=new MathOperations();
        System.out.println("ASCII of Z is: "+obj.asciiOf('z'));
        System.out.println("Sum of even numbers upto 100 is: "+obj.evenSum(100));
        int a[]=obj.factorsOf(6);
        System.out.println("Factors of 6 are: ");
        for(int i=0;i<a.length;i++){
            if(a[i]==0)
            break;
            System.out.print(a[i]+" ");
        }
        System.out.println("\nThe GCD of 49 and 196 is: "+obj.gcdOf(49,196));
        System.out.println("The LCM of 2 and 3 is: "+obj.lcmOf(2,3));
        System.out.println("Sum of odd numbers upto 100 is: "+obj.oddSum(100));
        System.out.println("Sum of digits of 1234 is "+obj.sumOfDigits(1234));
        int b[]=obj.tableOf(7);
        System.out.println("Table of 7 is: ");
        for(int i=0;i<b.length;i++)
        System.out.println("7*"+(i+1)+"="+b[i]);
        float[] c=obj.quadRoots(5,10,20);
        System.out.print("The roots of quadratic equation 5x^2+10x+20 is: ");
        for(int i=0;i<c.length;i++)
        System.out.print(a[i]+" ");
        System.out.println();
    }
}