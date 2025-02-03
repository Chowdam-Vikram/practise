//import java.util.*;
//public class NEvenNumbers {
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int i=1,c=0;
//        while(c<n)
//        {
//            if (i % 2 == 0)
//            {
//                System.out.print(i + " ");
//                c++;
//            }
//            i++;
//        }
//    }
//}

import java.util.*;
public class NEvenNumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.print(i*2+" ");
            i++;
        }
    }
}
