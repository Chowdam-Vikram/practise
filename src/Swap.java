//import java.util.*;
//public class Swap {
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int temp;
//        System.out.println("Before swapping:"+a+" "+b);
//        temp=a;
//        a=b;
//        b=temp;
//        System.out.println("After swapping:"+a+" "+b);
//    }
//}

//
//import java.util.*;
//public class Swap {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println("Before swapping:" + a + " " + b);
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("After swapping:" + a + " " + b);
//    }
//}

//import java.util.*;
//public class Swap {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println("Before swapping:" + a + " " + b);
//        a = a * b;
//        b = a / b;
//        a = a / b;
//        System.out.println("After swapping:" + a + " " + b);
//    }
//}

import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping:" + a + " " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping:" + a + " " + b);
    }
}