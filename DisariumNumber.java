/**
 * Program created by Parenthesis.
 * Find me on YT/Parenthesis.
 * 
 * A number is called Disarium if sum of its digits powered with their respective positions
 * is equal to the number itself.
 *
 * Eg: 135 =  1^1 + 3^2 + 5^3
 * Eg: 89 = 8^1+9^2
 * Some more Disarium numbers are 175, 518, etc.
 */

import java.util.Scanner;
class DisariumNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, n1, pow, dig, sum=0;
        System.out.println("Enter a number");
        n = sc.nextInt();
        n1 = n;
        // Main calculation
        pow = Integer.toString(n).length();
        while (n>0)
        {
            dig = n%10;
            sum = (int) (sum + Math.pow(dig, pow--));
            n /= 10;
        }
        // Checking and display
        if (sum == n1)
            System.out.println("The number is Disarium");
        else
            System.out.println("The number is not Disarium");
    }
}
