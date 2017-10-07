package Chain;

public class IsNegative implements Chain {
	private Chain chain;

	public IsNegative(Chain chain) {
		super();
		this.chain = chain;
	}

	@Override
	public void setNext(Chain chain) {
		this.chain = chain;
	}

	@Override
	public void hendle(int num) {
		if (num < 0) {
			System.out.println("Num is negative");
		} else {
			chain.hendle(num);
		}
	}

}
