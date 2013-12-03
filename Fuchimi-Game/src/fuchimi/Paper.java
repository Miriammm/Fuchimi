package fuchimi;

public class Paper extends Hand{


	@Override
	public String toString() {
		return "Paper";
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
			return false;
		
	}

	@Override
	protected boolean looseAgainst(Scissors scissors) {
			return true;
		
	}

}
