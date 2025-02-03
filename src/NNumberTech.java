import java.util.*;
public class NNumberTech {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();;
        int sum=0,p1,p2,temp,i;
        for(i=1;i<=n;i++)
        {
            p1 = i % 100;
            p2 = i / 100;
            sum = p1 + p2;
            temp = sum * sum;
            if (i == temp)
                System.out.print(i + " ");
        }
    }
}
