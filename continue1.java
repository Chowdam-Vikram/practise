import java.util.Scanner;
class Continue1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==5 && j==5) {
                    continue;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}