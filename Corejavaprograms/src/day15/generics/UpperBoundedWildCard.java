package day15.generics;

public class UpperBoundedWildCard {

	public UpperBoundedWildCard() {
		// TODO Auto-generated constructor stub
		public static Double sumOfList(ArrayList<? extends Number> al) // any subclass of Number class
		{
			double sum = 0.0;
			for (Number n : al) {
				sum = sum + n.doubleValue();
			}
			return sum;
		}

	}

}
