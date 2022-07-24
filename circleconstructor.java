import java.util.*;
class circle
{
	int r;
	float pi=3.14F;
	public circle ()
	{
		r=0;
	}
	public circle(int r)
	{
		this.r=r;
	}
	float calarea()
	{
		return pi*(r*r);
	}
	float calpri()
	{
		return 2*pi*r;
	}
}


public class circleconstructor
{
	public static void main(String ar[])
	{
		circle a =new circle(10);
		float pr=a.calpri();
		float ae=a.calarea();
		System.out.printf("Area:%.2fcm² and Perimeter:%.2fcm", ae,pr);
	}
	
}