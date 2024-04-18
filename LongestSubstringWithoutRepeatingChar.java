package DSA_Practice;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingChar {
	


	
	@Test
	public void tc1() {
		String s = "PWWKEW";
		
		int longestSubstring = isLongestSubstring(s);
		System.out.println(longestSubstring);
	}
	
	
	public int isLongestSubstring(String s) {
		
		/*  
		 * 
		 * 
		 * 
		 * 
		 */
		
		int start =0,end=0,currentLength=0,max=0;
		
		Set<Character> hset = new HashSet<>();
		
		while(end < s.length()) {
			
			if(hset.contains(s.charAt(end))) {
				currentLength = end - start;
				hset.remove(s.charAt(start));
				start++;
			} else {
				hset.add(s.charAt(end));
				currentLength = hset.size();
				end++;
			}
			
			max = Math.max(max, currentLength);
		}
		
		
		return max;
		
		
	}
	
}
