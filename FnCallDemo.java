//class X program
class FnCallDemo {
    public static int x = 10, y = 20, temp;

    public static void main(String args[]) {
        System.out.println("The original value of x and y is: " + x + "," + y + " respectively."); // printing original
                                                                                                   // values
        FnCallDemo obj = new FnCallDemo();
        swap(x, y, temp);
        swap1(obj);
        System.out.println("The value of x and y after swapping by call by reference is: " + obj.x + "," + obj.y); // printing
                                                                                                                   // changed
                                                                                                                   // values
    }

    public static void swap(int a, int b, int c) {
        c = a;
        a = b;
        b = c;
        System.out.println("The value of x and y when swapped by call by value is: " + a + "," + b);
    }

    public static void swap1(FnCallDemo obj) {
        temp = obj.x;
        obj.x = obj.y;
        obj.y = temp;
        System.out.println("The values of x and y when swapped by call by reference is: " + obj.x + "," + obj.y);
    }
}
// 25th April 2013