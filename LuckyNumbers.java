class LuckyNumbers
{
    public static void main(String args[])
    {
        int a[]=new int[30];
        int b[]=new int[30];
        int c[]=new int[15];
        int d[]=new int[8];
        int e[]=new int[7];
        int f[]=new int[6];
        for(int i=1;i<30;i++)
        {
            System.out.print(i+",");
            a[i]=i;
        }
        int m=2;
        for(int i=0;i<5;i++)
        {
            int ctr=0;
            for(int j=1;j<30;j++)
            {
                switch(i)
                {
                    case 0:
                    if(j%m!=0)
                    {
                        System.out.print(a[j]+",");
                        b[ctr]=a[j];
                        ctr++;
                    }
                    break;
                    case 1:
                    if(j%m!=0)
                    {
                        System.out.print(b[j]+",");
                        c[ctr]=b[j];
                        ctr++;
                    }
                    break;
                    case 2:
                    if(j%m!=0)
                    {
                        System.out.print(c[j]+",");
                        d[ctr]=c[j];
                        ctr++;
                    }
                    break;
                    case 3:
                    if(j%m!=0)
                    {
                        System.out.print(d[j]+",");
                        e[ctr]=d[j];
                        ctr++;
                        
                    }
                    break;
                    case 4:
                    if(j%m!=0)
                    {
                        System.out.print(e[j]+",");
                        f[ctr]=e[j];
                        ctr++;
                    }
                    break;
                    default: break;
                }
            }   
           System.out.println();
        }
    }
}