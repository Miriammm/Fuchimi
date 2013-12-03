package fuchimi;

public class Scissors extends Hand{

	public Scissors(){
		
	}

	@Override
	public boolean beats(Hand hand) {
		// TODO Auto-generated method stub
		return false;
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
