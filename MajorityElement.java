package DSA_Practice;

import org.junit.Test;

public class MajorityElement {
/*
 * 
 * 
 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3



 */
	@Test
	public void exa1() {
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
	}
	public int majorityElement(int[] nums) {
		
		int count = 0;
		
		int res = 0;
		
		
		for(int num : nums) {
			
			if(count == 0) {
				res = num;
			}
			
			if(num == res) {
				count++;
				
			}else {
				count--;
			}
  		}
		return res;
		
	}
	

}

