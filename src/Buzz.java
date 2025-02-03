import java.util.*;
public class Buzz {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 7 == 0 || n % 10 == 7)
            System.out.println("Bizz Number");
        else
            System.out.println("Not a Buzz Number");
    }
}
