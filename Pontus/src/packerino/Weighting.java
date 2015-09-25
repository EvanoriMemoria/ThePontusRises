package packerino;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Weighting {

    int value;
    int weighting;

    public Weighting(int v, int w) {
        this.value = v;
        this.weighting = w;
    }

    public static int weightedRandom(List<Weighting> weightingOptions) {

    	//determine sum of all weightings
    	int total = 0;
    	for (Weighting w : weightingOptions) {
    		total += w.weighting;
    	}

    	//select a random value between 0 and our total
    	int random = new Random().nextInt(total);

    	//loop thru our weightings until we arrive at the correct one
    	int current = 0;
    	for (Weighting w : weightingOptions) {
    		current += w.weighting;
    		if (random < current)
    			return w.value;
    	}

    	//shouldn't happen.
    	return -1;
    }

    public static void main(String[] args) {
    	
    	String input = readString("Please enter the severety level of the area or the term you would like defined.");

    	List<Weighting> stableWeightings = new ArrayList<Weighting>();
    	stableWeightings.add(new Weighting(0, 5));
    	stableWeightings.add(new Weighting(1, 11));
    	stableWeightings.add(new Weighting(2, 19));
    	stableWeightings.add(new Weighting(3, 9));
    	stableWeightings.add(new Weighting(4, 9));
    	stableWeightings.add(new Weighting(5, 49));
    	stableWeightings.add(new Weighting(6, 24));
    	
    	int stableWeight = weightedRandom(stableWeightings);
    	
    	/*This if loop triggers when the first pontus event is strange weather, 
    	 * there is a chance for a second pontus event.
    	 */
    	
    	if(stableWeight==5)
    	{
    		List<Weighting> stableTeirTwo = new ArrayList<Weighting>();
    		stableTeirTwo.add(new Weighting(2, 9));
    		stableTeirTwo.add(new Weighting(3, 9));
    		stableTeirTwo.add(new Weighting(4, 9));
    		stableTeirTwo.add(new Weighting(5, 20));
    	}
    	else if(stableWeight==0)
    	{
    		System.out.println("Location is now Compromised! Rolling on the Compromised table.");
    	}
    	else if(stableWeight==1)
    	{
    		System.out.println("Disappearance!");
    	}

    	System.out.println(stableWeight);
    	
    	/*
    	 * Print out the definitions of all the pontus events if they are typed into the prompt.
    	 */
    	
    	if(input.equals("Disappearance"))
        {
    		System.out.println("Sometimes the Pontus devours parts of the Clockwork. The\n"
    				+ "Narrator deals a number of cards to each PC and NC equal\n"
    				+ "to their Corruption rank, and a single card to any other people,\n"
    				+ "animals, or significant objects in the scene. A number of people\n"
    				+ "or objects equal to the Corruption rank of the triggering character\n"
    				+ "simply disappear. Those with the lowest card numbers on the\n"
    				+ "cards dealt to them are those who vanish. The only evidence of\n"
    				+ "their existence is perhaps a scorch mark on the ground or a lingering\n"
    				+ "acrid smell.\n"
    				+ "Player characters and important NCs who disappear are\n"
    				+ "assumed to emerge at some random location on the Earth or in\n"
    				+ "the Borderlands. Other characters and objects are swallowed by\n"
    				+ "the Pontus and may eventually emerge as part of a chimera.");
        }
    }
}

/*public class TheMain{
	public static void main(String[] args) {
		Weighting oranges = new Weighting(5,10);
		System.out.println(oranges);
		

	    List<Weighting> weightings = new ArrayList<Weighting>();
	    weightings.add(new Weighting(5, 8));
	    weightings.add(new Weighting(10, 1));
	    weightings.add(new Weighting(20, 10));
 	
	}
}*/
