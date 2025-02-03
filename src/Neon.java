import java.util.*;
public class Neon {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,sum=0,s=n*n;
        while(s>0)
        {
            r=s%10;
            sum=sum+r;
            s=s/10;
        }
        if(sum==n)
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }
}
