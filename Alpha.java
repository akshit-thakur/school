
//can't handle more than one upper case easily
import java.util.InputMismatchException;
import java.util.Scanner;

class Alpha {
    java.lang.String word;
    int count, ctr;
    char lowerCases[], upperCases[];

    Alpha(java.lang.String str) {
        word = str;
        lowerCases = new char[word.length()];
        upperCases = new char[word.length()];
        count = 0;
        ctr = 0;
    }

    void fillCases() {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLowerCase(ch)) {
                lowerCases[ctr] = ch;
                ctr += 1;
            } else if (Character.isUpperCase(ch)) {
                upperCases[ctr] = ch;
                count += 1;
            }
        }
    }

    void sortCases() {
        for (int i = 0; i < ctr; i++) {
            for (int j = 0; j < ctr - i - 1; j++) {
                if (lowerCases[j] > lowerCases[j + 1]) {
                    char temp = lowerCases[j];
                    lowerCases[j] = lowerCases[j + 1];
                    lowerCases[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (upperCases[j] > upperCases[j + 1]) {
                    char temp = upperCases[j];
                    upperCases[j] = upperCases[j + 1];
                    upperCases[j + 1] = temp;
                }
            }
        }
    }

    void display() {
        System.out.println("Word now is: ");
        for (int i = 0; i < count; i++)
            System.out.print(upperCases[i]);
        for (int i = 0; i < ctr; i++)
            System.out.print(lowerCases[i]);
        System.out.println();
    }

    public static void main(String args[]) {
        try {
            Scanner read = new Scanner(System.in);
            System.out.println("Enter the word: ");
            java.lang.String str = read.nextLine();
            Alpha obj = new Alpha(str);
            obj.fillCases();
            obj.sortCases();
            obj.display();
            read.close();
        } catch (InputMismatchException e) {
            System.out.println("Error in input! Program Ending");
        }
    }
}