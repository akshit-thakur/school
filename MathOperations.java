class MathOperations{     
    int asciiOf(char ch){
        return (int)ch;
    }
    int evenSum(int x){
       int sum=0;
       for(int i=1;i<=x;i++){
            if(i%2==0)
            sum+=i;
       }
       return sum;
    }
    int[] factorsOf(int x){
       int ctr=0,array[]=new int[x];
       for(int i=1;i<=x;i++){
          if(x%i==0){
            array[ctr]=i;
            ctr++;
          }
       }
       return array;
    }
    int gcdOf(int a,int b){
       int nmr=Math.max(a,b),dmr=Math.min(a,b),result=0;
       while(result>0){
            result=nmr%dmr;
            nmr=dmr;
            if(result!=0)
            dmr=result;
       }
       return dmr;
    }    
    int lcmOf(int x,int y){
        int lcm=x*y;
        for(int i=2;i<=lcm;i++){
            if((lcm%i)==0&&(i>x)&&(i>y)&&(x%i==0)&&(y%i==0))
            lcm=i;
        }
        return lcm;
    }   
    int oddSum(int x){
       int sum=0;
       for(int i=1;i<=x;i++){
            if(i%2!=0)
            sum+=i;
       }
       return sum;
    }
    int sumOfDigits(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    int[] tableOf(int x){
        int array[]=new int[10];
        for(int i=0;i<10;i++)
        array[i]=(i+1)*x;
        return array;
    }
    float[] quadRoots(int a,int b,int c){
        float arr[]=new float[2];float D=((b*b)-(4*a*c)),root1,root2; 
        if(D>0){            
            root1=(float)((-b)+(Math.sqrt(D))/(2*a));
            root2=(float)((-b)-(Math.sqrt(D))/(2*a));
            float[] j={root1,root2}; 
            arr=j;
        }
        else if (D==0){            
            root1=(float)((-b)+(Math.sqrt(D))/(2*a));
            float[] j={root1,root1}; 
            arr=j;            
        }
        else 
        System.out.println("The roots are complex and unequal. No solution");        
        return arr;
    }    
}