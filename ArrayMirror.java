import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ArrayMirror {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[3][3];
        System.out.println("Enter 9 numbers:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                arr[i][j] = Integer.parseInt(input.readLine());
        }
        System.out.println("Original Array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        System.out.println("Mirror Image");
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j >= 0; j--)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}