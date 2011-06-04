package CoWModel;

import Utilities.Debug;

public class TestBed {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Debug.debug("Los");
        Worm peter = new Worm(42);
        peter.init("babyblau", 8, 15);
    }

}
