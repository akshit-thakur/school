/** TO DO Merge with Sorts */
class ArrayDisplay {
    void display(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }

    void display(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }

    void display(double[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }

    void display(char[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }

    void display(java.lang.String[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }

    void display(int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    void display(float[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    void display(double[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    void display(char[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    void display(String[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}