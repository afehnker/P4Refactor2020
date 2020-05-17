package refactordemo;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();

	public Customer(String name) {
		_name = name;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String getName() {
		return _name;
	}

	public double getOwed() {
		double totalAmount = 0;
		Enumeration<Rental> rentals = _rentals.elements();

		while (rentals.hasMoreElements()) {

			Rental each = (Rental) rentals.nextElement();
			// determine amounts for each line

			// show figures for this rental
			totalAmount += each.getCharge();
			;
		}
		return totalAmount;
	}

	public int getPoints() {
		int frequentRenterPoints = 0;
		Enumeration<Rental> rentals = _rentals.elements();

		while (rentals.hasMoreElements()) {

			Rental each = (Rental) rentals.nextElement();

			frequentRenterPoints += each.getFrequentRenterPoints();
			// show figures for this rental
		}
		return frequentRenterPoints;
	}

}