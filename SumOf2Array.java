import java.util.*;

public class SumOf2Array
{
    public static void main(String[] args)
    {
       Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i] = scn.nextInt();
        }

        int[] sum = getSum(arr1,arr2);
        int k = sum.length;
        boolean start = false;
        if(sum[0] != 0)
        {
            System.out.println(sum[0]);
            start = true;
        }
        for(int i=1;i<k;i++)
        {
            if(start && sum[i] == 0)
            {
                continue;
            }
            else
            {
                System.out.println(sum[i]);
                start = false;
            }
            
        }
    }
    public static int[] getSum(int[] a1,int[] a2)
    {
        int n1 = a1.length;
        int n2 = a2.length;
         int k = n2 > n1 ? n2 : n1;
        int[] arr = new int[k+1];
        
        int carry = 0;
        n1--;
        n2--;
        while(k>=0 || carry>0)
        {
            int d = 0;
            if(n1>=0)
            {
               d += a1[n1];
            }
            if(n2 >= 0)
            {
                d += a2[n2];
            }
            d += carry;
            carry = d/10;
            arr[k] = d%10;
            n1--;
            n2--;
            k--;
        }
        return arr;
    }

}