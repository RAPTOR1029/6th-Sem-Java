import java.util.*;
class circle
{
	int r;
	float pi=3.14F;
	
	void getsd()
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter radius :");
		r=s.nextInt();
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


public class circleqclass
{
	public static void main(String ar[])
	{
		circle a =new circle();
		a.getsd();
		float pr=a.calpri();
		float ae=a.calarea();
		System.out.printf("Area:%.2fcm² and Perimeter:%.2fcm", ae,pr);
	}
	
}






