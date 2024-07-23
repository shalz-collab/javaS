import java.util.*;
class Adds
{
	Scanner sc=new Scanner(System.in);
	int a;
	int b;
	int c;
	void getdata()
	{
		System.out.println("Enter A value:");
		a=sc.nextInt();
		System.out.println("Enter B value:");
		b=sc.nextInt();

    	}
	void cal()
	{
		c=a+b;
	}
	void disp()
	{
		System.out.println("Output:"+c);
	}
}
class Testadd
{
	public static void main(String[] args)
	{
		Adds obj=new Adds();
		obj.getdata();
		obj.cal();
		obj.disp();
	}
}