/**
 * 
 */
package org.espire.armstrongnumber;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class ArmstrongNumberTest {

	/**
	 * Test method for {@link org.espire.armstrongnumber.ArmstrongNumber#isArmstrongNumber(int)}.
	 */
	@Test
	public void testValidIsArmstrongNumber() {
		assertEquals(true,ArmstrongNumber.isArmstrongNumber(153));
	}
	//Invalid test case
	@Test
	public void testInvalidIsArmstrongNumber() {
		assertEquals(false,ArmstrongNumber.isArmstrongNumber(152));
	}
	
}
