package Day8.interfaces.instanceofinterface;

public class PhoneFactory {

	public static void main(String[] args) {
		if (company.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else if (company.equalsIgnoreCase("Jio"))
			return new Jio();
		return null;

	}

}
