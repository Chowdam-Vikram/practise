import java.sql.SQLOutput;
import java.util.*;
public class Sunny {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();;
        int i,a,count=0;
        for(i=1;i<=n;i++)
        {
            a=(i*i)-1;
            if(a==n)
                count++;
        }
        if(count==1)
            System.out.println("Sunny Number");
        else
            System.out.println("Not Sunny Number");
    }
}
