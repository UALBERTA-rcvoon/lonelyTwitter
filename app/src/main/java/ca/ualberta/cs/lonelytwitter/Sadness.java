package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * <h1>Sadness</h1>
 * Sadness extends the abstract class CurrentMood and overrides the format method
 * to return a string representing sadness.
 *
 * @author  Riley Voon
 * @version 1.0
 * @since   2018-09-18
 *
 * © 2018 Riley Voon.  All rights reserved.
 *
 */

public class Sadness extends CurrentMood {
    /**
     * Constructor with no arguments
     */
    Sadness() {
        super();
    }
    /**
     * Constructor with two arguments.
     * @param date to set CurrentMood date to
     * @param mood to set CurrentMood mood to.
     */
    Sadness(String mood, Date date) {
        super(mood, date);
    }

    /**
     * Overrides the format method in CurrentMood
     * @return a string representing sadness.
     */
    public String format() {

        return "Feeling sad :(";

    }
}
