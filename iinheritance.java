class parent
{
	int y = 20;
	int x = 30;
		System.out.println(x/y);
class child1 extends parent
{
	void add()
	{
		System.out.println(x+y);
	}
}
class child2 extends parent
{
	void Multiply(){
	System.out.println(x*y);
   } 
} 
}
public class inheritance
{
	public static void main (String args[])
	
	{
		child1 c1= new child1();
		c1.add();
	
	}
	
}