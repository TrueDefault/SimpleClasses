package echau.programming.simpleclasses;

/**
 * Represents an Automobile.
 *
 * @author Eugene Chau
 * @version June 15, 2017
 */
public class Automobile {
	private double mpg;
	private double gallons;
	private double mileage;

	/**
	 * Creates a new Automobile with the set miles per gallon. The gallons of
	 * fuel and the mileage are both set to 0.
	 */
	public Automobile(final double mpg) {
		this.mpg = mpg;
		gallons = 0;
	}

	/**
	 * Fills up this Automobile's gas tank with the specified number of gallons.
	 * 
	 * @param gallons
	 *            The number of gallons to fill up.
	 */
	public void fillUp(final double gallons) {
		this.gallons += gallons;
	}

	/**
	 * Removes the correct amount of gas in the tank after this Automobile
	 * travels the specified number of miles. Increments the mileage by the
	 * number of miles travelled. If the Automobile runs out of gas midway, the
	 * amount of gallons of fuel in the tank is set to 0. The new mileage is
	 * still calculated according to how many miles were travelled.
	 * 
	 * @param miles
	 *            The number of miles to travel.
	 */
	public void takeTrip(final double miles) {
		if (this.gallons * this.mpg < miles) {
			this.mileage += this.gallons * this.mpg;
			this.gallons = 0;
		} else {
			this.mileage += miles;
			this.gallons -= (miles / this.mpg);
		}
	}

	/**
	 * Returns the amount of fuel in gallons left in the tank.
	 * 
	 * @return How much fuel in gallons there is remaining in this Automobile's
	 *         tank.
	 */
	public double reportFuel() {
		return this.gallons;
	}

	/**
	 * Gets the amount of miles this Automobile has travelled, and returns it.
	 * 
	 * @return The mileage of this Automobile.
	 */
	public double getMileage() {
		return this.mileage;
	}
}
