package DSA_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class AnagramInString {

	
	@Test
	public void example1() {
		String s = "cbaebabacd", p = "abc";
           List<Integer> findAnagrams = findAnagrams(s,p);
           System.out.println(findAnagrams);
		
	}
	
	
	 public List<Integer> findAnagrams(String s, String p){
		 
		 int n = s.length();
		 
		 int m = p.length();
		 
		 int[] sfreq = new int[26];
		 
		 int[] pfreq = new int[26];
		 
		 
		 for(int i=0;i<m;i++) {
			 sfreq[p.charAt(i) - 'a']++;
		 }
		 
		 for(int i=0;i<m;i++) {
			 pfreq[s.charAt(i) - 'a']++;
		 }
		 
		 
		 List<Integer> lst = new ArrayList<>();
		 
		 for(int i=m;i<n;i++) {
			 if(Arrays.equals(sfreq, pfreq)) {
				 lst.add(i-m);
			 }
			 sfreq[s.charAt(i) - 'a']++;
	         sfreq[s.charAt(i-m) - 'a']--;
		 }
		 
       if(Arrays.equals(sfreq,pfreq)){
           lst.add(n-m);
       }
		 
		 return lst;
		 
	 }
	 
	 
}
