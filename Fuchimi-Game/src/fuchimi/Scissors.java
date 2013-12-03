package fuchimi;

public class Scissors extends Hand{

	

	@Override
	public String toString() {
		return "Scissors";
	}

	@Override
	public boolean beats(Hand hand) {
		
		return hand.looseAgainst(this);
	}

	@Override
	protected boolean looseAgainst(Rock rock) {
		return true;
	}

	@Override
	protected boolean looseAgainst(Paper paper) {
		return false;
	}

	@Override
	protected boolean looseAgainst(Scissors scissors) {
		return false;
	}
}
