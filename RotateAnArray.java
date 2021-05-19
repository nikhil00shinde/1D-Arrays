import java.util.*;

public class RotateAnArray
{

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }

        // firstApproach(arr,r);
        // secondApproach(arr,r);
        print(arr);
    }
    public static void firstApproach(int[]arr,int r)
    {
         int n  = arr.length;
        r = r%n;
        reverse(arr,0,n-r);
        reverse(arr,n-r,n);
        reverse(arr,0,n);
    }
    public static void print(int[] arr)
    {
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
           System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void reverse(int[] arr,int s,int e)
    {
        int i = s;
        int n = (e+s)/2;
         int j = 0;
        while(i < n)
        {
            int temp = arr[i];
            arr[i] = arr[e-j-1];
            arr[e-j-1] = temp;
            i++;
            j++;
        }
    }
    public static void secondApproach(int[] arr,int r)
    {
        int n = arr.length;
        r = r%n;
        // in these approach we can use shifting the every element 1 place by r times
        // but this approach is not that much optimized
        for(int i=0;i<r;i++)
        {
            int k = arr[n-1];
            int temp = arr[0];
            for(int j=1;j<n;j++)
            {
                int temp1 = arr[j];
                 arr[j] = temp;
                 temp = temp1;
            }
            arr[0] = k;
        } 
        print(arr);
    }
}