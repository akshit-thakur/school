public class ArrayStackIntTest{
    public static void main(String args[]){
        ArrayStackInt obj=new ArrayStackInt(5); 
        int j;
        System.out.println(".....Starting Stack Test.....");
        for(int i=0;i<5;i++){
            j=(int)(Math.random()*100);
            obj.push(j);
            System.out.println("Pushed: "+j);
        }
        System.out.println();
        while(!obj.isEmpty())
        System.out.println("Popped: "+obj.pop());
        System.out.println("-----Stack Test Over-----");
    }
}
class ArrayStackInt{
    protected int Stack[];
    protected int ctr;
    public ArrayStackInt(int capacity){
        Stack=new int[capacity];
        ctr=-1;
    }
    public boolean isEmpty(){
        return ctr==-1;
    }
    public void push(int i){
        if(ctr+1<Stack.length)
        Stack[++ctr]=i;
    }
    public int pop(){
        if(isEmpty())
        return 0;
        return Stack[ctr--];
    }
}

