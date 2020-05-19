class ArrayStackTest{
    public static void main(String args[]){
        ArrayStack obj=new ArrayStack(5);
        int j;
        System.out.println("Starting Stack Test...");
        for(int i=0;i<5;i++){
            j=(int)(Math.random()*100);
            obj.push(j);
            System.out.println("Pushed: "+j);
        }
        System.out.println();
        while(!obj.isEmpty())
        System.out.println("Popped: "+obj.pop());
        System.out.println("---Stack Test Over---");
    }
}
