package refactordemo;
class Rental {
    private Movie _movie;
    int _daysRented;

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

	double getCharge() {		
		return _movie.getPrice(_daysRented);
	}

	int getFrequentPoints() {
		// add frequent renter points
		
		return _movie.getPoints(_daysRented);
	}
}