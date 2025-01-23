import java.util.Scanner;
class smallest
{
    public static void main(String[] args)
    {
        int a, b, c, smallest, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        a = sc.nextInt();
        System.out.println("Enter b value:");
        b = sc.nextInt();
        System.out.println("Enter c value:");
        c = sc.nextInt();
        temp=a<b?a:b;
        smallest=c<temp?c:temp;
        System.out.println("The smallest number is: "+smallest);
    }
}