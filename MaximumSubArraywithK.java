package DSA_Practice;

import org.junit.Test;

public class MaximumSubArraywithK {
	
	
	@Test
	public void exa1() {
		int[] nums = {1,2,3,4,5};
		
		int k =3;
		System.out.println(maximumSubarraySum(nums,k));
	}

public int maximumSubarraySum(int[] nums, int k) {
        
        if(k ==0 || nums.length < 3){
            return 0;
        }
        
        int sum =0 , maxsum = Integer.MIN_VALUE;
        
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        
        maxsum = sum;
        
        for(int i=k;i<nums.length;i++){
            sum = sum - nums[i-k] + nums[i];
            maxsum = Math.max(sum,maxsum);
        }
        
        
        
        return maxsum;
    }
}
