package refactordemo;

import org.junit.Test;

import refactordemo.Customer;
import refactordemo.Movie;
import refactordemo.Rental;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

	@Test
	public void testOwed() {
		Customer Pete = new Customer("Peter");
		Movie Shouf = new Movie("Shouf Shouf Habibi", 1);
		Movie Black = new Movie("Black Book", 2);

		Pete.addRental(new Rental(Shouf, 2));
		Pete.addRental(new Rental(Black, 1));

		assertEquals(7.5, Pete.getOwed());

	}

	@Test
	public void testPoints() {
		Customer Pete = new Customer("Peter");
		Movie Shouf = new Movie("Shouf Shouf Habibi", 1);
		Movie Black = new Movie("Black Book", 2);

		Pete.addRental(new Rental(Shouf, 2));
		Pete.addRental(new Rental(Black, 1));

		assertEquals(3, Pete.getPoints());
	}
}
