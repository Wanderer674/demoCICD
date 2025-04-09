package test.Lab8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaculator {
	@Test
	public void testsum() {
		Caculator caculator = new Caculator();
		Assert.assertEquals(caculator.sum(2, 3),5);
	}
	public void testsub() {
		Caculator caculator = new Caculator();
		Assert.assertEquals(caculator.sub(2, 2),0);
	}
}
