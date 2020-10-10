/**
 * A program to implement Selection Sort Algorithm in Java.
 * Created by Parenthesis
 * Find me on YT/Parenthesis
 */
class SelectionSort
{
    public static void main(String args[])
    {
        int[] ar = {4, 5, 1, 6, 7};
        int i, j, min_index;
        // Sorting
        for(i=0; i<ar.length-1; i++)
        {
            min_index = i;
            for(j=i+1; j<ar.length; j++)
            {
                if (ar[j]<ar[min_index])
                {
                    min_index = j;
                }
            }
            int temp = ar[min_index];
            ar[min_index] = ar[i];
            ar[i] = temp;
        }
        // Displaying the sorted array
        for(i=0; i<ar.length; i++)
        {
            System.out.println(ar[i]);
        }
    }
}