import java.util.Scanner;
class tables
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=11;
        while(i<=20) {
            System.out.println(n + "*" + i + "= " + n * i);
            i++;
        }
    }
}