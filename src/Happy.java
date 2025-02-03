import java.util.*;
public class Happy
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int r,sum=0;
            int temp=n;
            while(temp>9)
            {
                while(temp>0)
                {
                    r=temp%10;
                    sum=sum+r*r;
                    temp=temp/10;
                }
                temp=sum;
                sum=0;
            }
            if(temp==1)
                System.out.println("Happy");
            else
                System.out.println("Not Happy");
        }
}
