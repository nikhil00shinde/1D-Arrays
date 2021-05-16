import java.util.*;

public class BarChart
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

        printBarChart(arr);
    }

    public static void printBarChart(int[] arr)
    {
        int n = arr.length;
        // find the maximum element in array
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        for(int i=max;i>0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[j] >= i)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.print("\n");
        }
    }
}