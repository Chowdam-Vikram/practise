import java.util.Scanner;
public class fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;
        for(int i=a;a<=n;i++);
        {
            System.out.print(a+" ");
            c=a;
            a=a+b;
            b=c;
        }
    }
}