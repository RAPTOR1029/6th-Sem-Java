
import java.util.*;
class triangle
{
  public static void main(String ar[])
{
System.out.println("Enter sides:");
Scanner s=new Scanner(System.in);
double x = s.nextDouble();
double y = s.nextDouble();
double z = s.nextDouble();
if(x==y && y==z)
{
System.out.println("Equilateral Triangle");
}
else if(x==y || y==z || x==z)
{
System.out.println("Isosceles Triangle");
}
else
{
System.out.println("Scalene Triangle");
}
}
}