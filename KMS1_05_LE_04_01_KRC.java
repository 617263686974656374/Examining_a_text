
import java.util.Scanner;

public class KMS1_05_LE_04_01_KRC {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int vowels = 0, consonants = 0, punctuationMarks = 0, space = 0;
        char[] vokale = {'a', 'e','i', 'o', 'u'};

        // Chat GPT wrote me all punctuation
        char[] punctuation = {
                '.', ',', ';', ':', '?', '!', '-',
                '–', '—', '(', ')', '[', ']', '{', '}',
                '\'', '"', '„', '“', '«', '»', '/', '\\',
                '…', '*', '&', '#', '@', '%', '+', '=',
                '<', '>', '|', '^', '´', '`', 'ˇ', '¨',
                '°', '_', '§', '¤', '¢', '£', '¥', '€', '©', '®', '™'
        };
        System.out.print("Enter a sentence: ");
        String user = entry.nextLine().toLowerCase();
        for (int i = 0; i < user.length(); i++){
            char oneChar = user.charAt(i);
         
            if (new String(vokale).indexOf(oneChar) >=0){
                vowels++;
            } else if (new String(punctuation).indexOf(oneChar) >=0) {
                punctuationMarks++;
            } else if (oneChar == ' ') {
                space++;
            } else if (Character.isLetter(oneChar)) {
                consonants++;
            }
        }
        System.out.println(STR."The sentence contains:\nVowels: \{vowels}\nConsonants: \{consonants}\nPunctuatinons Marks: \{punctuationMarks}\nSpaces: \{space}");
    }
}
