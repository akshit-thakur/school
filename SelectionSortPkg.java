/**
 * TO DO choice==0,choice==1 stuff Merge two sorts in one class and eventually
 * all functions in one class such that I need to initialize for anything once
 * OR One class each for array,string,num
 */
class SelectionSortPkg {
    void selSort(int[] arr, int choice) {
        if (choice == 0) {
            for (int i = 0; i < arr.length; i++) {
                int small = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[small])
                        small = j;
                }
                int temp = arr[small];
                arr[small] = arr[i];
                arr[i] = temp;
            }
        }
    }

    void selSort(float[] arr, int choice) {
        for (int i = 0; i < arr.length; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[small])
                    small = j;
            }
            float temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }

    void selSort(double[] arr, int choice) {
        if (choice == 0) {
            for (int i = 0; i < arr.length; i++) {
                int small = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[small])
                        small = j;
                }
                double temp = arr[small];
                arr[small] = arr[i];
                arr[i] = temp;
            }
        } else if (choice == 1) {
            for (int i = 0; i < arr.length; i++) {
                int small = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > arr[small])
                        small = j;
                }
                double temp = arr[small];
                arr[small] = arr[i];
                arr[i] = temp;
            }
        }
    }

    void selSort(char[] arr, int choice) {
        if (choice == 0) {
            for (int i = 0; i < arr.length; i++) {
                int small = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[small])
                        small = j;
                }
                char temp = arr[small];
                arr[small] = arr[i];
                arr[i] = temp;
            }
        } else if (choice == 1) {
            for (int i = 0; i < arr.length; i++) {
                int small = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > arr[small])
                        small = j;
                }
                char temp = arr[small];
                arr[small] = arr[i];
                arr[i] = temp;
            }
        }
    }

    void selSort(java.lang.String[] arr, int choice) {
        for (int i = 0; i < arr.length; i++) {
            int small = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[small].compareTo(arr[j]) < 0) {
                    small = j;
                }
            }
            java.lang.String temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }

    void selSort(int[][] arr, int row, int column, int choice) {
        int[] b = new int[row * column];
        int ctr = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                b[ctr] = arr[i][j];
                ctr += 1;
            }
        }
        selSort(b, choice);
        ctr = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = b[ctr];
                ctr += 1;
            }
        }
    }

    void selSort(float[][] arr, int row, int column, int choice) {
        float[] b = new float[row * column];
        int ctr = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                b[ctr] = arr[i][j];
                ctr += 1;
            }
        }
        selSort(b, choice);

        ctr = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = b[ctr];
                ctr += 1;
            }
        }
    }

    void selSort(double[][] arr, int row, int column, int choice) {
        double[] b = new double[row * column];
        int ctr = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                b[ctr] = arr[i][j];
                ctr += 1;
            }
        }
        selSort(b, choice);
        ctr = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = b[ctr];
                ctr += 1;
            }
        }
    }

    void selSort(char[][] arr, int row, int column, int choice) {
        char[] b = new char[row * column];
        int ctr = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                b[ctr] = arr[i][j];
                ctr += 1;
            }
        }
        selSort(b, choice);
        ctr = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = b[ctr];
                ctr += 1;
            }
        }
    }
}