package section15_InterfaceAndGenerics;

import java.util.Comparator;

public class carColorComparator implements Comparator<Car2> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Car2 thisCar, Car2 otherCar) {
		return thisCar.color.compareTo(otherCar.color);
	}

}
