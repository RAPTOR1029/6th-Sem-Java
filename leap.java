import java.util.*;
class leap
{
  public static void main(String ar[])
{int a;
boolean b=false;
System.out.println("Enter any year:");
Scanner s=new Scanner(System.in);
a=s.nextInt();
if(a%4==0)
{
if(a%100==0)
{
if(a%400==0)
{
b=true;}
else 
b= false;
}
else
b= false;
}
if(b=true)
System.out.println("Leap year");
else
System.out.println("Not a leap year");
}
}