import java.util.*;

public class InverseOfArray
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

        int[] temp = inverseArray(arr);
        for(int i=0;i<n;i++)
        {
            System.out.println(temp[i]);
        }
    }
    public static int[] inverseArray(int[] arr)
    {
        int n = arr.length;
        int[] temp = new int[n];
        for(int i=0;i<n;i++)
        {
             temp[arr[i]] = i;
        }
        return temp;
    }
}