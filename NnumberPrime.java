import java.util.*;
class NnumberPrime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int i,j;
        int count=0;
        for(i=n1;i<=n2;i++)
        {   
            count =0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                    count++;
                
            }
        if(count==2)
        System.out.print(i+" ");
        }
    }
}