import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Paragraph {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of sentences : ");
        int n = Integer.parseInt(input.readLine());
        if (n < 1 || n >= 4) {
            System.out.println("Minimum words should be 1 and maximum should be less than 4");
        } else {
            System.out.println("Enter paragraph");
            java.lang.String str = input.readLine();
            str = str.toUpperCase();
            int len = str.length();
            int j = 0, words = 0, ctr = 0;
            java.lang.String query = "";
            java.lang.String a[] = new java.lang.String[len];
            int b[] = new int[len];
            for (int i = 0; i < len; i++) {
                if (n != 0) {
                    char ch = str.charAt(i);
                    if (ch == '.' || ch == '?') {
                        n--;
                    }
                    if (ch == '.' || ch == '?' || ch == ' ' || ch == ',' || ch == '/' || ch == '"' || ch == ':'
                            || ch == ';' || ch == '-' || ch == '_' || ch == '&') {
                        words++;
                        java.lang.String word = str.substring(j, i);
                        if (i != len - 1) {
                            j = i + 1;
                        }
                        if (str.charAt(j) == '"' || str.charAt(j) == '.' && i != len - 1) {
                            j = i + 2;
                        }
                        a[ctr] = word;
                        ctr++;
                    }
                }
            }
            for (int k = 0; k < ctr; k++) {
                if (a[k] != "") {
                    query = a[k];
                }
                int count = 1;
                for (int l = k + 1; l < ctr; l++) {
                    if (a[l].equals(query) && a[l] != null) {
                        count++;
                        a[l] = "";
                    }
                }
                b[k] = count;
            }
            for (int m = 0; m < b.length - 1; m++) {
                int small = m;
                for (int o = m + 1; o < b.length; o++) {
                    if (b[o] < b[small]) {
                        small = o;
                    }
                }
                int temp = b[small];
                b[small] = b[m];
                b[m] = temp;
                java.lang.String temp2 = a[small];
                a[small] = a[m];
                a[m] = temp2;
            }
            System.out.println("Total words: " + words);
            System.out.println("In ascending order ");
            System.out.println("Word " + "\t" + "Frequency");
            for (int p = 0; p < a.length; p++) {
                if (a[p] != null) {
                    if (a[p] != "") {
                        System.out.println(a[p] + "\t" + b[p]);
                    }
                }
            }
        }
    }
}