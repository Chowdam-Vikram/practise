
import java.util.*;
public class Armstrong1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp, r, sum = 0;
        temp=n;
        while (n > 0) {
            r = n % 10;
            sum += r*r*r;
            n = n / 10;
        }
        if (sum == temp)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
