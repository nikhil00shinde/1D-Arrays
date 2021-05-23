import java.util.*;

public class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int check = binarySearch(arr,k);
        System.out.println(check);
    }
    public static int binarySearch(int[] arr,int k)
    {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while( i <= j)
        {
            int mid = (i+j)/2;

            if(arr[mid] == k)
            {
                return mid;
            } 
            else if(arr[mid] < k)
            {
                i = mid +1;
            }
            else
            {
               j = mid - 1;
            }
        }
        return -1;
    }
}