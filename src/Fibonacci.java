//import java.util.*;
//public class Fibonacci {
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int a=0,b=1,c;
//        int count=0;
//        int i;
//        for(i=a;count<=n;i++)
//        {
//            System.out.print(a+" ");
//            c=a;
//            a=a+b;
//            b=c;
//            count++;
//        }
//    }
//}

import java.util.*;
public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;
        int i;
        for(i=a;a<=n;i++)
        {
            System.out.print(a+" ");
            c=a;
            a=a+b;
            b=c;
        }
    }
}
