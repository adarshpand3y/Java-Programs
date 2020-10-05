class BubbleSort
{
    public static void main(String[] args)
    {
        int i, j;
        int[] ar = {3, 4, 1, 4, 6, 2, 8, 3};
        // Sorting
        for(i=0; i<ar.length; i++)
        {
            for(j=0; j<ar.length-1-i; j++)
            {
                if (ar[j]>ar[j+1])
                {
                    // Exchanging the values
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        // Displaying the elements
        for(i=0; i<ar.length; i++)
        {
            System.out.println(ar[i]);
        }
    }
}