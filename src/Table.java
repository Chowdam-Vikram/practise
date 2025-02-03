//import java.util.*;
//public class Table {
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int i;
//        for(i=1;i<=10;i++)
//        {
//            System.out.println(n+" * "+i+" = " +n*i);
//        }
//    }
//}


//import java.util.*;
//public class Table {
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int i;
//        for(i=1;i*i<=n;i++)
//        {
//            System.out.print(i*i+" ");
//        }
//    }
//}


import java.util.*;
public class Table {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            System.out.print(i*i+" ");
        }
    }
}