/**Contains Number operations for user generated library.
1. checkPerfectNumber(int) //checks a number is perfect or not. Returns true or false.
2. checkAmphotericNum(int) //checks if a number is amphoteric or not. Returns 1 if true,0 if false.
3. checkArmstrongNum(int)  //checks if a number is armstrong. Returns 1 if true,0 if false.
4. checkHappyNumber(int)   //checks if a number is happy number. Returns 1 if true,0 if false.
5. checkSpecialNumber(int) //checks if a number is special number. Returns 1 if true,0 if false.
6. checkPalindromeNumber(int) //checks if a number is palindrome. Returns 1 if true,0 if false.
7. getSumOfDigits(int) //returns the sum of digits in a number.
8. getLCM(int,int) //returns LCM of 2 numbers.
9. getHCF(int,int) //returns GCD/HCF of 2 numbers.
10. getFactors(int) //returns array of factors of a number. 
11. getTable(int)   //return array of table of a number till 10.
12. getOddSum(int)  //returns the sum of odd numbers till n. eg. if n=7, sum=1+3+5+7.
13. getEvenSum(int) //returns the sum of even numbers till n. e.g. if n=7 sum=2+4+6.
14. getASCII(char)  //returns ASCII value of a character.
15. checkPythagorusTriplet(int,int,int) //check if 3 numbers are pythagorus triplets. Returns 1 if first int is hypotunuse H,returns 2 if second int is H and 3 if third int is H,0 if none of these.
16. checkCarpreker(int) //check if number is Carpreker number. Returns 1 if ture,0 if false
17. checkISBN(int) //if (1*first digit+2*second digit+..+10*tenth digit)%11==0,returns 1 else 0.
18. getFtoC(double) //converts degree F to degree C.
19. getCtoF(double) //converts degree C to degree F.
20. getQuadRoot(int,int,int) //finds quadRoots..void type
*/
class Numbers {
    boolean checkPerfectNum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return (sum == n) ? true : false;
    }

    boolean checkAmphotericNum(int n) {
        int d = 0, s = (n * n);
        if (s < 100)
            d = s % 10;
        else if (s > 99 && s < 999)
            d = s % 100;
        else if (s > 999 && s < 10000)
            d = s % 100;
        else
            System.out.println("Invalid input");
        return (d == n) ? true : false;
    }

    boolean checkArmstrongNum(int num) {
        int digit = 0, sum = 0;
        while (num > 0) {
            digit = (int) num % 10;
            sum += (int) Math.pow(digit, 3);
            num = (int) num / 10;
        }
        return (sum == num) ? true : false;
    }

    boolean checkMagicNumber(int num) {
        int s = 0, d;
        while (num > 0) {
            d = num % 10;
            s += d;
            num /= 10;
        }
        while (s > 9) {
            int t = s;
            s = 0;
            while (t > 0) {
                d = t % 10;
                s += d;
                t /= 10;
            }
        }
        return (s == 1) ? true : false;
    }

    boolean checkSpecialNumber(int num) {
        int d = 0, p = 1, s = 0, temp = num;
        while (num != 0) {
            d = num % 10;
            p *= d;
            s += d;
            num /= 10;
        }
        int r = (p + s);
        return (r == temp) ? true : false;
    }

    boolean checkPalindromeNumber(int num) {
        int r = 0, d = 0, c = num;
        while (num != 0) {
            d = num % 10;
            r = (r * 10) + d;
            num /= 10;
        }
        return (r == c) ? true : false;
    }

    int getSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    int getLCM(int x, int y) {
        int lcm = x * y;
        for (int i = 2; i <= lcm; i++) {
            if ((lcm % i) == 0 && (i > x) && (i > y) && (x % i == 0) && (y % i == 0))
                lcm = i;
        }
        return lcm;
    }

    int getHCF(int a, int b) {
        int nmr = Math.max(a, b), dmr = Math.min(a, b), result = 0;
        while (result > 0) {
            result = nmr % dmr;
            nmr = dmr;
            if (result != 0)
                dmr = result;
        }
        return dmr;
    }

    int[] getFactors(int x) {
        int ctr = 0, array[] = new int[x];
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                array[ctr] = i;
                ctr++;
            }
        }
        return array;
    }

    int[] getTable(int x) {
        int array[] = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = (i + 1) * x;
        return array;
    }

    int getOddSum(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0)
                sum += i;
        }
        return sum;
    }

    int getEvenSum(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0)
                sum += i;
        }
        return sum;
    }

    int getASCII(char ch) {
        int x = (int) ch;
        return x;
    }

    int checkPythagorusTriplet(int a, int b, int c) {
        if ((a * a) == ((b * b) + (c * c)))
            return 1;
        else if ((b * b) == ((a * a) + (c * c)))
            return 2;
        else if ((c * c) == ((a * a) + (b * b)))
            return 3;
        else
            return 0;
    }

    int checkCarpreker(int n) {
        java.lang.String strNum = Integer.toString(n);
        int divider = (int) Math.pow(10, strNum.length());
        int square = n * n;
        int result = (square / divider) + (square % divider);
        return (result == n) ? 1 : 0;
    }

    boolean checkISBN(int n) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int digit = n % 10;
            sum += (i * digit);
            n /= 10;
        }
        return (sum % 11 == 0) ? true : false;
    }

    double getFtoC(double f) {
        return f - 32 / 1.8;
    }

    double getCtoF(double c) {
        return 1.8 * c + 32;
    }

    void getQuadRoots(int a, int b, int c) {
        float D = ((b * b) - (4 * a * c)), root1, root2;
        if (D > 0) {
            System.out.println("The roots are real and distinct");
            root1 = (float) ((-b) + (Math.sqrt(D)) / (2 * a));
            root2 = (float) ((-b) - (Math.sqrt(D)) / (2 * a));
            System.out.println("The two roots of the equation are:");
            System.out.println(root1 + " and " + root2);
        } else if (D == 0) {
            System.out.println("The roots are real and equal.");
            root1 = (float) ((-b) + (Math.sqrt(D)) / (2 * a));
            System.out.println("The two roots of the equation are:");
            System.out.println(root1 + " and " + root1);
        } else
            System.out.println("The roots are complex and unequal. No solution");
    }
}