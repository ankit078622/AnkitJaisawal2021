package org.espire.lrucache;

import java.util.HashMap;
import java.util.Iterator;

public class LruCacheNoDuplicate {

	/**
	 * HashMap is used to store value's and it's count
	 */
	private HashMap<Integer, Integer> hashMap;
	private Integer count = 1;
	/**
	 * Variable for LRU cache size it is not changeable while execution
	 */
	private final Integer CACHE_SIZE;

	public LruCacheNoDuplicate(Integer capacity) {
		this.CACHE_SIZE = capacity;
		this.hashMap = new HashMap<>();
	}

	public void addValue(Integer page) {

		if (!hashMap.containsKey(page)) {

			/**
			 * This loop is for counting the page available in the cache
			 */
			Iterator<Integer> itr = hashMap.keySet().iterator();
			while (itr.hasNext()) {
				Integer key = itr.next();
				count = hashMap.get(key);
				count = count + 1;
				hashMap.replace(key, count);
			}

			/**
			 * If the hashmap size is equal to capacity of cache then it will remove least
			 * used page from the hashmap
			 */
			if (hashMap.size() == CACHE_SIZE) {
				Integer max = 0;
				Integer keyMax = 0;
				/**
				 * This loop is for finding the max value of the page which is not used from the
				 * long time
				 */
				Iterator<Integer> itr1 = hashMap.keySet().iterator();
				while (itr1.hasNext()) {
					Integer key = itr1.next();
					Integer value = hashMap.get(key);
					if (max < value) {
						max = value;
						keyMax = key;
					}
				}
				hashMap.remove(keyMax);
				hashMap.put(page, 0);

			}
			/**
			 * If the hashmap size is not equal to capacity of cache then it will simply add
			 * page in the lru cache
			 */
			else if (hashMap.size() < CACHE_SIZE) {

				hashMap.put(page, 0);
			}
		}

	}

	// display contents of cache
	public void display() {
		System.out.println("Page  Time");
		Iterator<Integer> itr = hashMap.keySet().iterator();
		while (itr.hasNext()) {
			Integer key = itr.next();
			System.out.println(key + "     " + hashMap.get(key));
		}
	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		LruCacheNoDuplicate cache = new LruCacheNoDuplicate(3);
		cache.addValue(5);
		cache.addValue(9);
		cache.addValue(7);
		cache.addValue(88);
		cache.addValue(77);

		cache.display();
	}

}
