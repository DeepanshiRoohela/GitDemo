package practise;

import org.testng.annotations.Test;

public class ps1 extends ps{
	
	@Test
	public void testRun()
	{
		doThis();
		ps2 ps =new ps2(3);
		System.out.println(ps.increament());
		System.out.println(ps.decreamnet());
		System.out.println(ps.multipleThree());
	}

}
