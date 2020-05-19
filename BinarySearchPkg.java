/*include flag to complete search..else goes to infinity*/
class BinarySearchPkg {
    int search(int[] arr, int q) {
        int count = 0, s = 0, e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] == q) {
                count++;
                if (arr[m + 1] == q)
                    s = m + 1;
                else if (arr[m - 1] == q)
                    e = m - 1;
                else
                    break;
            } else if (q > arr[m])
                s = m + 1;
            else
                e = m - 1;
        }
        return count;
    }

    int search(float[] arr, float q) {
        int count = 0, s = 0, e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] == q) {
                count++;
                if (arr[m + 1] == q)
                    s = m + 1;
                else if (arr[m - 1] == q)
                    e = m - 1;
                else
                    break;
            } else if (q > arr[m])
                s = m + 1;
            else
                e = m - 1;
        }
        return count;
    }

    int search(double[] arr, double q) {
        int count = 0, s = 0, e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] == q) {
                count++;
                if (arr[m + 1] == q)
                    s = m + 1;
                else if (arr[m - 1] == q)
                    e = m - 1;
                else
                    break;
            } else if (q > arr[m])
                s = m + 1;
            else
                e = m - 1;
        }
        return count;
    }

    int search(char[] arr, char q) {
        int count = 0, s = 0, e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] == q) {
                count++;
                if (arr[m + 1] == q)
                    s = m + 1;
                else if (arr[m - 1] == q)
                    e = m - 1;
                else
                    break;
            } else if (q > arr[m])
                s = m + 1;
            else
                e = m - 1;
        }
        return count;
    }

    int search(java.lang.String[] arr, java.lang.String q) {
        int s = 0, e = arr.length;
        while (s < e) {
            int m = (s + e) / 2;
            if (q.compareTo(arr[m]) < 0) {
                e = m;
            } else if (q.compareTo(arr[m]) > 0) {
                s = m + 1;
            } else {
                return m;
            }
        }
        return -(s + 1);
    }
}