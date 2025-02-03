import java.util.*;
public interface NNumberprime {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1,c=0;
        while(c<n) {
            int j = 1, count = 0;
            while (j <= i)
            {
                if (i % j == 0)
                    count++;
                j++;
            }
            if (count == 2)
            {
                System.out.print(i + " ");
                c++;
            }
            i++;
        }
    }
}
