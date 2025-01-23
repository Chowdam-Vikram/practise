import java.util.Scanner;
class square

{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n) {
            if(i*i==n)
                System.out.print("perfect square");
            i++;
        }
    }
}