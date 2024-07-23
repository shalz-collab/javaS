import java.util.*;
class Addss
{
	Scanner sc=new Scanner(System.in);
	int a;
	int b;
	int c;
	void getdata(int x,int y)
	{
		a=x;
		b=y;
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
class arguTest
{
	public static void main(String[] args)
	{
		Addss obj=new Addss();
		obj.getdata(10,20);
		obj.cal();
		obj.disp();
	}
}