package DSA_Practice;

import java.util.Arrays;
import java.util.HashMap;


import org.junit.Test;
public class TwoSum {
	
	/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
	 * 
	 * 
	 * 
	 */

	
	@Test
    public void example1(){
        int[] num={1,3,2,1};
        int target=5;
       // Assert.assertEquals(two_Sum_BF(num, target), new int[] {0,1});
        System.out.println(Arrays.toString(two_Sum_TwoPointer(num, target)));
    }
	
	public int[] two_Sum_TwoPointer(int[] num, int target) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> hmap = new HashMap<>();
		
		int[] sno = new int[2];
		
		for(int i=0;i<num.length;i++) {
			int a = target-num[i];
			if(hmap.containsKey(a)) {
				sno[0] = hmap.get(a);
				sno[1] = i;
				break;			
		  }
			hmap.put(num[i], i);
			//return new int[] {};
		}
		
		return new int[] {sno[0],sno[1]};
	}

	/*for(int i=0;i<nums.length;i++){
        for(int j=i+1 ;j<nums.length;j++){
            int finalresult = target - nums[i];
            if(finalresult == nums[j]){
                return new int[] {i,j};
            }
        }
    }
    return new int[] {};*/
}
