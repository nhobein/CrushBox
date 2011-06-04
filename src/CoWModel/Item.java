/**
 * 
 */
package CoWModel;

import Utilities.Utilities.ItemType;

/**
 * Superclass for all items in the game.
 *
 * @version 1.00 - 04 June 2011
 * @author Nina Schulte-Hobein
 */
public class Item {

    /** the type of the item */
    private ItemType type;

    /** the position of the item in the playing field */
    private int xPos = -1;
    private int yPos = -1;
    
    public Item(ItemType mytype) {
    	type = mytype;
    }

    /** A Setter for the itemposition.
     *
     * @param x the x-value of the position
     * @param y the y-value of the position
     */
    public void setPos(int x, int y) {
        xPos = x;
        yPos = y;
    }

    /**
     * Returns the position of the item.
     *
     * @return the x- and y-position of the item as an array of Integers
     */
    public int[] getPos() {
        int[] Pos = {xPos, yPos};
        return Pos;
    }
    
    public int getXPos() {
    	return xPos;
    }

    public int getYPos() {
    	return yPos;
    }
    /** 
     * A Setter for the itemtype.
     * 
     * @param name the name of the itemtype
     */
    public void setType(String name) {
        //TODO: Errorhandling
        try {
            type = ItemType.valueOf(name);
        } catch (IllegalArgumentException e) {
            Utilities.Debug.debug("No correct Itemtype" + e.getMessage());
        } catch (NullPointerException e) {
            Utilities.Debug.debug(e.getMessage());
        }
    }
    
    /**
     * Returns the Name of the itemtype.
     * 
     * @return the name of the itemtype
     */
    public String getType() {
        return type.name();
    }

}
