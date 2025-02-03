import java.util.*;
public class Disarium{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int c=0,temp;
        temp=n;
        while(n>0)
        {
            n=n/10;
            c++;
        }
        n=temp;
        int r,sum=0;
        while(n>0)
        {
            r=n%10;
            sum+=Math.pow(r,c);
            c--;
            n=n/10;
        }
        if(sum==temp)
            System.out.println("Disarium");
        else
            System.out.println("Not Disarium");
    }
}
