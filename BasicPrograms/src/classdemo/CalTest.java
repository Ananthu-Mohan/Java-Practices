package classdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {

	@Test
	public void testAdd() {
		Cal c = new Cal();
		assertEquals((long)5,c.add(2, 3));
	}

	@Test
	public void testDiff() {
		Cal c = new Cal();
		assertEquals((long)5,c.diff(10,5));
	}

}
