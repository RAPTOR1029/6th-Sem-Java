import java.util.*;
class tric
{
	double x, y, z;
	public tric ()
	{
		x=0;
		y=0;
		z=0;
	}
	public tric(double a, double b, double c)
	{
		x=a;
		y=b;
		z=c;
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
		tric a =new tric(7,8,9);
		double pr=a.calpri();
		double ae=a.calarea();
		System.out.printf("Area:%.2fcm² and Perimeter:%.2fcm", ae,pr);
	}
	
}