import java.util.*;
class SwappingNumbers
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("A value:");
a=sc.nextInt();
System.out.println("B value:");
b=sc.nextInt();
System.out.println("Before swapping a=" +a + "b="+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping a=" +a + "b="+b);
}
}

