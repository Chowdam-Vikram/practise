import java.util.Scanner;;
public class Harshad
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,sum=0;
        int temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        if(temp%sum==0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not Harshad Number");
    }
}
