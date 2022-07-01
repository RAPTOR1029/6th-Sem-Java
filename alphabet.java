import java.util.*;
class alphabet
{
  public static void main(String ar[])
{
System.out.println("Enter any character:");
Scanner s=new Scanner(System.in);
char a = s.next().charAt(0);

if(a>64 && a<91)
{
System.out.println("Capital Alphabet");
}
else if(a>96 && a<123)
{
System.out.println("Small Alphabet");
}
else if(a>47 && a<58)
{
System.out.println("Digit");
}

else if(a>=0 && a<48 ||a>=58 && a<65 || a>=91 && a<97 || a>122 && a<=127)
{System.out.println("Special Symbol");
}
}
}