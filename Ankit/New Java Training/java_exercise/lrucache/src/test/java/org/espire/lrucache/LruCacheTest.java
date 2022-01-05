package org.espire.lrucache;

import static org.junit.Assert.*;

import org.junit.Test;

public class LruCacheTest {

	@Test
	public void testLruCache() {
		LruCache cache = new LruCache(4);
		cache.refer(1);
		cache.refer(2);
		cache.refer(3);
		cache.refer(1);
		cache.refer(4);
		cache.refer(5);
		cache.refer(2);
		cache.refer(2);
		cache.refer(1);
		cache.display();
	}
	
	/**
	 *Test case for LruCacheNoDuplicate class
	 */
	@Test
	public void testLruCacheNoDuplicate() {
		LruCacheNoDuplicate cache = new LruCacheNoDuplicate(3);
		cache.addValue(5);
		cache.addValue(9);
		cache.addValue(7);
		cache.addValue(88);
		cache.addValue(77);
		cache.addValue(1);
		cache.addValue(2);
		cache.addValue(3);
		cache.display();
	}

}
