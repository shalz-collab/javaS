class AreaCirclearg
{
	double r;
	double area;
	void getdata(int x)
	{
    		r=x;
	}
	void cal()
	{
		area=3.14*r*r;
	}
	void disp()
	{
		System.out.println("Output area of circle:"+area);
	}
}
class AreaofCirclearg
 {
	public static void main(String[] args)
	{
		AreaCirclearg obj=new AreaCirclearg();
		obj.getdata(5);
		obj.cal();
		obj.disp();
	}
}