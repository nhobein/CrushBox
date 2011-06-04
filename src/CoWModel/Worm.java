/**
 * 
 */
package CoWModel;

import java.util.ArrayList;
import java.util.Random;

import Utilities.Debug;
import Utilities.Utilities;
import Utilities.Utilities.Direction;

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
    
    /**
     * initalizes the worm with only a head.
     * @param color the color of the worm
     * @param xPos the x-position of the wormhead
     * @param yPos the y-position of the wormhead
     */
    public void init(String color, int xPos, int yPos) {
        this.color = color;
        WormHead head = new WormHead();
        head.setDir(randomDirection());
        head.setPos(xPos, yPos);
        wormparts.add(head);
    }
    
    /**
     *  Returns a random direction.
     *  @return a direction
     **/
    public static Direction randomDirection() {
        int pick = new Random().nextInt(Direction.values().length);
        Debug.debug(pick);
        return Direction.values()[pick];
        //String[] directions = {"UP", "DOWN", "LEFT", "RIGHT"};//problem if the enum in WormHead is changed!
        //float n = (float)Math.random();
        //n = Math.round(n*4);
        //return directions[(int)n];
    }
    
    /**
     * 
     */
    public ArrayList grow() {
        return null;
    }
    
}
