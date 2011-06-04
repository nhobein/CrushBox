/**
 * 
 */
package CoWModel;

import java.util.ArrayList;
import java.util.Random;

import Utilities.Debug;
import Utilities.Utilities;
import Utilities.Utilities.Direction;
import Utilities.Utilities.ItemType;

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
        WormHead head = new WormHead(ItemType.WORM);
        head.setDir(randomDirection());
        head.setPos(xPos, yPos);
        wormparts.add(head);
    }
    
    /**
     * 
     * @return
     */
    public int getLength() {
    	return wormparts.size();
    }
    
    /**
     *  Returns a random direction.
     *  @return a direction
     **/
    private static Direction randomDirection() {
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
    public ArrayList grow(Direction keyboard_direction) {
    	moveHead(keyboard_direction);
        return wormparts;
    }
    
    /**
     * 
     */
    public ArrayList shrink() {
    	if (wormparts.size() > 0) {
    		deleteTail();
    	} else {
    		Debug.debug("trying to delete empty worm");
    	}
    	return wormparts;
    }
    
    /**
     * 
     */
    public ArrayList move(Direction keyboard_direction) {
    	moveHead(keyboard_direction);
    	deleteTail();
        return null;
    }
    
    /**
     * 
     */
    private void deleteTail() {
    	try {
			wormparts.remove(wormparts.size() - 1 );
		} catch (Exception e) {
			Debug.debug(e.getMessage());
		}
    }
    
    /**
     * 
     */
    private void moveHead(Direction keyboard_direction) {
        WormHead head = (WormHead)wormparts.get(0); //get first item (aka head)
        Direction dir;
        if (keyboard_direction == Direction.NONE) {
        	dir = head.getDir(); //set new direction to old direction of head (no keyboard input)
        } else {
        	dir = keyboard_direction; //set new direction to keyboard input
        	head.setDir(dir); //and update head direction
        }
        int[] oldPos = head.getPos(); //get current (old) head position
        int x = oldPos[0];
        int y = oldPos[1];
        
        switch (dir) {  //modify position based on direction
        case UP: y--; break;
        case DOWN: y++; break;
        case RIGHT: x++; break;
        case LEFT: x--; break;
        }
        head.setPos(x, y);
        
        Item newWormPart = new Item(ItemType.WORM); //add new worm part at old head position
        newWormPart.setPos(oldPos[0], oldPos[1]);
        wormparts.add(1, newWormPart);
    }
    
}
