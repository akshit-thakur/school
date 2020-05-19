import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BinaryRec {
    void binary(int num) {
        if (num > 0) {
            int d = num % 2;
            binary(num / 2);
            System.out.print(d);
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a decimal.");
        int num = Integer.parseInt(input.readLine());
        BinaryRec obj = new BinaryRec();
        System.out.println("The binary of above decimal is :");
        obj.binary(num);
    }
}
