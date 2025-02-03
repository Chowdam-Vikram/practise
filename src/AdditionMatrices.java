import java.util.*;
public class AdditionMatrices {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        int A[][]=new int[r][c];
        int B[][]=new int[r][c];
        int C[][]=new int[r][c];
        int i,j;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                A[i][j]= sc.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                B[i][j]= sc.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(C[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
