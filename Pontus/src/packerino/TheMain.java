package packerino;

import java.util.ArrayList;
import java.util.List;

public class TheMain{
	public static void main(String[] args) {
		Weighting oranges = new Weighting(5,10);
		System.out.println(oranges);
		

	    List<Weighting> weightings = new ArrayList<Weighting>();
	    weightings.add(new Weighting(5, 8));
	    weightings.add(new Weighting(10, 1));
	    weightings.add(new Weighting(20, 10));
 	
	}
}
