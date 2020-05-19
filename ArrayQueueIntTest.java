class ArrayQueueInt{
    protected int queue[];
    protected int front,rear;
    public ArrayQueueInt(int capacity){
        queue=new int[capacity];
        front=-1;
        rear=-1;
    }
    public boolean isEmpty(){
        return front==-1;
    }
    public void insert(int i){
        if(rear==-1){
            front=rear=0;
            queue[rear]=i;
        }
        else if(rear+1<queue.length)
        queue[++rear]=i;
    }
    public int remove(){
        int elem;
        if(isEmpty())
        return 0;
        else{
            elem=queue[front];
            if(front==rear)
            front=rear=-1;
            else
            front++;
        }
        return elem;
    }
}
public class ArrayQueueIntTest{
    public static void main(String args[]){
        ArrayQueueInt obj=new ArrayQueueInt(5);
        System.out.println("...Starting Queue Test...");
        for(int i=0;i<5;i++){
            int j=(int)(Math.random()*100);
            obj.insert(j);
            System.out.println("Inserted: "+j);
        }
        System.out.println();
        while(!obj.isEmpty())
        System.out.println("Deleted: "+obj.remove());
        System.out.println("...Queue Test Over...");
    }
}