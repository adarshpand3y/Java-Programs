/**
 * Program created by Parenthesis
 * Find me on YT/Parenthesis
 * 
 * Write a program to enter a sentence and print the sentence after removing all vowels.
 */

import java.util.Scanner;
class RemoveAllVowels
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s, ns = "";
        System.out.println("Enter a string");
        s = sc.nextLine();
        // Main calculation
        for (int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            {
                continue;
            }
            else
            {
                ns = ns+c;
            }
        }
        // Display
        System.out.println("The final output after removing all vowels is:-");
        System.out.println(ns);
    }
}
