import java.util.InputMismatchException;
import java.util.Scanner;

class Anagram {
    java.lang.String str1, str2;

    void getInput() {
        try {
            Scanner read = new Scanner(System.in);
            System.out.println("Enter the first string. ");
            str1 = read.nextLine();
            System.out.println("Enter the second string. ");
            str2 = read.nextLine();
            read.close();
        } catch (InputMismatchException e) {
            System.out.println("Wrong format.Try again");
            getInput();
        }
    }

    void checkAnagram() {
        str1 = removeSpaces(str1.toLowerCase());
        str2 = removeSpaces(str2.toLowerCase());
        if (isAnagram(str1, str2))
            System.out.println("Anagrams");
        else
            System.out.println("Not anagrams");
    }

    java.lang.String removeSpaces(java.lang.String str) {
        java.lang.String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i)))
                temp += str.charAt(i);
        }
        return temp;
    }

    boolean isAnagram(java.lang.String str1, java.lang.String str2) {
        int sum1 = 0, sum2 = 0; // ascii value stored
        for (int i = 0; i < str1.length(); i++)
            sum1 += (int) str1.charAt(i);
        for (int i = 0; i < str2.length(); i++)
            sum2 += (int) str2.charAt(i);
        return sum1 == sum2 ? true : false;
    }

    public static void main(String args[]) {
        Anagram obj = new Anagram();
        obj.getInput();
        obj.checkAnagram();
    }
}