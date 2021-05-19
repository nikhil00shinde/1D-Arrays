import java.util.*;

public class ReverseAnArray
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        
        arr = getReverseArray(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] +"\t");
        }
        System.out.println();
    }
    public static int[] getReverseArray(int[] arr)
    {
        // we have to swap the first index of the array to the last index of the array
        int i=0;
        int n = arr.length;
       int n1 = n/2;
        while(i < n1)
        {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
            i++;
        }
        return arr;
    }
}