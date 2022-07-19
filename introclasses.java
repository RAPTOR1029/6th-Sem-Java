import java.util.*;
class rectangle
{
int length;
int breadth;
public void getlb()
{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the length and breadth of rectangle:");
	length=s.nextInt();
	breadth=s.nextInt();
}
public int cali()
{
	return length*breadth;
}
}

public class introclasses
{
	public static void main(String ar[])
	{
		rectangle r = new rectangle();
		r.getlb();
		int a=r.cali();
		System.out.println("Area is "+a);
	}
}