/**
 * An integer number in base 10 which is divisible by sum of it digits is said to be a Harshad or Niven Number.
 * An n-harshad or Niven number is an integer number divisible by sum of its digit in base n.
 * Eg: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20, etc.
 */

import java.util.Scanner;
class NivenNumber // Harshad Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, n1, s = 0;
        System.out.println("Enter a number");
        n = sc.nextInt();
        n1 = n;
        while(n>0)
        {
            s = s+(n%10);
            n /= 10;
        }
        if (n1%s == 0)
            System.out.println("The number is Niven or Harshad");
        else
            System.out.println("The number is not Niven or Harshad");
    }
}