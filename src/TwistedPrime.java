import java.util.Scanner;
public class TwistedPrime {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,r,rev=0,count=0;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        for(i=1;i<=rev;i++)
        {
            if(rev%i==0)
                count++;
        }
        if(count==2)
            System.out.println("Twisted Prime");
        else
            System.out.println("Not Twisted Prime");
    }
}
