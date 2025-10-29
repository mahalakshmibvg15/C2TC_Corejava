package day15.generics;

public class GenericClassTest {

	public GenericClassTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<String> stringObj=new GenericClass<String>();
		stringObj.set("Hello");
		System.out.println(stringObj.get());

		//GenericClass with Integer type of data member
		GenericClass<Integer> integerObj=new GenericClass<Integer>();
		integerObj.set(10);
		System.out.println(integerObj.get());
		
		//GenericClass with Person object of data member
		GenericClass<Person> personObj=new GenericClass<Person>();
		personObj.set(new Person("Ajay","Chennai"));
		System.out.println(personObj.get());
	}

}
