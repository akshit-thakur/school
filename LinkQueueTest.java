public class LinkQueueTest{
    protected static LinkedQueue obj;
    public static void main(String args[]){
        obj=new LinkedQueue();
        System.out.println("...Starting Queue Test...");
        for(int i=0;i<5;++i){
            int j=(int)(Math.random()*100);
            obj.insert(j);
            System.out.println("Inseted: "+j);
        }
        int ele=obj.peep();
        System.out.println("Element at top is: "+ele+"\n");
        while(!obj.isEmpty())
        System.out.println("Removed: "+obj.remove());
        System.out.println("...Stack Test Over...");
    }
}
class LinkedQueue{
    protected Node front,rear;
    protected int number;
    public LinkedQueue(){
        front=rear=null;
        number=0;
    }
    public boolean isEmpty(){
        return front==null;
    }
    public int size(){
        return number;
    }
    public void insert(int i){
        Node tmp;
        tmp=new Node(i,null);
        if(rear==null)
        front=rear=tmp;
        else{
            rear.setLink(tmp);
            rear=rear.getLink();
        }
        number++;
    }
    public int remove(){
        if(isEmpty())
        return 0;
        Node tmp=front;
        front=tmp.getLink();
        if(front==null)
        rear=null;
        number--;
        return tmp.getData();
    }
    public int peep(){
        if(isEmpty())
        return 0;
        return front.getData();
    }
}
class Node{         
    protected int data;
    protected Node link;
    public Node(){
        link=null;
        data=0;
    }
    public Node(int d,Node n){
        data=d;
        link=n;
    }
    public void setLink(Node n){ 
        link=n;
    }
    public void setData(int d){ 
        data=d;
    }
    public Node getLink(){
        return link;
    }
    public int getData(){ 
        return data;
    }
}