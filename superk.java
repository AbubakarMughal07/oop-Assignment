class parent
{
	int x,y,z;
	parent(int a ,int b)
	{
		x = a;
		y = b;
		System.out.println((x+y));
	 }
}
class child extends parent
{
	child(int a, int b,int c)
	{
	super(a,b);
	z = c;
	System.out.println((x*y+z));
	}

}
public class superk
{
	public static void main (String args[])
	{
		parent p = new parent(2,3);
		child c = new child (3,5,1);
		
	}
	
}
