import java.util.Scanner;
public class aa 
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if(ch>='a' && ch<='z'|| ch>='A'&& ch<='Z')
{
System.out.println("alphabet");
}
else if(ch<='0' && ch>='9')
{
System.out.println("numbers");
}
else
{
System.out.println("special character");
}
}
}