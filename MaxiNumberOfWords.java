package leetcode;

public class MaxiNumberOfWords {
public static int mostWordsFound(String[] sentences) {
        
        int res = 0;
        
        for(String i : sentences){
            String[] str = i.split(" ");
            res = Math.max(res,str.length);
        }
        return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] sentences = {"alice and bob love leetcode","i think so too","this is great thanks very much"};
		int mostWordsFound = mostWordsFound(sentences);
		System.out.println(mostWordsFound);

	}

}
