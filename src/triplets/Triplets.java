/*
    Matthew Ludwig
    27 February 2019
    This program is a modified version of the giggiy program, which radomly generates 3 line rhyming poems
 */

package triplets;

/**
 *
 * @author malud0519
 */
import java.util.ArrayList;
public class Triplets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nouns = new ArrayList<String>();
        nouns.add("cat");
        nouns.add("dog");
        nouns.add("horse");
        nouns.add("goat");
        nouns.add("eagle");
        nouns.add("lion");
        nouns.add("giraffe");

        ArrayList<String> verbs = new ArrayList<String>();
        verbs.add("ate");
        verbs.add("slept");
        verbs.add("jumped");
        verbs.add("raced");
        verbs.add("ran");
        verbs.add("tripped");
        verbs.add("guessed");
        verbs.add("tapped");

        ArrayList<String> rhymingNouns = new ArrayList<String>();
        rhymingNouns.add("mouse");
        rhymingNouns.add("blouse");
        rhymingNouns.add("grouse");
        rhymingNouns.add("house");
        rhymingNouns.add("spouse");
        rhymingNouns.add("doghouse");
        rhymingNouns.add("beachhouse");
        rhymingNouns.add("treehouse");
        rhymingNouns.add("full house");
        rhymingNouns.add("jailhouse");
        
       
        
        String noun, verb1, verb2, rhymingNoun1, rhymingNoun2;
        int randomNum;

        //get a random noun from the nouns ArrayList
        //use .size() method to get the # of elements in the ArrayList
        randomNum = (int)(Math.random() * nouns.size());
        noun = nouns.get(randomNum);

        //get the first verb & remove it from the array
        randomNum = (int)(Math.random() * verbs.size());
        verb1 = verbs.get(randomNum);
        verbs.remove(randomNum);

        //get the second verb
        randomNum = (int)(Math.random() * verbs.size());
        verb2 = verbs.get(randomNum);

        //get the two rhyming nouns
        randomNum = (int)(Math.random() * rhymingNouns.size());
        rhymingNoun1 = rhymingNouns.get(randomNum);
        rhymingNouns.remove(randomNum);

        randomNum = (int)(Math.random() * rhymingNouns.size());
        rhymingNoun2 = rhymingNouns.get(randomNum);

        //Display the poem
        System.out.println("The " + noun + " " + verb1 + " to the " + rhymingNoun1 + "\n" +
                "So it could " + verb2 + " the " + rhymingNoun2 + " \n" + "But it was a " + rhymingNoun2);
    }
    
}
