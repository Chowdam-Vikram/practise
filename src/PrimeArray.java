import java.util.*;
public class PrimeArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
            int k=arr[i];
            int c=0;
            int j;
            for(j=1;j<k;j++)
            {
                if(k%j==0)
                    c++;
            }
            if(c==1)
                System.out.println("Array Prime");
            else
                System.out.println("Array not Prime");
        }
    }
}
