import java.util.Scanner;
public class Strong {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,sum=0,temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            int fact=1;
            for(int i=1;i<=r;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("Strong");
        else
            System.out.println("Not Strong");
    }
}
