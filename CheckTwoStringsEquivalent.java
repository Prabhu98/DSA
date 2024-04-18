package leetcode;

public class CheckTwoStringsEquivalent {
	
public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        
        String res1 ="";
        String res2 ="";
        
        for(int i =0 ; i<word1.length;i++){
            res1 = res1 + word1[i];
        }
        for (int j=0 ; j<word2.length;j++){
            res2 = res2 + word2[j];
        }
        
        if(res1.equals(res2)){
            return true;
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word1= {"ab","c"};
				
		String[] word2= {"a" , "bc"};
		
		boolean arrayStringsAreEqual = arrayStringsAreEqual(word1,word2);
		System.out.println(arrayStringsAreEqual);
	}

}
