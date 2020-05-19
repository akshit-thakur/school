import java.util.*;
class BaseConvertor{
    private final int MAX_BASE=36; /*a constant to define limits for base input*/
    private final char[] DIGIT_TABLE={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    /*array from which elements to display are taken for base 2-36*/
    void printInBase(int n,int base){ /**checks for invalid input, displays (-) in case of -ve int and calls the method that prins recursively*/
        if(base<2||base>MAX_BASE)
        System.out.println("Invalid base: "+base);
        else{
            if(n<0){
                System.out.print("-");
                n=-n;
            }
            printRecursively(n,base);
            System.out.println();
        }
    }
    private void printRecursively(int n,int base){ /**prints the int in assigned base recursively*/
        if(n>=base)
        printRecursively(n/base,base);
        System.out.print(DIGIT_TABLE[n%base]);
    }   
    void getInput(){ /**gets the number and the base*/
        try{
            Scanner read=new Scanner(System.in);
            System.out.println("Enter the integer: ");
            int x=read.nextInt(); /*gets the number*/
            System.out.println("Enter the base to which you wish to convert the number:");
            int y=read.nextInt(); /*gets the base*/
            printInBase(x,y); /**Working method called here*/
        }
        catch(InputMismatchException e){
            System.out.println("Wrong input format. Try again!");
            getInput();
        }
    }
    public static void main(String args[]){ /**to call input taking method*/
        BaseConvertor obj=new BaseConvertor();
        obj.getInput();
    }
}