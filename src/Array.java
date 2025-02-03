//public class Array
//{
//    public static void main(String[] args)
//    {
//        int arr[]={10,20,30,40,50,60};
//        System.out.println(arr[0]);
//        System.out.println(arr.length);
//    }
//}

//import java.util.*;
//class Array
//{
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        int len= sc.nextInt();
//        int arr[]=new int[len];
//        for(int i=0;i<len;i++)
//        {
//            arr[i]= sc.nextInt();
//            if(arr[i]%2==0)
//                System.out.println(arr[i]+" ");
//        }
//    }
//}



import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            if (i % 2 == 0)
                System.out.println(arr[i] + " ");
        }
    }
}
