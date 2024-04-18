package DSA_Practice;

import java.util.HashSet;

public class ContainDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		
		HashSet<Integer> hset = new HashSet<>();
		
		boolean flg = false;
		
		for(int i=0;i<nums.length;i++) {
			if(hset.contains(nums[i])) {
				flg = true;
				break;
			}else {
				hset.add(nums[i]);
			}
		}
		
		System.out.println(flg);

	}

}
