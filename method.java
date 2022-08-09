class boy
{
	String name;
	int age;
	double height;
	
	void info(String n,int a,double h)
	{	
	name = n;
	age = a;
	height = h;
	System.out.println("name :"+ n + "\nage :"+ a + "\nheight :" + h );
	}	
}
public class method
{
	public static void main (String args[])
	{
		boy z = new boy();
		z.info("Ali",19,5.9);
		
	}
	
}