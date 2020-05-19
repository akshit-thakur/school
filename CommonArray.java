class CommonArray {
    public static void main(String args[]) {
        int a[] = new int[100];
        int b[] = new int[100];
        int c[] = new int[100];
        int ctr = 0;
        System.out.println("The first array is:");
        for (int i = 0; i < 100; i++) {
            a[i] = 2 * i;
            System.out.print(a[i] + " ");
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("The second array is:");
        for (int j = 0; j < 100; j++) {
            b[j] = 100 - j;
            System.out.print(b[j] + " ");
            if (j % 10 == 0 && j != 0) {
                System.out.println();
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (a[i] == b[j]) {
                    c[ctr] = a[i];
                    ctr++;
                }
            }
        }
        for (int i = 0; i < ctr; i++) {
            int min = i;
            for (int j = i + 1; j < ctr; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = c[min];
            c[min] = c[i];
            c[i] = temp;
        }
        System.out.println();
        System.out.println("The Sorted Common Array is: ");
        for (int l = 0; l < ctr; l++) {
            System.out.print(c[l] + " ");
            if (l % 10 == 0 && l != 0) {
                System.out.println();
            }
        }
    }
}