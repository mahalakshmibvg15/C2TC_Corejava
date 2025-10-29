package day15.generics;

public class MinMax {

	public MinMax() {
		// TODO Auto-generated constructor stub
		public interface MinMax<T extends Comparable<T>> {

			T min();

			T max();
	}

}
