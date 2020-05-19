import java.util.*;
class EvilNum{
    int num; String binary;
    EvilNum(){
        num=0;
        binary="";
    }
    void getInput(){
        try{
            Scanner read=new Scanner(System.in);
            System.out.println("Enter a decimal: ");
            num=read.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Error! Try again.");
            getInput();
        }
    }
    void toBinary(){
        int x=num;
        while(x>0){ 
            switch(x%2){ 
                case 0:  binary=binary.concat("0");            break;
                case 1:  binary=binary.concat("1");            break;
            }
            x/=2;
        }
        StringBuffer rev=new StringBuffer(binary); 
        binary=(rev.reverse()).toString();
    }
    void display(){
        if(isEvil())
        System.out.println(num+"("+binary+") is evil number.");
        else
        System.out.println(num+"("+binary+") is not an evil number.");
    }
    boolean isEvil(){
        int ctr=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1')
            ctr++;
        }
        return (ctr%2==0)?true:false;
    }
    public static void main(String args[]){
        EvilNum obj=new EvilNum();
        obj.getInput();        
        obj.toBinary();
        obj.display();
    }
    
}