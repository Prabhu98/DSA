package DSA_Practice;

import org.junit.Assert;
import org.junit.Test;

public class Circular {
	
	@Test
    public void example1() {
        //Positive Test Data
        String s = "BZA";
        int expectedTime = 4;
        Assert.assertEquals(expectedTime, circularPattern(s));
    }

	/*
	 * 
	 * *
     * --- Pseudo Code ---
     *
     * DS: ASCII
     *
     * example: AZGB
     *
     * 1. Create two int variables diff and sum
     * 2. Convert given String into charArray
     * --Loop Starts--
     * 3. Traverse till length of given char array
     * 4. If first element, subtract the ascii of element from 'A' and assign it to diff --> 'Z'-'A'
     * 5. else, subtract the ascii of element from previous element --> 'N' - 'Z'
     * 6. Calculate Math.abs of diff (Since there could be negative)
     * 7. As the pattern is circular and as we have to calculate minimum moves,
     * 		7a. If diff is >13 (half the number of alphabets), subtract it from 26 (max no of alphabets).
     * 8. sum += diff;
     * --Loop Ends--
	 * 
	 */
	
	private int circularPattern(String s) {
		// TODO Auto-generated method stub
		 int count=0, val=0, sum=0;
	        char[] c=s.toCharArray();
	        for(int i=0; i<s.length(); i++){
	            if(i==0)
	                val = c[i]-'A';
	            else
	                val=Math.abs(c[i]-c[i-1]);
	            count= val>13?26-val: val;
	            sum+=count;
	        }
	        return sum;

	}

}
