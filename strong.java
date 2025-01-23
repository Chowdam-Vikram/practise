import java.util.Scanner;
public class strong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r,sum=0,temp;
        temp=n;
        while(n>0);
        {
            r=n%10;
            int i,fact=1;
            for(i=1;i<=r;i++)
            {
                fact=fact*i;
            }
            n=n/10;
            sum=sum+fact;
        }
        if(temp==sum)
            System.out.println("Strong number");
        else
            System.out.println("Not strong number");
    }
}
