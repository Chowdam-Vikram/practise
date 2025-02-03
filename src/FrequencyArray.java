//import java.util.*;
//public class FrequencyArray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        int i;
//        for (i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int k = sc.nextInt();
//        int c = 0;
//        for (i = 0; i < n; i++) {
//            if (arr[i] == k)
//                c++;
//        }
//        System.out.println(c);
//        sc.close();
//    }
//}

import java.util.*;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read array size

        int arr[] = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt(); // Number to check frequency
        int c = 0;

        // Count occurrences of k
        for (int i = 0; i < n; i++) {
            if (arr[i] == k)
                c++;
        }

        System.out.println(c); // Print frequency count
        sc.close(); // Close scanner
    }
}

