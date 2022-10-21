package dateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DateAndTimeAPI {

	public static void main(String[] args) {

		/**
		 * Task-1: Write a predicate to check if the given date is yesterday date.
		 * 
		 * @author Vishvendra
		 */
		Predicate<String> datePredicate = p -> LocalDate.parse(p).equals(LocalDate.now().minusDays(1));
		System.out.println("Check for given date is Yesterday is: " + datePredicate.test("2022-05-11"));

		/**
		 * Task-2 Write a Supplier to get Date for next Thursday.
		 * 
		 * @author Vishvendra
		 */
		Supplier<LocalDate> dateSupplier = () -> LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println(dateSupplier.get());

		/**
		 * Task-3 Write a Supplier to get CurrentTime in EST timezone
		 * 
		 * @author Vishvendra
		 */
		Supplier<LocalDateTime> estTime = () -> LocalDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(estTime.get());

		/**
		 * Task-4 Write a Function to calculate the age of a person given date of birth.
		 * 
		 * @author Vishvendra
		 */
		Function<String, String> getAge = (dob) -> {
			Period age = Period.between(LocalDate.parse(dob), LocalDate.now());
			return age.getYears() + "years " + age.getMonths() + "Months " + age.getDays()+"Days ";
		};

		System.out.println(getAge.apply("1991-12-21"));
	}

}
