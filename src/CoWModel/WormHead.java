/**
 * 
 */
package CoWModel;

import Utilities.Utilities.Direction;;

/**
 * The head of the worm.
 *
 * @version 1.00 - 04 June 2011
 * @author Nina Schulte-Hobein
 */
public class WormHead extends Item {

    /** the field holding the steering value */
    private Direction direction;
    
    /**
     * A Setter for the Wormdirection.
     * 
     * @param turnTo the direction of the Wormhead
     */
    public void setDir(Direction dir) {
        try {
            direction = dir;
            //direction = Direction.valueOf(turnTo);
        } catch (IllegalArgumentException e) {
            Utilities.Debug.debug("No correct Itemtype" + e.getMessage());
        } catch (NullPointerException e) {
            Utilities.Debug.debug(e.getMessage());
        }
    }
    
    /**
     * Returns the direction of the Worm.
     * 
     * @return the direction of the wormhead
     */
    public String getDir() {
        return direction.name();
    }

}
