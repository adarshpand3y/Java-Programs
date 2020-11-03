/**
 * A pronic number is a number which is the product of
 * two consecutive integers, that is, a number of the form n(n + 1).
 * Few pronic numbers are 0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, etc.
 * ICSE 2018
 *
 * 6 = 2*3
 * 12 = 3*4
 */

import java.util.Scanner;
class PronicNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean is_pronic = false;
        System.out.println("Enter a number");
        n = sc.nextInt();
        for (int i=1; i<n; i++)
        {
            if (i*(i+1) == n)
            {
                is_pronic = true;
                break;
            }
        }
        if (is_pronic)
            System.out.println("The number is pronic");
        else
            System.out.println("The number is not pronic");
    }
}