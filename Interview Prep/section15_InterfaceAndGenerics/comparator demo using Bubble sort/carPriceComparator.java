package section15_InterfaceAndGenerics;

import java.util.Comparator;

public class carPriceComparator implements Comparator<Car2>{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Car2 thisCar, Car2 otherCar) {
		return otherCar.price - thisCar.price;
	}

}
