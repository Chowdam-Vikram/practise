import java.util.*;
public class Reverse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,rev=0,temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println(rev);
    }
}
