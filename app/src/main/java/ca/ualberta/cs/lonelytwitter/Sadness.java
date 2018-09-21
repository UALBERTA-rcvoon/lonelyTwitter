package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by rcvoon on 9/18/18.
 */

public class Sadness extends CurrentMood {

    Sadness() {
        super();
    }

    Sadness(String mood, Date date) {
        super(mood, date);
    }

    public String format() {

        return "Feeling sad :(";

    }
}
