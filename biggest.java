import java.util.Scanner;
class biggest
{
    public static void main(String[] args)
    {
        int a, b, c, biggest, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        a = sc.nextInt();
        System.out.println("Enter b value:");
        b = sc.nextInt();
        System.out.println("Enter c value:");
        c = sc.nextInt();
        temp=a>b?a:b;
        biggest=c>temp?c:temp;
        System.out.println("The biggest number is: "+biggest);
    }
}