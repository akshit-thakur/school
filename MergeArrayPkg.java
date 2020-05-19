class MergeArrayPkg {
    int[] merge(int arr[], int arr2[], int n, int m) {
        int[] resultArr = new int[m + n];
        for (int i = 0; i < n; i++)
            resultArr[i] = arr[i];
        for (int i = 0; i < m; i++)
            resultArr[i + n] = arr2[i];
        for (int i = 0; i < (m + n) - 1; i++) {
            for (int j = i + 1; j < m + n; j++) {
                if (resultArr[i] == resultArr[j]) {
                    n -= 1;
                    for (int k = j; k < m + n; k++)
                        resultArr[k] = resultArr[k + 1];
                    j -= 1;
                }
            }
        }
        return resultArr;
    }

    float[] merge(float arr[], float arr2[], int n, int m) {
        float[] resultArr = new float[m + n];
        for (int i = 0; i < n; i++)
            resultArr[i] = arr[i];
        for (int i = 0; i < m; i++)
            resultArr[i + n] = arr2[i];
        for (int i = 0; i < (m + n) - 1; i++) {
            for (int j = i + 1; j < m + n; j++) {
                if (resultArr[i] == resultArr[j]) {
                    n -= 1;
                    for (int k = j; k < m + n; k++)
                        resultArr[k] = resultArr[k + 1];
                    j -= 1;
                }
            }
        }
        return resultArr;
    }

    double[] merge(double arr[], double arr2[], int n, int m) {
        double[] resultArr = new double[m + n];
        for (int i = 0; i < n; i++)
            resultArr[i] = arr[i];
        for (int i = 0; i < m; i++)
            resultArr[i + n] = arr2[i];
        for (int i = 0; i < (m + n) - 1; i++) {
            for (int j = i + 1; j < m + n; j++) {
                if (resultArr[i] == resultArr[j]) {
                    n -= 1;
                    for (int k = j; k < m + n; k++)
                        resultArr[k] = resultArr[k + 1];
                    j -= 1;
                }
            }
        }
        return resultArr;
    }

    char[] merge(char arr[], char arr2[], int n, int m) {
        char[] resultArr = new char[m + n];
        for (int i = 0; i < n; i++)
            resultArr[i] = arr[i];
        for (int i = 0; i < m; i++)
            resultArr[i + n] = arr2[i];
        for (int i = 0; i < (m + n) - 1; i++) {
            for (int j = i + 1; j < m + n; j++) {
                if (resultArr[i] == resultArr[j]) {
                    n -= 1;
                    for (int k = j; k < m + n; k++)
                        resultArr[k] = resultArr[k + 1];
                    j -= 1;
                }
            }
        }
        return resultArr;
    }

    String[] merge(String arr[], String arr2[], int n, int m) {
        String[] resultArr = new String[m + n];
        for (int i = 0; i < n; i++)
            resultArr[i] = arr[i];
        for (int i = 0; i < m; i++)
            resultArr[i + n] = arr2[i];
        for (int i = 0; i < (m + n) - 1; i++) {
            for (int j = i + 1; j < m + n; j++) {
                if (resultArr[i].equals(resultArr[j])) {
                    n -= 1;
                    for (int k = j; k < m + n; k++)
                        resultArr[k] = resultArr[k + 1];
                    j -= 1;
                }
            }
        }
        return resultArr;
    }
}