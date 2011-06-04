package CoWModel;

import Utilities.Debug;
import Utilities.Utilities.Direction;

public class TestBed {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Debug.debug("Los");
        Worm peter = new Worm(42);
        peter.init("babyblau", 3, 6);
        
        peter.grow(Direction.RIGHT);
        peter.move(Direction.UP);
        peter.move(Direction.NONE);
        peter.move(Direction.NONE);
    }

}
