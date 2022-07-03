import java.util.*;
class insurance
{
  public static void main(String ar[])
{
System.out.println(" For Good health press 1, For Bad health press 2");
System.out.println("Enter Health status:");
Scanner s=new Scanner(System.in);
int a = s.nextInt();
System.out.println("For Male Gender press 1, For Female Gender press 2");
System.out.println("Enter Gender:");
int b = s.nextInt();
System.out.println("For City press 1, For Village press 2");
System.out.println("Enter Area:");
int d = s.nextInt();
System.out.println("Enter Age:");
int c = s.nextInt();

if(a>2 && a<1 || b>2 || b<1 || d>2 || d<1)
{
System.out.println("Invalid Data Entered");
}
else
{
if(c>24 && c<36)
{
if(a==1 && b==1 && d==1)
{
System.out.println("Person should be insured. Premium=Rs 4 per thousand. Max amount he can be insured=Rs 200000.");
}
else if(a==1 && b==2 && d==1)
{
System.out.println("Person should be insured. Premium=Rs 3 per thousand. Max amount she can be insured=Rs 100000.");
}
else if(a==2 && b==1 && d==2)
{
System.out.println("Person should be insured. Premium=Rs 6 per thousand. Max amount he can be insured=Rs 10000.");
}
else
{
System.out.println("Person can't be insured");
}

}
else
{
System.out.println("Person can't be insured");
}


}

}
}
