package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * <h1>Happiness</h1>
 * Happiness extends the abstract class CurrentMood and overrides the format method
 * to return a string representing happiness.
 *
 * @author  Riley Voon
 * @version 1.0
 * @since   2018-09-18
 *
 * © 2018 Riley Voon.  All rights reserved.
 *
 */

public class Happiness extends CurrentMood {
    /**
     * Constructor with no arguments
     */
    Happiness() {
        super();
    }

    /**
     * Constructor with two arguments.
     * @param date to set CurrentMood date to
     * @param mood to set CurrentMood mood to.
     */
    Happiness(String mood, Date date) {
        super(mood, date);
    }

    /**
     * Overrides the format method in CurrentMood
     * @return a string representing happiness.
     */
    public String format() {

        return "Feeling happy :)";

    }
}
