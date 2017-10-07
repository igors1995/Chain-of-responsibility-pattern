package Chain;

public class IsNul implements Chain {
	private Chain chain;

	public IsNul(Chain chain) {
		super();
		this.chain = chain;
	}

	@Override
	public void setNext(Chain chain) {
		this.chain = chain;
	}

	@Override
	public void hendle(int num) {
		if (num == 0) {
			System.out.println("Num is 0");
		} else {
			chain.hendle(num);
		}
	}

}
