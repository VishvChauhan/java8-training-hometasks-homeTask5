package three.stringRotation;

public class RotationWithLambda {

	public static void main(String[] args) {
		String a = "abcde";
		String b = "deabc";

		Rotation rot = (i, j) -> {
			if ((i.length() == j.length()) && (i + i).contains(j)) {
				return true;
			} else {
				return false;
			}
		};
		
		if(rot.isRoation(a, b)) {
			System.out.println("The given Strings "+a+" and "+b+" are rotations of each other!");
		}else {
			System.out.println("The given Strings "+a+" and "+b+" are NOT rotations of each other!");
		}

	}

}
