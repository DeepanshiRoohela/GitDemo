package practise;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ps {
	public void doThis()
	{
		System.out.println("I m here");
	}
	@BeforeMethod
	public void print()
	{
		System.out.println("execute before every method");
	}
	

}
