package three.stringRotation;

public class RoationWithoutLambda {

	public static boolean isRotation(String s1, String s2) {

		if ((s1.length() == s2.length()) && (s1 + s1).contains(s2)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String a = "abcde";
		String b = "deabc"; 

		if (isRotation(a, b)) {
			System.out.println("Given Strings are rotations of each other.");
		} else {
			System.out.println("Given Strings are not rotations of each other.");
		}

	}

}
