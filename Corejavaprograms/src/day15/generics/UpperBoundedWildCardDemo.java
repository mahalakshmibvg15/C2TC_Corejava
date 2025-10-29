package day15.generics;

public class UpperBoundedWildCardDemo {

	public UpperBoundedWildCardDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		//passing Integer List 
		System.out.println("sum = " + UpperBoundedWildCard.sumOfList(intList));

		ArrayList<Double> doubleList = new ArrayList<Double>();
		doubleList.add(10.0);
		doubleList.add(20.0);
		doubleList.add(30.0);
		//passing Double List
		System.out.println("sum = " + UpperBoundedWildCard.sumOfList(doubleList));
		
		/*
		 * ArrayList<String> strList=new ArrayList<String>(); strList.add("Arun");
		 * strList.add("Ajay"); strList.add("Ragul"); //passing String List
		 * System.out.println("sum = " + UpperBoundedWildCard.sumOfList(strList));
		 */
	}

}
