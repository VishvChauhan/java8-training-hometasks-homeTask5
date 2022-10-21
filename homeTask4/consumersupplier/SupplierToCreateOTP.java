package consumersupplier;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.function.IntSupplier;

public class SupplierToCreateOTP {

	public static void main(String[] args) {

		// Write a supplier to produce a random OTP.

		IntSupplier sp = () -> Integer.valueOf(new DecimalFormat("0000000").format(new Random().nextInt(9999999)));

		System.out.println(sp.getAsInt());
	}

}
