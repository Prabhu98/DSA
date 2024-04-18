package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class IntersactionTwoArray {
	
public static int[] intersect(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums1){
            set.add(i);
        }
        
        HashSet<Integer> inter = new HashSet<Integer>();
        for(int i:nums2){
            if(set.contains(i)){
                inter.add(i);
            }
        }
        
        
        int[] result = new int[inter.size()];
        int index = 0;
        for(int i : inter){
          result[index++] = i;
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1 = {1,2,2,1};
		
		int[] nums2 = {2,2};
		
		int[] intersect = intersect(nums1,nums2);
		System.out.println(Arrays.toString(intersect));
		
		
		

	}

}
