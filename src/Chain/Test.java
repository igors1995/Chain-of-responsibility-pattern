package Chain;

public class Test {
	public static void main(String[] args) {
		Chain possitive = new IsPossitive(new IsNegative(new IsNul(null)));
		possitive.hendle(-5);

	}
}
