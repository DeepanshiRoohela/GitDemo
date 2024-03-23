package practise;

public class ps2 extends ps3{
	int a ;
	public ps2(int a) {
		// TODO Auto-generated constructor stub
		super(a); // parent class constructor is invoked
		this.a=a; //  this refers to current class variable
	}
	public int increament()
	{
		a=a+1;
		return a;
	}
	public int decreamnet()
	{
		a=a-1;
		return a;
	}
}
