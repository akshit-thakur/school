class LinkStackTest {
    protected static LinkedStack obj;

    public static void main(String args[]) {
        int i;
        obj = new LinkedStack();
        System.out.println(".....Starting Stack Test.....");
        for (int a = 0; a < 5; ++a) {
            i = (int) (Math.random() * 100);
            obj.push(i);
            System.out.println("Pushed: " + i);
        }
        int ele = obj.peep();
        System.out.println("Element at top is: " + ele + "\n");
        int c = obj.size();
        System.out.println(c);
        while (!obj.isEmpty())
            System.out.println("Popped: " + obj.pop());
        System.out.println("Stack Test Over.");
    }
}
