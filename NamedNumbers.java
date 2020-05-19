class NamedNumbers {
    boolean isAmphoteric(int num) {
        int i = (Integer.toString(num)).length();
        return (((num * num) % ((int) (Math.pow(10, i)))) == num) ? true : false;
    }

    void amphotericList(int start, int end) {
        int[] arr = new int[8];
        int ctr = 0;
        for (int i = start; i <= end; i++) {
            if (isAmphoteric(i)) {
                arr[ctr] = i;
                ctr++;
            }
        }
        for (int i = 0; i < ctr; i++)
            System.out.println(arr[i] + " ");
    }

    boolean isArmstrong(int num) {
        int digit = 0, temp = num, sum = 0;
        while (temp > 0) {
            digit = temp % 10;
            sum += (int) Math.pow(digit, 3);
            temp /= 10;
        }
        return (sum == num) ? true : false;
    }

    void armstrongList(int start, int end) {
        int[] arr = new int[8];
        int ctr = 0;
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                arr[ctr] = i;
                ctr++;
            }
        }
        for (int i = 0; i < ctr; i++)
            System.out.println(arr[i] + " ");
    }

    boolean isCarpreker(int num) {
        java.lang.String strNum = Integer.toString(num);
        int divider = (int) Math.pow(10, strNum.length());
        int square = num * num;
        int result = (square / divider) + (square % divider);
        return (result == num) ? true : false;
    }

    void carprekerList(int start, int end) {
        int[] arr = new int[100];
        int ctr = 0;
        for (int i = start; i <= end; i++) {
            if (isCarpreker(i)) {
                arr[ctr] = i;
                ctr++;
            }
        }
        for (int i = 0; i < ctr; i++)
            System.out.println(arr[i] + " ");
    }

    boolean isMagic(int num) {
        int sum = 0, digit;
        while (num > 0) {
            digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        while (sum > 9) {
            int t = sum;
            sum = 0;
            while (t > 0) {
                digit = t % 10;
                sum += digit * digit;
                t /= 10;
            }
        }
        return (sum == 1) ? true : false;
    }

    void magicList(int start, int end) {
        int[] arr = new int[1000];
        int ctr = 0;
        for (int i = start; i <= end; i++) {
            if (isMagic(i)) {
                arr[ctr] = i;
                ctr++;
            }
        }
        for (int i = 0; i < ctr; i++)
            System.out.println(arr[i] + " ");
    }

    boolean isHappy(int num) {
        int sum = 0, digit;
        while (num > 0) {
            digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        while (sum > 9) {
            int t = sum;
            sum = 0;
            while (t > 0) {
                digit = t % 10;
                sum += digit * digit;
                t /= 10;
            }
        }
        return (sum == 1) ? true : false;
    }

    void happyList(int start, int end) {
        int[] arr = new int[118];
        int ctr = 0;
        for (int i = start; i <= end; i++) {
            if (isHappy(i)) {
                arr[ctr] = i;
                ctr++;
            }
        }
        for (int i = 0; i < ctr; i++)
            System.out.println(arr[i] + " ");
    }

    boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }
        return (sum == num) ? true : false;
    }

    void perfectList(int start, int end) {
        int[] arr = new int[4];
        int ctr = 0;
        for (int i = start; i <= end; i++) {
            if (isPerfect(i)) {
                arr[ctr] = i;
                ctr++;
            }
        }
        for (int i = 0; i < ctr; i++)
            System.out.println(arr[i] + " ");
    }

    boolean isISBN(int num) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int digit = num % 10;
            sum += (i * digit);
            num /= 10;
        }
        return (sum % 11 == 0) ? true : false;
    }

    boolean isPalindrome(int n) {
        int temp = n, digit, rev = 0;
        while (n != 0) {
            digit = n % 10;
            rev = (rev * 10) + digit;
            n /= 10;
        }
        return (rev == temp) ? true : false;
    }
}