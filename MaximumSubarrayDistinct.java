package DSA_Practice;

import java.util.HashMap;

import org.junit.Test;

public class MaximumSubarrayDistinct {
	
	
	@Test
	public void exa1() {
		int[] nums = {1,5,4,2,9,9,9};
		
		int k =3;
		System.out.println(maximumSubarraySum(nums,k));
	}
	/* Intialize i =0,j=0
	 * Intialize long sum =0,maxsum=0
	 * 
	 *  iterate while loop from j=0 to len
	 *  
	 * 
	 *
	 */
	public long maximumSubarraySum(int[] nums, int k) {
		
		int i =0,j=0;
		long sum =0,maxsum =0;
		HashMap<Integer,Integer> hmap = new HashMap<>();
		
		while(j < nums.length) {
			 sum += nums[i];
			 hmap.put(nums[i], hmap.getOrDefault(nums[i], 0)+1);
			 if(j-i+1 < k) {
				 j++;
			 }else if(j-i+1 == k) {
				 if(hmap.size() == k) 
					 maxsum = Math.max(sum,maxsum);
				 sum -= nums[i];
				 hmap.put(nums[i], hmap.get(nums[i])-1);
				 if(hmap.get(nums[i]) == 0)
					 hmap.remove(nums[i]);
				 i++;
				 j++;
					 
			 
		}
		
       
    }
		return maxsum;

}}
