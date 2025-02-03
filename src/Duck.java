//import java.util.Scanner;
//public class Duck {
//    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        if (s.charAt(0) == '0')
//        {
//            System.out.println(s + "Duck Number.");
//        }
//        else if (s.contains("0"))
//        {
//            System.out.println(s + "Duck Number.");
//        }
//        else
//        {
//            System.out.println(s+ "Not Duck Number.");
//        }
//    }
//}


//import java.util.Scanner;
//class Duck
//{
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int r=0;
//        while(n>0)
//        {
//            r=n%10;
//            if(r==0)
//                System.out.println("Duck Number");
//            else
//                System.out.println("Not a Duck Number ");
//            n=n/10;
//        }
//    }
//}


import java.util.Scanner;
class Duck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r, count = 0;
        while (n > 0)
        {
            r = n % 10;
            if (r == 0)
                count++;
            n = n / 10;
        }
        if (count > 0)
            System.out.println("Duck Number");
        else
            System.out.println("Not a duck Number");
    }
}