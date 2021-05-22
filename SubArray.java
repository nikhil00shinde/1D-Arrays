// print all the subarray 
import java.util.*;

public class SubArray
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
        printSubArray(arr);
    }
    public static void printSubArray(int[] arr)
    {
        int n = arr.length;
        
        for(int st=0;st<n;st++)
        {
            for(int et=st;et<n;et++)
            {
                for(int i=st;i<=et;i++)
                {
                    System.out.print(arr[i]+"\t");
                }
                System.out.println();
            }
        }
    }
}