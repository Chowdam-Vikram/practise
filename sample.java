import java.util.Scanner;
public class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n1 value:");
        int n1=sc.nextInt();
        System.out.print("Enter n2 value:");
        int n2= sc.nextInt();
        System.out.println(n1++);
        System.out.println(++n1);
        System.out.println(n2++);
        System.out.println(++n2);
        n1++;
        n2--;
        System.out.println(n1--);
        System.out.println(--n1);
        System.out.println(n2--);
        System.out.println(--n2);
        n2++;
        n1--;
        ++n1;
        ++n2;
        System.out.println("the value of n1 is:"+n1);
        System.out.println("the value of n2 is:"+n2);
    }
}
