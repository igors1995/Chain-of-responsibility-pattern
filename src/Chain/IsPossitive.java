package Chain;

public class IsPossitive implements Chain {
	private Chain chain;

	public IsPossitive(Chain chain) {
		super();
		this.chain = chain;
	}

	@Override
	public void setNext(Chain chain) {
		this.chain = chain;
	}


	@Override
	public void hendle(int num) {
		if (num > 0) {
			System.out.println("Num is possitive");
		} else {
			chain.hendle(num);
		}
	}

}
