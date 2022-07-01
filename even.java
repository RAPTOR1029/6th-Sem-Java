import java.util.*;
class even
{
public static void main(String ar[])
{
int num;
System.out.println("Enter any number:");
Scanner Sc=new Scanner(System.in);
num=Sc.nextInt();
if(num%2==0)
System.out.println("Even");
else
System.out.println("Odd");
}
}