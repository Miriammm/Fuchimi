import fuchimi.Hand;
import fuchimi.Paper;
import fuchimi.Rock;
import fuchimi.Scissors;

public class FuchimiGame {

	/**
	 * @author Miriam Hosak
	 * @since 26.11.2013
	 * @version 1.0
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Fuchimi");
	}
	public static Hand select(int chose){
		Hand hand;
		int variant = 3;
		switch (variant){
				case 1: hand= new Rock();
				case 2: hand = new Paper();
				case 3: hand = new Scissors();
				default : hand = null;
		}
		return hand;
	}

}
