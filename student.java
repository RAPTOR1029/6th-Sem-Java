import java.util.*;
class student
{
  public static void main(String ar[])
{
System.out.println("Total Marks = 100");
System.out.println("Enter marks in main subject(A):");
Scanner s=new Scanner(System.in);
double a = s.nextDouble();
System.out.println("Enter marks in Subsidiary subject(B):");
double b = s.nextDouble();
if(a>100 || b>100 ||a<0 ||b<0)
{
System.out.println("Invalid marks entered");
}
else
{
if(a>=55 && b>=45)
{
System.out.println("Student has passed");
}
else if(a>=45 && b>=55)
{
System.out.println("Student has passed");
}
else if(a>=65 && b<45)
{
System.out.println("Student is allowed to reappear in B");
}
else
{
System.out.println("Student has failed");
}
}
}
}