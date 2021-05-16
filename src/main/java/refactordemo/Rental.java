package refactordemo;
class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

	public double getCharge() {
		
		return _movie.getPrice(_daysRented);
	}

	public int getFrequentPoints() {
		// add frequent renter points
		
		return _movie.getPoints(_daysRented);
	}
}