class BinarySearch
{
    public static void main(String args[])
    {
        int[] ar = {1, 3, 4, 7, 14, 17, 19, 23, 36, 75};
        int left=0, right=ar.length-1, mid=0, pos=0, target=4;
        boolean is_found=false;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(ar[mid]==target)
            {
                is_found=true;
                pos=mid;
                break;
            }
            else if(target<ar[mid])
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
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