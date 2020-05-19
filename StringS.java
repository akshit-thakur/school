import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StringS {
    static java.lang.String text;

    public static void main(String args[]) throws IOException {
        StringS obj = new StringS();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a line of text having 2 identical words: ");
        text = input.readLine();
        System.out.println("Enter the word that has multiple occurences in the text: ");
        java.lang.String recur = input.readLine();
        java.lang.String resultStr = obj.extracText(recur);
        System.out.println("The text that lies between two '" + recur + "' is:\n" + resultStr);
    }

    java.lang.String extracText(java.lang.String str) {
        int j = 0, k = 0, l = 0;
        java.lang.String finalStr = ""; /** stores the words between the two recursive words */
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') { /** finds words */
                java.lang.String word = text.substring(j, i);
                if (str.equals(word)) { /** if it is the recursive word */
                    if (k == 0)
                        k = i + 1; /** stores index of 1st space/letter post the recursive word */
                    else
                        l = j; /** stores index of end of last word before next occurence of recursive word */
                    if (k != 0 && l != 0)
                        finalStr = text.substring(k, l);
                }
                j = i + 1; /** stores the index of first letter of next word */
            }
        }
        return finalStr;
    }
}