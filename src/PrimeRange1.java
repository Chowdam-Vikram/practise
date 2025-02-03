import java.util.*;
class PrimeRange1
{
    public static void main(String[]args){
        int i,j;
        Scanner s= new Scanner (System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for(i=a; i<=b; i++)
        {
            for(j=2; j<=i ; j++)
            {
                if(i%j==0)
                    break;
            }
            if(i==j)
                System.out.print(i+" ");

        }
    }
}