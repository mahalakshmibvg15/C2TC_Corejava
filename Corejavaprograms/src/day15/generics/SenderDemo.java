package day15.generics;

public class SenderDemo {

	public SenderDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sender<String> stringSender =new Sender<String>("Hello! How are you?");//Message as String 
		
		Sender<Person> personSender =new Sender<Person>();
		personSender.setMessage(new Person("Amit","Pune")); //Message as Person Object

		stringSender.sendMessage();
		personSender.sendMessage();

	}

}
