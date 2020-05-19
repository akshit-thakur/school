import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SwapNum {
    public static int a, b;

    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter two numbers for swapping: ");
        a = Integer.parseInt(input.readLine());
        b = Integer.parseInt(input.readLine());
        System.out.println("The original values are: " + a + "," + b);
        swap(a, b);
        System.out.println("After swapping by call by value, the original values  are: " + a + "," + b);
        SwapNum obj = new SwapNum();
        swap(obj);
        System.out.println("After swapping by call by refernece,the original values  are: " + a + "," + b);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The swapped values are: " + a + "," + b);
    }

    public static void swap(SwapNum obj) {
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
        System.out.println("The swapped values are: " + obj.a + "," + obj.b);
    }
}