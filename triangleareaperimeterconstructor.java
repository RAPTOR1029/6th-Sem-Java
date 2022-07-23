import java.util.*;
class tri
{
	double x, y, z;
	public tri ()
	{
		x=0;
		y=0;
		z=0;
	}
	public tri(double a, double b, double c)
	{
		x=a;
		y=b;
		z=c;
	}
	void getsd()
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter first side :");
		x=s.nextDouble();
		System.out.println("Enter second side :");
		y=s.nextDouble();
		System.out.println("Enter third side :");
		z=s.nextDouble();
	}
	double calarea()
	{
		double p;
		p=(x+y+z)/2.0;
		double area=Math.sqrt((p*(p-x)*(p-y)*(p-z)));
		return area;
	}
	double calpri()
	{
		return (x+y+z)/2.0;
	}
}


public class triangleareaperimeterconstructor
{
	public static void main(String ar[])
	{
		tri a =new tri(7,8,9);
		double pr=a.calpri();
		double ae=a.calarea();
		System.out.printf("Area:%.2fcm² and Perimeter:%.2fcm", ae,pr);
	}
	
}