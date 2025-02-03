import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 400 == 0)
            System.out.println(" is a Leap Year");

        else if (n % 4 == 0 && n % 100 != 0)
            System.out.println("is a Leap Year");

        else
            System.out.println("is not a Leap Year");

    }
}