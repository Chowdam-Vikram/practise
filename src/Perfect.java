import java.util.*;
public class Perfect {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0,i;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum = sum + i;
                System.out.println(i + " ");
            }
        }
        if(n==sum)
            System.out.println("Perfect");
        else
            System.out.println("Not Perfect");
        System.out.println(sum);
    }
}
