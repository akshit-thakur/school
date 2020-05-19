class NamedNumDemo{
    public static void main(String args[]){
        NamedNumbers obj=new NamedNumbers();         
        if(obj.isAmphoteric(9376))
        System.out.println("9376 is amphoteric number");
        if(obj.isArmstrong(153))
        System.out.println("153 is armstrong number");
        if(obj.isCarpreker(999))
        System.out.println("999 is carpreker number");
        if(obj.isPerfect(28))
        System.out.println("28 is perfect number.");
        obj.amphotericList(1,10000);
        obj.armstrongList(1,10000);
        if(obj.isPalindrome(121))
        System.out.println("121 is palindrome number");
    }
}