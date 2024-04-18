package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	
/*Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.*/
	
	
public static int lengthOfLongestSubstring(String s) {
        
        if (s == null || s.equals("")) {
            return 0;
        }
        // Starting window index
        int start = 0;
        // Ending window index
        int end = 0;
        // Maximum length of substring
        int maxLength = 0;
        // This set will store the unique characters
        Set<Character> uniqueCharacters = new HashSet<>();
        // Loop for each character in the string
        while (end < s.length()) {
            if (uniqueCharacters.add(s.charAt(end))) {
                end++;
                maxLength = Math.max(maxLength, uniqueCharacters.size());
            } else {
                uniqueCharacters.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		int lengthOfLongestSubstring = lengthOfLongestSubstring(s);
		System.out.println(lengthOfLongestSubstring);

	}

}
