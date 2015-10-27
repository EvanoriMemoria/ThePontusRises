package packerino;

import java.util.ArrayList;
import java.util.List;

public class stablerino {

	public static void teired(String inpu) {
 	   
		if(inpu.equals("Stable")) {
			List<Weighting> stableWeightings = new ArrayList<Weighting>();
			stableWeightings.add(new Weighting(0, 5));
			stableWeightings.add(new Weighting(1, 11));
			stableWeightings.add(new Weighting(2, 19));
			stableWeightings.add(new Weighting(3, 9));
			stableWeightings.add(new Weighting(4, 9));
			stableWeightings.add(new Weighting(5, 49));
			stableWeightings.add(new Weighting(6, 24));
			    	
			int stableWeight = Weighting.weightedRandom(stableWeightings);
			       
			System.out.println("Stable Original: " + stableWeight);    	
			       
			if(stableWeight==0) {
				System.out.println("Location is now Compromised! Rolling on the Compromised table.");
			}
			else if(stableWeight==1) {
				System.out.println("Disappearance!");
			}
			else if(stableWeight==2) {
				System.out.println("Spawn Chimera");
			}
			else if(stableWeight==3) {
				System.out.println("Spawn Aberation");
			}
			else if(stableWeight==4) {
		   	   System.out.println("Impossible Event: Major");
		    }
			/*This if loop triggers when the first pontus event is strange weather, 
			* there is a chance for a second pontus event.
			*/
			else if(stableWeight==5) {
		 	   System.out.println("Impossible Weather: Major");
		   	   List<Weighting> stableTeirTwo = new ArrayList<Weighting>();
		   	   stableTeirTwo.add(new Weighting(2, 9));
		   	   stableTeirTwo.add(new Weighting(3, 9));
			   stableTeirTwo.add(new Weighting(4, 9));
			   stableTeirTwo.add(new Weighting(6, 20));
			   System.out.println(Weighting.weightedRandom(stableTeirTwo));
			}
			else if(stableWeight==6) {
				System.out.println("Nothing happens!");
			}
			else{
				System.out.println("Something is very very wrong here...");
			}
			
			/*
		 	* Print out the definitions of all the pontus events if they are typed into the prompt.
		  	*/
		
		}
		else if(inpu.equals("Disappearance")) {
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
		    		   + "the Pontus and may eventually emerge as part of a chimera.\n");
		}	
	}

}
