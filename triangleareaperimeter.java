import java.util.*;
class tri
{
	double x, y, z;
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


public class triangleareaperimeter
{
	public static void main(String ar[])
	{
		tri a =new tri();
		a.getsd();
		double pr=a.calpri();
		double ae=a.calarea();
		System.out.printf("Area:%.2fcm² and Perimeter:%.2fcm", ae,pr);
	}
	
}