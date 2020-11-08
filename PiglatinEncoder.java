/**
 * Program created by Parenthesis.
 * Find me on YT/Parenthesis.
 *
 * Write a program to encode a word into Piglatin. A Piglatin is a word in English in which:-
 *
 * The first vowel occurring in the input word is placed at the start of the new word
 * along with the remaining alphabets of it. The alphabets present before the first vowel
 * are shifted at the end of the new word followed by “ay”.
 *
 * Eg: King -> ingKay
 */

import java.util.Scanner;
class PiglatinEncoder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s, s1, s2, word;
        boolean isPossible = false;
        int pos = 0;
        System.out.println("Input a word");
        s = sc.next();
        for (int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            {
                isPossible = true;
                pos = i;
                break;
            }
        }
        if (isPossible)
        {
            s1 = s.substring(0, pos);
            s2 = s.substring(pos);
            word = s2+s1+"ay";
            System.out.println("The final word is: "+word);
        }
        else
            System.out.println("Piglatin not psossible because this word has no vowels.");
    }
}











