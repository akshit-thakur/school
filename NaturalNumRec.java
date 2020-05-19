class NaturalNumRec{
    public static void main(String args[]){
        NaturalNumRec obj=new NaturalNumRec();
        System.out.println("The first 20 natural number in reverse order: ");
        obj.printRecursively(20);
    }
    void printRecursively(int n){
        if(n>1){
            System.out.println(n);
            printRecursively(n-1);
        }
        else
        System.out.println(n);
    }
}