class TwinPrime {
    public static void main(String args[]) {
        for (int i = 2; i < 1001; i++) {
            int flag = 0, ctr = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    ctr++;
                if (ctr == 0 && j == i - 1) {
                    for (int k = 2; k < i + 2; k++) {
                        if ((i + 2) % k == 0)
                            ctr++;
                        if (ctr == 0 && k == i + 1)
                            flag = 1;
                    }
                }
            }
            if (flag == 1)
                System.out.print(i + "," + (i + 2) + " ");
        }
    }
}