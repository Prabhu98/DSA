package DSA_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class GroupAnagram {
	
	@Test
	public void td1() {
		String[] words = {"eat","tea","tan","ate","nat","bat"};
		List<String> groupAnagrams = Arrays.asList("eat","tea","tan","ate","nat","bat");
		System.out.println(groupAnagramsII(words));
	}
	
	
	public List<List<String>> groupAnagramsII(String[] words) {
		
		HashMap<String,List<String>> hmap = new HashMap<>();
		
		if(words.length == 0) {
			return new ArrayList();
		}
		
		for(String w : words) {
			
			   char[] ch = w.toCharArray();
			   Arrays.sort(ch);
			   String result = String.valueOf(ch);
			   
			   if(!hmap.containsKey(result)) {
				   hmap.put(result, new ArrayList());
			   }
			   
			   hmap.get(result).add(w);
			
		}
		
		return new ArrayList(hmap.values());
		
	}

}
