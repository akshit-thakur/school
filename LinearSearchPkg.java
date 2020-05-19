class LinearSearchPkg {
    int search(int[] arr, int q) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == q)
                count++;
        }
        return count;
    }

    int search(float[] arr, float q) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == q)
                count++;
        }
        return count;
    }

    int search(double[] arr, double q) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == q)
                count++;
        }
        return count;
    }

    int search(char[] arr, char q) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == q)
                count++;
        }
        return count;
    }

    int search(String[] arr, String q) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(q))
                count++;
        }
        return count;
    }
}