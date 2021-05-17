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
			Rental each = rentals.nextElement();			
			totalAmount += each.getCharge();
			
		}
		return totalAmount;
	}

	public int getPoints() {
		int frequentRenterPoints = 0;
		Enumeration<Rental> rentals = _rentals.elements();

		while (rentals.hasMoreElements()) {
			Rental each = rentals.nextElement();
			frequentRenterPoints += each.getFrequentPoints();
		}
		return frequentRenterPoints;
	}

}