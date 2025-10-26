package Day19.v1;

public class LambdaWithoutParameter {

	public static void main(String[] args) {
		IStatement s = () -> {return "Hello World!!";};
		System.out.println(s.show());


	}

}
