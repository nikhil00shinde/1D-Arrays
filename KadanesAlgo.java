// KADANE'S ALGORITHM -> It is the Maximum Subarray(continous part) Sum.

import java.util.*;

public class KadanesAlgo
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
        
        int ans =  getMaximumSubarraySum(arr);
        System.out.println(ans);
    }
    public static int getMaximumSubarraySum(int[] arr)
    {
        int n = arr.length;
        
        int msum = Integer.MIN_VALUE;
        int csum = 0;
        for(int i=0;i<n;i++)
        {
            if(csum < 0)
            {
                csum = arr[i];
            }
            else
            {
                csum += arr[i];
            }
            if(msum < csum)
            {
                msum = csum;
            }
        }
        return msum;
    }
}