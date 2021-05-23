// In this problem, we have to print all the subset of an array
// we can do by using the logic of %2 by calculating ,all binary representation of number
// from 1 to 2^n -1, where n is the number of element in the array

import java.util.*;

public class SubsetOfArray
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
        printSubset(arr);
    }
    public static void printSubset(int[] arr)
    {
        // first check how many subset we can form using array 
        // there are total 2^n subset present for n is number of array length
        
        int n = arr.length;
        int tot = (int)Math.pow(2,n);

        for(int i=0;i<tot;i++)
        {
            // first the get binary representation of number i
            int[] binary = getBinary(i,n);
            for(int j=0;j<binary.length;j++)
            {
                if(binary[j] == 1)
                {
                    System.out.print(arr[j]+"\t");
                }
                else
                {
                     System.out.print("-\t");
                }
            }
            System.out.println();
        }

    }
    public static int[] getBinary(int n,int l)
    {
        int[] arr =  new int[l];
          l--;
         while(n>0)
         {
           int d = n%2;
           n = n/2;
           arr[l] = d;
           l--;
         } 
         return arr;
    }


}