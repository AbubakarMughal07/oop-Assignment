class boyInfo
{
	String name;
	int age;
	double height;
	double grade;
	double per;
	
	boyInfo(String a,int b,double c)
	{
		name = a;
		age = b;
		height = c;
		System.out.println("name:"+a+"\nage:"+b+"\nheight:"+c);
	}
	boyInfo(double d,double e)
	{
		grade = d;
		per = e;
		System.out.println("\ngrade:"+d+"\npercentage:"+e);
	}
}
public class constructorOverloading
{
	public static void main (String args[])
	{
		boyInfo personal = new boyInfo("Ali",20,5.9);
		boyInfo academic = new boyInfo(3.5,75);
	}
}