import java.util.*;
class steel
{
  public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Hardness");
double a = s.nextDouble();
System.out.println("Enter Carbon content:");
double b = s.nextDouble();
System.out.println("Enter Tensile strength");
double c = s.nextDouble();


if(a>50 && b<0.7 && c>5600)
{
System.out.println("Grade 10 Steel");
}
else if (a>50 && b<0.7 && c<=5600)
{
System.out.println("Grade 9 Steel");
}
else if(a<=50 && b<0.7 && c>5600)
{
System.out.println("Grade 8 Steel");
}
else if(a>50 && b>=0.7 && c>5600)
{
System.out.println("Grade 7 Steel");
}
else if(a>50 || b<0.7 || c>5600)
{
System.out.println("Grade 6 Steel");
}
else
{
System.out.println("Grade 5 Steel");
}



}
}