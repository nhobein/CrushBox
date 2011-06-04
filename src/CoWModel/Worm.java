/**
 * 
 */
package CoWModel;

import java.util.ArrayList;
import java.util.Random;

import CoWModel.WormHead.Direction;

/**
 * The worm is a composition of one WormHead and a variable number of WormItems.
 *
 * @version 1.00 - 04 June 2011
 * @author Nina Schulte-Hobein
 */
public class Worm {
    /** the ID of the worm */
    //could also be replaced by the username
    private int wormID;
    /** the color of the worm */
    private String color;
    /** list of all wormparts and the wormhead */
    private ArrayList<Item> wormparts = new ArrayList<Item>();
    
    public Worm(int id) {
        wormID = id;
    }
    
    public void init(String color, int xPos, int yPos) {
        this.color = color;
        WormHead head = new WormHead();
        head.setDir();
        wormparts.add(head);
    }
    
    /** Returns a random direction.
     *  @return a direction
     **/
    public static Direction randomDirection()
    {
        Random randNumGen = RandNumGenerator.getInstance();
        return new Direction(randNumGen.nextInt(FULL_CIRCLE));
    }
}
