package leetcode;

import java.util.HashSet;
import java.util.Set;

public class CountofConsistentString {
	
	public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char c  : allowed.toCharArray()){
            set.add(c);
        }
        int count = words.length;
        for(String word : words){
            for(char c : word.toCharArray()){
                if(!set.contains(c)){
                    count--;
                    break;
                }
            }
        }
		return count;
	}
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String allowed ="ab";
		String[] words = {"ad","bd","aaab","baa","badab"};
		
		int countConsistentStrings = countConsistentStrings(allowed,words);
		System.out.println(countConsistentStrings);

	}

}
