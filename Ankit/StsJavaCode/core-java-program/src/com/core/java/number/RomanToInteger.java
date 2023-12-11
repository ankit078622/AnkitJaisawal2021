/**Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */
package com.core.java.number;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToInteger {
	public static void main(String[] args) {
		System.out.println(romanToInt("IV"));

	}
	public static int romanToInt(String s) {
	    Map<Character, Integer> symbolValues = new HashMap<>();
	    symbolValues.put('I', 1);
	    symbolValues.put('V', 5);
	    symbolValues.put('X', 10);
	    symbolValues.put('L', 50);
	    symbolValues.put('C', 100);
	    symbolValues.put('D', 500);
	    symbolValues.put('M', 1000);
	    int result = 0;
	    for (int i = 0; i < s.length(); i++) {
	        int value = symbolValues.get(s.charAt(i));
	        if (i < s.length() - 1 && value < symbolValues.get(s.charAt(i+1))) {
	            result -= value;
	        } else {
	            result += value;
	        }
	    }
	    return result;
	}


}
