class LinkedStack{
    protected Node top;
    protected int number;
    public LinkedStack(){
        top=null;
        number=0;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public int size(){
        return number;
    }
    public void push(int obj){
        top=new Node(obj,top);
        number++;
    }
    public int pop(){
        if(isEmpty())
        return 0;
        Node tmp=top;
        top=tmp.getLink();
        number--;
        return tmp.getData();
    }
    public int peep(){
        if(isEmpty())
        return 0;
        return top.getData();
    }
}