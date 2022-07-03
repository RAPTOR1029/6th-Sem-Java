import java.util.*;
class trianglee
{
  public static void main(String ar[])
{
System.out.println("Enter sides:");
Scanner s=new Scanner(System.in);
double x = s.nextDouble();
double y = s.nextDouble();
double z = s.nextDouble();
if((x+y>z) && (y+z>x) && (z+x>y))
	{
		System.out.println("Valid Triangle");
	}
	else
	{
		System.out.println("Invalid Triangle");
	}
}
}