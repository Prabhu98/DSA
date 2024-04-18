package leetcode;

public class Stringconce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "A man, a plan, a canal: Panama";
		
		boolean letterOrDigit = !Character.isLetterOrDigit(s.charAt(5));
		System.out.println(letterOrDigit);
		
	}

}
