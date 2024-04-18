package DSA_Practice;

import java.util.Arrays;

import org.junit.Test;

public class Sort_Array {
	
	@Test
    public void example3(){
        int[] arr = {2,4,1,3};
       System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
	
	 public int[] sortArrayByParity(int[] nums) {
		 
		 int start =0, end = nums.length-1;
		 
		 while(start < end) {
			 
			 if(nums[start] % 2 == 1 && nums[end] % 2 == 0) {
				 int temp  = nums[end];
				 nums[end] = nums[start];
				 nums[start] = temp;
				 start++;
				 end--;
			 }else if(nums[start] % 2 == 0 && nums[end] % 2 == 1) {
				 start++;
				 end--;
			 }else if( nums[start] % 2 == 1 && nums[end] % 2 == 1) {
				 end--;
			 }else if(nums[start] % 2 == 0 && nums[end] % 2 == 0) {
				 start++;
			 }
		 }
		 return nums;
		
		 
		 
	 }

}
