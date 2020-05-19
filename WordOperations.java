class WordOperations {
    java.lang.String getLongestWord(java.lang.String str) {
        int j = 0, k = 0,len = str.length();
        java.lang.String b[] = new java.lang.String[len];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '.') {
                java.lang.String subStr = str.substring(j, i);
                b[k] = subStr;
                k++;
                j = i + 1;
            }
        }
        java.lang.String big = b[0];
        int limit = big.length();
        for (int n = 0; n < k; n++) {
            int x = b[n].length();
            if (x > limit)
                big = b[n];
        }
        return big;
    }

    void findLetterFrequencyIgnoreCase(java.lang.String str) {
        str = str.toLowerCase();
        int len = str.length(), array[] = new int[len], ctr = 0;
        char letter[] = new char[len];
        for (int i = 0; i < len; i++) {
            int count = 0;
            char ch = str.charAt(i);
            letter[ctr] = ch;
            for (int j = 0; j < len; j++) {
                if (str.charAt(j) == ch && ch != ' ')
                    count++;
            }
            if (ch != ' ') {
                array[ctr] = count;
                ctr++;
            }
            str = str.replace(ch, ' ');
        }
        for (int i = 0; i < ctr; i++) {
            for (int j = 0; j < ctr - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    char temp1 = letter[j];
                    letter[j] = letter[j + 1];
                    letter[j + 1] = temp1;
                }
            }
        }
        System.out.println("Sorted Frequency");
        for (int k = 0; k < ctr; k++)
            System.out.println(letter[k] + ":" + array[k]);
    }

    void findLetterFrequency(java.lang.String str) {
        int len = str.length(), array[] = new int[len], ctr = 0;
        char letter[] = new char[len];
        for (int i = 0; i < len; i++) {
            int count = 0;
            char ch = str.charAt(i);
            letter[ctr] = ch;
            for (int j = 0; j < len; j++) {
                if (str.charAt(j) == ch && ch != ' ')
                    count++;
            }
            if (ch != ' ') {
                array[ctr] = count;
                ctr++;
            }
            str = str.replace(ch, ' ');
        }
        for (int i = 0; i < ctr; i++) {
            for (int j = 0; j < ctr - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    char temp1 = letter[j];
                    letter[j] = letter[j + 1];
                    letter[j + 1] = temp1;
                }
            }
        }
        System.out.println("Sorted Frequency");
        for (int k = 0; k < ctr; k++)
            System.out.println(letter[k] + ":" + array[k]);
    }

    java.lang.String getLastWord(java.lang.String str) {
        int j = str.lastIndexOf(' ');
        return str.substring(j, str.length());
    }

    void findBibliography(java.lang.String str) {
        int j = 0, k = 0, a[] = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                j = i + 1;
                a[k] = j;
                k++;
            }
        }
        for (int i = 0; i < (k - 1); i++)
            System.out.print(str.charAt(a[i]) + ".");
        System.out.print(str.substring(j, str.length()));
    }

    int getVowels(java.lang.String str) {
        str = str.toUpperCase();
        int ctr = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                ctr++;
        }
        return ctr;
    }

    int getDoubleLetter(java.lang.String str) {
        str = str.toUpperCase();
        int count = 0, len = str.length();
        for (int i = 0; i < len - 1; i++) {
            char ch = str.charAt(i);
            char ch1 = str.charAt(i + 1);
            if (ch1 == ch)
                count++;
        }
        return count;
    }

    int getWordCount(java.lang.String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == '?')
                count++;
        }
        return count;
    }

    int getWordCount(java.lang.String str, java.lang.String q) {
        int j = 0, count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                java.lang.String subStr = str.substring(j, i);
                if (subStr.equalsIgnoreCase(q))
                    count++;
                j = i + 1;
            }
        }
        return count;
    }
}