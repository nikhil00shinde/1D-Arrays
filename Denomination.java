import java.util.*;

public class Denomination
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
        int x = scn.nextInt();
        printDenomination(arr,x);
    }
    public static void printDenomination(int[] arr,int x)
    {
        int n = arr.length;
        int low  =  0;
        int high = n - 1;
        int floor = arr[0];
        int ceil = arr[n-1];
        while(low <= high)
        {
            int mid = (low + high)/2;

            if(arr[mid] == x)
            {
                floor = x;
                ceil = x;
                break;
            }
            else if(x < arr[mid])
            {
                high = mid - 1;
                ceil = arr[mid];
            }
            else
            {
                low = mid + 1;
                floor = arr[mid];
            }
        }
        if(floor == ceil)
        {
            System.out.println(floor);
        }
        else
        {
              System.out.println(ceil+"\n"+floor);
        }

    }
}