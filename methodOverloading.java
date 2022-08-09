class math
{
	int x;
	int y;
	int z;
	void add(int a,int b)
	{
		x = a;
		y = b;
		z = a+b;
		System.out.println( "x+y :" + z);
	}
	void sub(int c,int d)
	{
		x = c;
		y = d;
		z = c-d;
		System.out.println("x-y :" + z) ;
	}
}
public class methodOverloading
{
	public static void main (String agrs[])
	{
		math addition = new math();
		addition.add(5,2);
		math subs = new math();
		subs.sub(5,2);
		
	}
}

