package day15.generics;

public class LowerBounddedWildCard {

	public LowerBounddedWildCard() {
		// TODO Auto-generated constructor stub
		public static void displayNumbers(List<? super Integer> list) // any super class of Integer class
		{
			for (Object n : list) {
				System.out.println(n);
			}
		}
	}

}
