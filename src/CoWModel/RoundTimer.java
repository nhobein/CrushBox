/**
 * 
 */
package CoWModel;

import java.util.*;

/*
 * RoundTimer.java
 *
 * @author Nina Schulte-Hobein
 * @version 1.00        02 June 2011    initial version
 */
public class RoundTimer extends TimerTask {
    
    Observable o = new Observable() {
        public void notifyObservers() {
            setChanged(); //this method is protected
            super.notifyObservers();
        }
    };

    public void run() {
        o.notifyObservers();
    }
    
}
