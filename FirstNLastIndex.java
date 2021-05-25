import java.util.*;

public class FirstNLastIndex
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
        int d = scn.nextInt();
        printFirstLastIndex(arr,d);
    }
    public static void printFirstLastIndex(int[] arr,int d)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        
        
        
        int start = indexBinarySearch(arr,low,high,0,d);
        int end =   indexBinarySearch(arr,low,high,1,d);

       
            System.out.println(start);
            System.out.println(end);
    }

    public static int indexBinarySearch(int[] arr,int low,int high,int flag,int d)
    {
        int idx = -1;
         while(low <= high)
        {
            int mid = (low + high)/2;
            if(arr[mid] == d)
            {
                  if(flag == 0)
                  {
                      high = mid - 1;
                  }
                  else
                  {
                      low = mid + 1;
                  }
                  idx = mid;
            }
            else if(arr[mid] > d)
            {
                  high = mid -1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return idx;
    }

}