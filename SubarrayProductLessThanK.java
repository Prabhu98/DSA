package DSA_Practice;

import org.junit.Test;

public class SubarrayProductLessThanK {
	
	@Test
	public void tc2() {
		int[] nums = {10,5,2,6}; 
		int k = 100;
		
		int numSubarrayProductLessThanK = numSubarrayProductLessThanK(nums,k);
		System.out.println(numSubarrayProductLessThanK);
	}
	
	
	 public int numSubarrayProductLessThanK(int[] nums, int k) {
	        if(k <=1)return 0;
			
			int i=0,j=0,count=0,product=1;
			
			while(i < nums.length) {
				
				product *= nums[i];
				
				 while(product >=k) {
					 product /= nums[j];
					 j++;
				 }
				
				count += i-j+1; //6+3-1+1
				i++;
			}
			
			 
			return count;
	    }

}
