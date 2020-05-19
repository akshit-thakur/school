class NumberConverter {
    java.lang.String addBinary(int a, int b) {
        java.lang.String binary1 = decimalToBinary(a);
        java.lang.String binary2 = decimalToBinary(b);
        java.lang.String add = "0", sum = "", zeroAdd = "";
        int len1 = binary1.length();
        int len2 = binary2.length();
        int len = Math.max(len1, len2);
        if (len1 < len2) {
            for (int i = 0; i < len2 - len1; i++)
                zeroAdd += "0";
            binary1 = zeroAdd.concat(binary1);
        } else if (len2 < len1) {
            for (int i = 0; i < len1 - len2; i++)
                zeroAdd += "0";
            binary2 = zeroAdd.concat(binary2);
        }
        for (int i = len - 1; i >= 0; i--) {
            add += java.lang.String.valueOf(binary1.charAt(i)) + java.lang.String.valueOf(binary2.charAt(i));
            if (add.equals("000")) {
                sum += "0";
                add = "0";
            }
            if (add.equals("001") || add.equals("010") || add.equals("100")) {
                sum += "1";
                add = "0";
            }
            if (add.equals("011") || add.equals("101") || add.equals("110")) {
                sum += "0";
                add = "1";
            }
            if (add.equals("111")) {
                if (i == 0)
                    sum += "11";
                else
                    sum += "1";
                add = "1";
            }
        }
        StringBuffer number = new StringBuffer(sum);
        return (number.reverse()).toString();
    }

    java.lang.String addBinary(java.lang.String a, java.lang.String b) {
        java.lang.String add = "0", sum = "", zeroAdd = "";
        int len1 = a.length();
        int len2 = b.length();
        int len = Math.max(len1, len2);
        if (len1 < len2) {
            for (int i = 0; i < len2 - len1; i++)
                zeroAdd += "0";
            a = zeroAdd.concat(a);
        } else if (len2 < len1) {
            for (int i = 0; i < len1 - len2; i++)
                zeroAdd += "0";
            b = zeroAdd.concat(b);
        }
        for (int i = len - 1; i >= 0; i--) {
            add += java.lang.String.valueOf(a.charAt(i)) + java.lang.String.valueOf(b.charAt(i));
            if (add.equals("000")) {
                sum += "0";
                add = "0";
            }
            if (add.equals("001") || add.equals("010") || add.equals("100")) {
                sum += "1";
                add = "0";
            }
            if (add.equals("011") || add.equals("101") || add.equals("110")) {
                sum += "0";
                add = "1";
            }
            if (add.equals("111")) {
                if (i == 0)
                    sum += "11";
                else
                    sum += "1";
                add = "1";
            }
        }
        StringBuffer number = new StringBuffer(sum);
        return (number.reverse()).toString();
    }

    int binaryToDecimal(java.lang.String str) {
        int num = 0, p = 0;
        for (int i = str.length(); i > 0; i--) {
            if (str.charAt(i - 1) == '0')
                p++;
            else {
                num += Math.pow(2, p);
                p++;
            }
        }
        return num;
    }

    int octalToDecimal(java.lang.String octal) {
        int p = 0, num = 0;
        for (int i = octal.length(); i > 0; i--) {
            switch (octal.charAt(i - 1)) {
            case '1':
                num += Math.pow(8, p);
                break;
            case '2':
                num += (2 * Math.pow(8, p));
                break;
            case '3':
                num += (3 * Math.pow(8, p));
                break;
            case '4':
                num += (4 * Math.pow(8, p));
                break;
            case '5':
                num += (5 * Math.pow(8, p));
                break;
            case '6':
                num += (6 * Math.pow(8, p));
                break;
            case '7':
                num += (7 * Math.pow(8, p));
                break;
            }
            p++;
        }
        return num;
    }

    int hexaToDecimal(java.lang.String hexa) {
        int p = 0, num = 0;
        for (int i = hexa.length() - 1; i >= 0; i--) {
            switch (hexa.charAt(i)) {
            case '1':
                num += Math.pow(16, p);
                break;
            case '2':
                num += (2 * (Math.pow(16, p)));
                break;
            case '3':
                num += (3 * (Math.pow(16, p)));
                break;
            case '4':
                num += (4 * (Math.pow(16, p)));
                break;
            case '5':
                num += (5 * (Math.pow(16, p)));
                break;
            case '6':
                num += (6 * (Math.pow(16, p)));
                break;
            case '7':
                num += (7 * (Math.pow(16, p)));
                break;
            case '8':
                num += (8 * (Math.pow(16, p)));
                break;
            case '9':
                num += (9 * (Math.pow(16, p)));
                break;
            case 'A':
                num += (10 * (Math.pow(16, p)));
                break;
            case 'B':
                num += (1 * (Math.pow(16, p)));
                break;
            case 'C':
                num += (12 * (Math.pow(16, p)));
                break;
            case 'D':
                num += (13 * (Math.pow(16, p)));
                break;
            case 'E':
                num += (14 * (Math.pow(16, p)));
                break;
            case 'F':
                num += (15 * (Math.pow(16, p)));
                break;
            }
            p++;
        }
        return num;
    }

    java.lang.String decimalToBinary(int num) {
        java.lang.String str = "";
        while (num > 0) {
            str += java.lang.String.valueOf(num % 2);
            num /= 2;
        }
        StringBuffer number = new StringBuffer(str);
        return (number.reverse()).toString();
    }

    java.lang.String octalToBinary(java.lang.String octal) {
        java.lang.String binary = "";
        for (int i = 0; i < octal.length(); i++) {
            switch (octal.charAt(i)) {
            case '0':
                binary = binary.concat("000");
                break;
            case '1':
                binary = binary.concat("001");
                break;
            case '2':
                binary = binary.concat("010");
                break;
            case '3':
                binary = binary.concat("011");
                break;
            case '4':
                binary = binary.concat("100");
                break;
            case '5':
                binary = binary.concat("101");
                break;
            case '6':
                binary = binary.concat("110");
                break;
            case '7':
                binary = binary.concat("111");
                break;
            }
        }
        while (binary.charAt(0) != '1') {
            if (binary.charAt(0) == '0')
                binary = binary.substring(1, binary.length());
        }
        return binary;
    }

    java.lang.String hexaToBinary(java.lang.String hexa) {
        java.lang.String binary = "";
        for (int i = 0; i < hexa.length(); i++) {
            switch (hexa.charAt(i)) {
            case '0':
                binary = binary.concat("0000");
                break;
            case '1':
                binary = binary.concat("0001");
                break;
            case '2':
                binary = binary.concat("0010");
                break;
            case '3':
                binary = binary.concat("0011");
                break;
            case '4':
                binary = binary.concat("0100");
                break;
            case '5':
                binary = binary.concat("0101");
                break;
            case '6':
                binary = binary.concat("0110");
                break;
            case '7':
                binary = binary.concat("0111");
                break;
            case '8':
                binary = binary.concat("1000");
                break;
            case '9':
                binary = binary.concat("1001");
                break;
            case 'A':
                binary = binary.concat("1010");
                break;
            case 'B':
                binary = binary.concat("1011");
                break;
            case 'C':
                binary = binary.concat("1100");
                break;
            case 'D':
                binary = binary.concat("1101");
                break;
            case 'E':
                binary = binary.concat("1110");
                break;
            case 'F':
                binary = binary.concat("1111");
                break;
            }
        }
        while (binary.charAt(0) != '1') {
            if (binary.charAt(0) == '0')
                binary = binary.substring(1, binary.length());
        }
        return binary;
    }

    java.lang.String binaryToOctal(java.lang.String binary) {
        if (binary.length() % 3 == 1)
            binary = "000".concat(binary);
        else if (binary.length() % 3 == 2)
            binary = "00".concat(binary);
        java.lang.String octal = "";
        int i = binary.length(), j = binary.length() - 3;
        while (j >= 0) {
            switch (binary.substring(j, i)) {
            case "000":
                octal = octal.concat("0");
                break;
            case "001":
                octal = octal.concat("1");
                break;
            case "010":
                octal = octal.concat("2");
                break;
            case "011":
                octal = octal.concat("3");
                break;
            case "100":
                octal = octal.concat("4");
                break;
            case "101":
                octal = octal.concat("5");
                break;
            case "110":
                octal = octal.concat("6");
                break;
            case "111":
                octal = octal.concat("7");
                break;
            }
            i = j;
            j -= 3;
        }
        StringBuffer oct = new StringBuffer(octal);
        return (oct.reverse()).toString();
    }

    java.lang.String decimalToOctal(int num) {
        java.lang.String str = "";
        while (num > 0) {
            str += java.lang.String.valueOf(num % 8);
            num /= 8;
        }
        StringBuffer number = new StringBuffer(str);
        return (number.reverse()).toString();
    }

    java.lang.String hexaToOctal(java.lang.String hexa) {
        java.lang.String temp = hexaToBinary(hexa);
        java.lang.String octal = binaryToOctal(temp);
        return octal;
    }

    java.lang.String binaryToHexa(java.lang.String binary) {
        if (binary.length() % 4 == 1)
            binary = "000".concat(binary);
        else if (binary.length() % 4 == 2)
            binary = "00".concat(binary);
        else if (binary.length() % 4 == 3)
            binary = "0".concat(binary);
        java.lang.String hexa = "";
        int i = binary.length(), j = binary.length() - 4;
        while (j >= 0) {
            switch (binary.substring(j, i)) {
            case "0000":
                hexa = hexa.concat("0");
                break;
            case "0001":
                hexa = hexa.concat("1");
                break;
            case "0010":
                hexa = hexa.concat("2");
                break;
            case "0011":
                hexa = hexa.concat("3");
                break;
            case "0100":
                hexa = hexa.concat("4");
                break;
            case "0101":
                hexa = hexa.concat("5");
                break;
            case "0110":
                hexa = hexa.concat("6");
                break;
            case "0111":
                hexa = hexa.concat("7");
                break;
            case "1000":
                hexa = hexa.concat("8");
                break;
            case "1001":
                hexa = hexa.concat("9");
                break;
            case "1010":
                hexa = hexa.concat("A");
                break;
            case "1011":
                hexa = hexa.concat("B");
                break;
            case "1100":
                hexa = hexa.concat("C");
                break;
            case "1101":
                hexa = hexa.concat("D");
                break;
            case "1110":
                hexa = hexa.concat("E");
                break;
            case "1111":
                hexa = hexa.concat("F");
                break;
            }
            i = j;
            j -= 4;
        }
        StringBuffer hex = new StringBuffer(hexa);
        return (hex.reverse()).toString();
    }

    java.lang.String decimalToHexa(int num) {
        java.lang.String hexa = "";
        while (num > 0) {
            if (num % 16 < 10)
                hexa += java.lang.String.valueOf(num % 16);
            else {
                switch (num % 16) {
                case 10:
                    hexa = hexa.concat("A");
                    break;
                case 11:
                    hexa = hexa.concat("B");
                    break;
                case 12:
                    hexa = hexa.concat("C");
                    break;
                case 13:
                    hexa = hexa.concat("D");
                    break;
                case 14:
                    hexa = hexa.concat("E");
                    break;
                case 15:
                    hexa = hexa.concat("F");
                    break;
                }
            }
            num /= 16;
        }
        StringBuffer number = new StringBuffer(hexa);
        return (number.reverse()).toString();
    }

    java.lang.String octalToHexa(java.lang.String octal) {
        java.lang.String temp = octalToBinary(octal);
        java.lang.String hexa = binaryToHexa(temp);
        return hexa;
    }
}