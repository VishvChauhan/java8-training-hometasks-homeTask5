package one.palindrome;

public class PalindromeWithLambda {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Ahan");
		
		CheckPalindrome pal = (s)->{
			if(s.toString().equalsIgnoreCase(s.reverse().toString())) {
				return true;
			}else {
				return false;
			}
		};
		
		System.out.println("Verying the String as palindrome: "+pal.isPalindrome(str));

	}

}