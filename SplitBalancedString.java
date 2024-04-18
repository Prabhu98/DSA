package leetcode;

import java.util.Iterator;
/*Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.

 

*/

public class SplitBalancedString {
	
	public static int balancedStringSpilt(String s) {
		
		int total = 0;
		int r = 0;
		int l = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == 'L') {
				l++;
			}else {
				r++;
			}
			if(l == r) {
				total++;
				r = 0;
				l = 0;
			}
			
		}
		return total;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String s = "RLRRLLRLRL";
            int balancedStringSpilt = balancedStringSpilt(s);
            System.out.println(balancedStringSpilt);
	}

}
