import java.util.*;
class large
{
public static void main(String ar[])
{
int num1,num2;
System.out.println("Enter first number:");
Scanner Sc=new Scanner(System.in);
num1=Sc.nextInt();
System.out.println("Enter second number:");
Scanner Sc1=new Scanner(System.in);
num2=Sc1.nextInt();
if(num1>num2)
System.out.println("First number is larger");
else
System.out.println("Second number is larger");
}
}