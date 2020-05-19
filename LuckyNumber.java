class LuckyNumber {
    public static void main(String args[]) {
        int a[] = new int[30];
        int b[] = new int[30];
        int c[] = new int[30];
        int d[] = new int[30];
        int e[] = new int[30];
        int f[] = new int[30];
        System.out.println("Original List.");
        for (int i = 0; i < 30; i++) {
            a[i] = i + 1;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int m = 2;
        for (int i = 0; i < 5; i++) {
            int ctr = 0;
            for (int k = 0; k <= 29; k++) {
                int j = k + 1;
                switch (i) {
                case 0:
                    if (j % m != 0 && a[k] != 0) {
                        b[ctr] = a[k];
                        ctr++;
                    }
                    break;
                case 1:
                    if (j % m != 0 && b[k] != 0) {
                        c[ctr] = b[k];
                        ctr++;
                    }
                    break;
                case 2:
                    if (j % m != 0 && c[k] != 0) {
                        d[ctr] = c[k];
                        ctr++;
                    }
                    break;
                case 3:
                    if (j % m != 0 && d[k] != 0) {
                        e[ctr] = d[k];
                        ctr++;
                    }
                    break;
                case 4:
                    if (j % m != 0 && e[k] != 0) {
                        f[ctr] = e[k];
                        ctr++;
                    }
                    break;
                default:
                    ;
                }
            }
            m++;
        }
        System.out.println("The lucky numbers are: ");
        for (int i = 0; i < f.length; i++) {
            if (f[i] != 0)
                System.out.print(f[i] + " ");
        }
    }
}