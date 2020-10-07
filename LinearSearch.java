/**
 * A program to implement Linear Search Algorithm in Java.
 * Program created by Parenthesis.
 * Find me on YT/Parenthesis
*/

import java.util.Scanner;
class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] ar = {21, 52, 67, 43, 12, 45, 89, 58};
        boolean is_found = false;
        int num;
        int pos = 0;
        System.out.println("Enter a number");
        num = sc.nextInt();
        for(int i=0; i<ar.length; i++)
        {
            if(ar[i] == num)
            {
                is_found = true;
                pos = i;
                break;
            }
        }
        if(is_found)
        {
            System.out.println("Found at index "+pos);
        }
        else
        {
            System.out.println("Not Found");
        }
    }
}
