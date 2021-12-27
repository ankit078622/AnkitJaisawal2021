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

}
