package fuchimi;

public class Rock extends Hand{
	

	@Override
	public String toString() {
		return "Rock";
	}

	@Override
	public boolean beats(Hand hand) {
		return hand.looseAgainst(this);
	}

	@Override
	protected boolean looseAgainst(Rock rock) {
			return false;
	}

	@Override
	protected boolean looseAgainst(Paper paper) {
		return true;
	}

	@Override
	protected boolean looseAgainst(Scissors scissors) {
		return false;
	}
	

}
