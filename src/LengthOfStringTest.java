import static org.junit.Assert.*;

import org.junit.Test;

public class LengthOfStringTest {

	@Test
	public void testLength() {
		StringThings sT = new StringThings();
		assertEquals(sT.getLength("William"), 7);

	}

	@Test
	public void testAlphabetical() {
StringThings sT = new StringThings();
		assertTrue(sT.isAfter("banana","apple"));
		assertFalse(sT.isAfter("apple","apple"));
		assertFalse(sT.isAfter("apple","banana"));
	}
	@Test
	public void testCapitalize(){
		StringThings sT = new StringThings();
		assertEquals("William Apple", sT.capitalize("william", "apple"));
		
	}

}
