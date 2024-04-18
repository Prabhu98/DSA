package DSA_Practice;

import org.junit.Test;

public class SubStringOfSizeThreeDistinctChar {
	
	
	@Test
	public void td1(){
		String s = "aababcabc";
		int countGoodSubstrings = countGoodSubstrings(s);
		System.out.println(countGoodSubstrings);
	}
	
	/* a) length is less than 3 should be return 0;
	 * b) intially assign first 3 char into a variable a,b,c
	 * c) then i start with 3 till len
	 * d) check condition a!b && b!=c && c!=a and count increment by 1
	 * e) swap a=b, b=c, c= s.charAt(i) for next index
	 * f) return count
	 * 
	 * 
	 * 
	 */

	private int countGoodSubstrings(String s) {
		// TODO Auto-generated method stub
		int n = s.length();
		
		if(n < 3) {
			return 0;
		}
		
		char a = s.charAt(0),b=s.charAt(1),c=s.charAt(2);
		
		int count =0;
		
		for(int i=3;i<n;i++) {
			
		    if(a!=b && b!=c && c!=a) 
		    	count++;
		    
		    a = b;
		    b = c;
		    c = s.charAt(i);
		    
		}
		 if(a!=b && b!=c && c!=a) count++;
		 return count;	
		
	}
	

}
