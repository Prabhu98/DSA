package leetcode;

import java.util.ArrayList;

public class JewelsAndStones {
	public static int numJewelsInStones(String jewels, String stones) {
        ArrayList<Character> arr = new ArrayList<>();
        for(int i=0;i<jewels.length();i++)
            arr.add(jewels.charAt(i));
        int count=0;
        for(int j=0;j<stones.length();j++){
            if(arr.contains(stones.charAt(j)))
                count++;
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String jewels ="aA";
       String stones ="aAAbbbb";
       int numJewelsInStones = numJewelsInStones(jewels,stones);
       System.out.println(numJewelsInStones);
	}

}
