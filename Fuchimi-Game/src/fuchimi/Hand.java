package fuchimi;

public abstract class Hand {

	public abstract boolean beats(Hand hand);
	protected abstract boolean looseAgainst(Rock rock);
	protected abstract boolean looseAgainst(Paper paper);
	protected abstract boolean looseAgainst(Scissors scissors);
}
