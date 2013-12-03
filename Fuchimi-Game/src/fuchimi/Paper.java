package fuchimi;

public class Paper extends Hand{

	public Paper() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean beats(Hand hand) {
		
			return false;

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
