package DSA_Practice;

import java.util.HashMap;

public class frequencyWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String st = "My name is abc my father name is def my mother name is xyz";
		
		
		HashMap<String,Integer> hmap = new HashMap<>();
		
		
		String[] val = st.split(" ");
		
		for(String word : val) {
			
			hmap.put(word, hmap.getOrDefault(word, 0)+ 1);
		}

		System.out.println(hmap);
	}

}
