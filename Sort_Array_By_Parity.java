package DSA_Practice;

import java.util.Arrays;

import org.junit.Test;

public class Sort_Array_By_Parity {

	
	@Test
    public void example3(){
        int[] arr = {4,2,5,7};
       System.out.println(Arrays.toString(addTwo(arr)));
    }

	public int[] addTwo(int[] arr) {
		// TODO Auto-generated method stub
		
		 if(arr.length==0) return new int[]{};
		 
		 int[] a = new int[arr.length];

	       for(int i=0,j=1,k=0;i<arr.length;i++) {
	    	   if(arr[i] % 2 == 0) {
	    		   a[k] = arr[i];
	    		   k =k+2;
	    	   }
	    	   else {
	    		   a[j] = arr[i];
	    		   j =j+2;
	    		   
	    	   }
	       }
	       return a;
	   
	    }
	}


