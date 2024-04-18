package DSA_Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ContainsDuplicateII {
	
	@Test
    public void example1(){
	int[] nums = {1,2,3,1,2,3};
	int k = 2;
	System.out.println(containsNearbyDuplicate(nums,k));
	}
	
	 public boolean containsNearbyDuplicate(int[] nums, int k) {
	        
	        Set<Integer> hset = new HashSet<>();
	        
	        for(int i=0;i< nums.length;i++){
	            
	            if(!hset.add(nums[i])){
	                return true;
	            }else if(hset.size() > k){
	                hset.remove(nums[i-k]);
	            }
	            }
	        return false;
	        }
	        

}
