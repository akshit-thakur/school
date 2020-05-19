/*Developer's Notes
    Functions contained:
    *int array sort[ascending]
    *float array sort[do]
    *double array sort[do]
    *char array sort[do]
    *String array sort[do]
 */
class BubbleSortPkg {
    void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void sort(float arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    float temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void sort(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void sort(char arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void sort(String arr[]) {
        /*
         * for(int i=0;i<arr.length;i++){ for(int j=0;j<arr.length-i-1;j++){
         * if(arr[j]>arr[j+1]){ double temp=arr[j]; arr[j]=arr[j+1]; arr[j+1]=temp; } }
         * }
         */
    }

    void sort(int[][] arr, int row, int column) {
        int[] b = new int[row * column];
        int ctr = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                b[ctr] = arr[i][j];
                ctr += 1;
            }
        }
        sort(b);
        ctr = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = b[ctr];
                ctr += 1;
            }
        }
    }

    void sort(float[][] arr, int row, int column) {
        float[] b = new float[row * column];
        int ctr = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                b[ctr] = arr[i][j];
                ctr += 1;
            }
        }
        sort(b);
        ctr = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = b[ctr];
                ctr += 1;
            }
        }
    }

    void sort(double[][] arr, int row, int column) {
        double[] b = new double[row * column];
        int ctr = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                b[ctr] = arr[i][j];
                ctr += 1;
            }
        }
        sort(b);
        ctr = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = b[ctr];
                ctr += 1;
            }
        }
    }

    void sort(char[][] arr, int row, int column) {
        char[] b = new char[row * column];
        int ctr = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                b[ctr] = arr[i][j];
                ctr += 1;
            }
        }
        sort(b);
        ctr = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = b[ctr];
                ctr += 1;
            }
        }
    }
}