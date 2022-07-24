import java.util.*;
class circlec
{
	int r;
	float pi=3.14F;
	public circlec ()
	{
		r=0;
	}
	public circlec(int r)
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
		circlec a =new circlec(10);
		float pr=a.calpri();
		float ae=a.calarea();
		System.out.printf("Area:%.2fcm² and Perimeter:%.2fcm", ae,pr);
	}
	
}