package leetcode;

public class Removespecialcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "/@abc";
		String res ="";
		for (int i=0;i<s.length();i++)  
		{  
		//comparing alphabets with their corresponding ASCII value  
		if (s.charAt(i)>64 && s.charAt(i)<=122) //returns true if both conditions returns true  
		{  
		//adding characters into empty string   
		res=res+s.charAt(i);  
		}  
		}  
		System.out.println(res);
		
	}
}
	



