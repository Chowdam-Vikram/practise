import java.util.*;
public class Tech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        while (n > 0) {
            n = n / 10;
            c++;
        }
        if (c % 2 == 0)
            System.out.println("Tech Number");
        else
            System.out.println("Not Tech Number");
    }
}