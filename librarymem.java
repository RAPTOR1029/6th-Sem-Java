import java.util.*;
class librarymem
{
  public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Number of days:");
int a = s.nextInt();


if(a<1)
{
System.out.println("Invalid Input");
}
else if (a<=5)
{
System.out.println("Fine = 50 paisa");
}
else if(a>5 && a<=10)
{
System.out.println("Fine = 1 rupee");
}
else if(a>10 && a<=30)
{
System.out.println("Fine = 5 rupees");
}
else
{
System.out.println("Membership is cancelled");
}


}
}