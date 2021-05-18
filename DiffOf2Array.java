import java.util.*;

public class DiffOf2Array
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

        int[] diff = getDiff(arr1,arr2);
        int k = diff.length;
        int i = 0;
        while(i<k)
        {
            if(diff[i] != 0)
            {
                break;
            }
            i++;
        }
        for(int j=i;j<k;j++)
        {
            System.out.println(diff[j]);
        }
    }

   public static int[] getDiff(int[] a1,int[] a2)
   {
       int n1 = a1.length;
       int n2 = a2.length;

       int k = n2 > n1 ? n2 : n1;

       int[] arr = new int[k+1];
       
       int borrow = 0;
       n2--;
       n1--;
       while(k>=0 || borrow > 0)
       {
           int d = 0;
           if(n2 >= 0)
           {
               d += a2[n2];
           }
           if(n1 >= 0)
           {
               d -= a1[n1];
           }
           d -= borrow;
           if(d >= 0)
           {
                   borrow = 0;
           }
           else
           {
                    d += 10;
                   borrow = 1;
           }
           arr[k] = d;
           k--;
           n2--;
           n1--;
       }
       return arr;
   }
}