//import java.util.*;
//public class DuplicateArray
//{
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
//        for (i = 0; i < n; i++)
//        {
//            if(arr[i]==k)
//                c++;
//        }
//        if(k>1)
//            System.out.println("Duplicate found");
//        else
//            System.out.println("Not duplicate Found");
//    }
//}

import java.util.*;
public class DuplicateArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int c = 0;
        for (i = 0; i < n; i++)
        {
            if(arr[i]==k)
                c++;
        }
        if(k==1)
            System.out.println("Not Duplicate found");
        else
            System.out.println("Duplicate Found");
    }
}