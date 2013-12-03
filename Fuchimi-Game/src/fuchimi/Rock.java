package fuchimi;

public class Rock extends Hand{
	
	public Rock(){
		
	}

	@Override
	public boolean beats(Hand hand) {
		// TODO Auto-generated method stub
		return false;
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
