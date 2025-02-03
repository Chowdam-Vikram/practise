import java.util.Scanner;
public class PerfectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            int k = arr[i];
            int sum = 0;
            for (int j = 1; j < k; j++) {
                if (k % j == 0)
                    sum = sum + j;
            }
            if (sum == k)
                System.out.println("Perfect array");
            else
                System.out.println("Not Perfect Array");
        }
    }
}
