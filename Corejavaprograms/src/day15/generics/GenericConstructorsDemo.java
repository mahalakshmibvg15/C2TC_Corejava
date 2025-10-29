package day15.generics;

public class GenericConstructorsDemo {

	public GenericConstructorsDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Number to Double Conversion:");
		  
		  GenericConstructors obj=new GenericConstructors(10);
		  obj.show();
		  
		  GenericConstructors objOne=new GenericConstructors(136.8F);
		  objOne.show();

	}

}
