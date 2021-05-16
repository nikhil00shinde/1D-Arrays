import java.util.*;

public class span1
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
        int k = getSpan(arr);
        System.out.println(k);
    }
    public static int getSpan(int[] arr)
    {
        // span -> difference btw maximun element and minimum element

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            // check for maximum value
            if(arr[i] > max)
            {
                max = arr[i];
            }

            // check for minimum value
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        int span = max - min;
        return span;
    }
}