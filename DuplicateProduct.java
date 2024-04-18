package DSA_Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class DuplicateProduct {
	
	
	@Test
	public void example1() {
		String[] name = {"ball", "bat", "glove", "glove", "glove"};
		Integer[] price = {2, 3, 1, 2, 1};
		Integer[] weight= {2,5,1,1,1};

		System.out.println(findDuplicate(name, price, weight));
	}

	public int findDuplicate(String[] name, Integer[] price, Integer[] weight) {
		
		List<String> name1 = Arrays.asList(name);

		List<Integer> price1 = Arrays.asList(price);

		List<Integer> weight1 = Arrays.asList(weight);
		// TODO Auto-generated method stub
		Set<String> uniqueProducts = new HashSet<String>();
		int size = name1.size();

		
		for (int i = 0; i < name.length; i++)
        {
            uniqueProducts.add(name[i] + " " + price[i] + " " + weight[i]);
        }
         return name.length - uniqueProducts.size();  // Editor JT added this hint, to detect numDuplicates it should be - uniqueProducts.Distinct();
    }
		/*
		 * if(price1.size()!=size || weight1.size()!=size) return -1;
		 * 
		 * int count=0;
		 * 
		 * for(int i=0; i<size; i++) {
		 * if(!unique.add(name1.get(i)+"-"+price1.get(i)+"-"+weight1.get(i))) { count++;
		 * } } return count;
		 */
	}


