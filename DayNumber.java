import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class DayNumber{
    public static void main(String[] args)throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter day number: ");
        int num=Integer.parseInt(input.readLine());
        System.out.print("Enter the year: ");
        int year=Integer.parseInt(input.readLine());
        if(year%4!=0){
            if(num<=0||num>365)
            System.out.println("Day number can't be less than or equal to zero or greater than 365");   
            else{
                if(num<=31)
                System.out.println(num+" January,"+year);
                else if(num>31&&num<=59)
                System.out.println(num-31+" February,"+year);
                else if(num>59&&num<=90)
                System.out.println(num-59+" March,"+year);
                else if(num>90&&num<=120)
                System.out.println(num-90+" April,"+year);
                else if(num>120&&num<=151)
                System.out.println(num-120+" May,"+year);
                else if(num>151&&num<=181)
                System.out.println(num-151+" June,"+year);
                else if(num>181&&num<=212)
                System.out.println(num-181+" July,"+year);
                else if(num>212&&num<=243)
                System.out.println(num-212+" August,"+year);
                else if(num>243&&num<=273)
                System.out.println(num-243+" September,"+year);
                else if(num>273&&num<=304)
                System.out.println(num-273+" October,"+year);
                else if(num>304&&num<=334)
                System.out.println(num-304+" November,"+year);
                else
                System.out.println(num-334+" December,"+year); 
            }
        }
        else{
            if(num<=0||num>366)
            System.out.println("Day number can't be less than or equal to zero or greater than 366");        
            else{
                if(num<=31)
                System.out.println(num+" January,"+year);
                else if(num>31&&num<=60)
                System.out.println(num-31+" February,"+year);
                else if(num>60&&num<=91)
                System.out.println(num-60+" March,"+year);
                else if(num>91&&num<=121)
                System.out.println(num-91+" April,"+year);
                else if(num>121&&num<=152)
                System.out.println(num-121+" May,"+year);
                else if(num>152&&num<=182)
                System.out.println(num-152+" June,"+year);
                else if(num>182&&num<=213)
                System.out.println(num-182+" July,"+year);
                else if(num>213&&num<=244)
                System.out.println(num-213+" August,"+year);
                else if(num>244&&num<=274)
                System.out.println(num-244+" September,"+year);
                else if(num>274&&num<=305)
                System.out.println(num-274+" October,"+year);
                else if(num>305&&num<=335)
                System.out.println(num-305+" November,"+year);
                else
                System.out.println(num-335+" December,"+year); 
            }
        }
    }
}