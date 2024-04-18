package leetcode;

public class FinalValueOperation {
	
	 public static int finalValueAfterOperations(String[] operations) {
	        
	        int x = 0;
	        for(int i=0;i<operations.length;i++){
	        if(operations[i].equals("++X") || operations[i].equals("X++")){
	            
	           x++;
	            
	        }else {
	            x--;
	        }    
	    }
	         return x;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String[] s = {"--X","X++","X++"};
         int finalValueAfterOperations = finalValueAfterOperations(s);
         System.out.println(finalValueAfterOperations);
	}

}
