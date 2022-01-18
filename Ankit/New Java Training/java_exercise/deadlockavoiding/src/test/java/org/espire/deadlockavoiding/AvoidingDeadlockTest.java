/**
 * 
 */
package org.espire.deadlockavoiding;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class AvoidingDeadlockTest {

	@Test
	public void testAvoidDeadlock() throws InterruptedException {
		SynchroniseThread.avoidDeadlock();
	}

}
