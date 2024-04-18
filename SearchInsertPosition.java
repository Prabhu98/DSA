package DSA_Practice;

import org.junit.Test;

public class SearchInsertPosition {
	/*
	 * @Test public void td2() { int[] nums = { 1, 3, 5, 6 }; int matchingTarget =
	 * binarySearch(nums, 5); System.out.println(matchingTarget);
	 * 
	 * }
	 */

	@Test
	public void td1() {
		int[] nums = { 1, 3, 5, 6 };
		int matchingTarget = binarySearch(nums, 2);
		System.out.println(matchingTarget);

	}

	public int binarySearch(int[] nums, int target) {

		int left = 0, right = nums.length - 1;

		int mid = 0;
		
		while(left <= right) {
		
		 mid  = (left+right)/2;
		
		if(nums[mid] < target ) {
			left = mid+1;
		}else if(nums[mid] > target) {
			right = mid-1;
		}else if(nums[mid] == target){
			return mid;
		}
		
	}
		
		return left;
	}

}
