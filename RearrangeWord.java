
/**Program 7.24 Page 411*/
import java.io.*;

class RearrangeWord {
    java.lang.String txt;
    java.lang.String cxt;
    int len;

    RearrangeWord() {
        txt = "";
        cxt = "";
        len = 0;
    }

    void readWord() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word:");
        txt = input.readLine();
        txt = txt.toUpperCase();
        len = txt.length();
    }

    void convert() {
        if (isVowel(txt.charAt(0))) /** if vowel at first place */
            cxt = txt.concat("Y");
        else {
            for (int i = 0; i < len; i++) {
                if ((isVowel(
                        txt.charAt(i)))) { /** if there is any string in the word,it will make desired substrings */
                    java.lang.String preVowel = txt.substring(0, i); /* stores letters till before the vowel */
                    java.lang.String postVowel = txt.substring(i,
                            len); /* stores the vowel and string till last letter */
                    java.lang.String concatedStr = postVowel.concat(preVowel); /* concats the two */
                    cxt = concatedStr.concat("C"); /* concats C to the resulting string */
                    break;
                }
                if (i == len - 1) /** only reachable if the last letter is not a vowel */
                    cxt = txt.concat("N");
            }
        }
    }

    void display() {
        System.out.println("The word is:" + txt);
        System.out.println("It becomes: " + cxt);
    }

    boolean isVowel(char ch) { /** checks for vowel at the passed index number */
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        return false;
    }

    public static void main(String args[]) throws IOException {
        RearrangeWord obj = new RearrangeWord();
        obj.readWord();
        obj.convert();
        obj.display();
    }
}