import java.util.*;
public class SumArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
            int k=arr[i];
            sum=sum+k;
        }
        System.out.println(sum);
    }
}
