class ArrayStack{
    protected int Stack[];
    protected int ctr;
    public ArrayStack(int capacity){
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