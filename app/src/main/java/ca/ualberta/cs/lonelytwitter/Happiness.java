package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**

 * Created by rcvoon on 9/18/18.
 */

public class Happiness extends CurrentMood {

    Happiness() {
        super();
    }

    Happiness(String mood, Date date) {
        super(mood, date);
    }

    public String format() {

        return "Feeling happy :)";

    }
}
