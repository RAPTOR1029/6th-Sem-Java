import java.util.*;
class worker
{
  public static void main(String ar[])
{
System.out.println("Enter time taken by worker to finish the job:");
System.out.println("Hour:");
Scanner s=new Scanner(System.in);
int x = s.nextInt();
System.out.println("Min:");
int y = s.nextInt();
System.out.println("Sec:");
int z = s.nextInt();

if(y==60 && z==60)
{
x=x+1;
y=1;
z=0;
}
else if(z==60 && y==59)
{
x=x+1;
y=0;
z=0;
}
else if(z==60)
{
y=y+1;
z=0;
}


if(x<0 || y<0 || y>60 || z<0 || z>60)
{
System.out.println("Invalid time!");
}
else
{
if(x<3)
{
System.out.println("Efficient Worker");
}
else if(x>3 && x<4)
{
System.out.println("There should be Improvement in efficiency of Worker");
}
else if(x>4 && x<5)
{
System.out.println("There should be Improvement in efficiency of Worker with the help of a training");
}
else if(x>5)
{
System.out.println("Worker has to leave the company");
}
else if(x==3 &&  y==0 && z==0)
{
System.out.println("Efficient Worker");
}
else if(x==3 &&  y>0 || z>0)
{
System.out.println("There should be Improvement in efficiency of Worker");
}
else if(x==4 &&  y==0 && z==0)
{
System.out.println("There should be Improvement in efficiency of Worker");
}
else if(x==4 &&  y>0 || z>0)
{
System.out.println("There should be Improvement in efficiency of Worker with the help of a training");
}
else if(x==5 &&  y==0 && z==0)
{
System.out.println("There should be Improvement in efficiency of Worker with the help of a training");
}
else if(x==5 &&  y>0 || z>0)
{
System.out.println("Worker has to leave the company");
}
}
}
}