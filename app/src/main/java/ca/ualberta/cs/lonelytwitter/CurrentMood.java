package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * <h1>CurrentMood</h1>
 * CurrentMood is an abstract class that specifies that CurrentMood
 * objects must have a mood, date, and accessors and mutator methods for that mood and date.
 *
 *
 * @author  Riley Voon
 * @version 1.0
 * @since   2018-09-18
 *
 * © 2018 Riley Voon.  All rights reserved.
 *
 */

public abstract class CurrentMood {
    private String mood;
    private Date date;

    /**
     * Constructor with no arguments.
     * Sets date to current date and mood to a default message.
     */

    public CurrentMood() {
        this.mood = "I don't know what my current mood is.";
        this.date = new Date();
    }

    /**
     * Constructor with two arguments.
     * @param date to set CurrentMood date to
     * @param mood to set CurrentMood mood to.
     */
    public CurrentMood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    /**
     * Accessor method for mood.
     * @return the mood of the CurrentMood object as a String.
     */
    public String getMood() {
        return mood;
    }
    /**
     * Accessor method for date.
     * @return the date of the currentMood object as a Date object.
     */
    public Date getDate() {
        return date;
    }
    /**
     * Mutator method for mood.
     * @param mood (class String).
     */
    public void setMood(String new_mood) {
        mood = new_mood;
    }
    /**
     * Mutator method for date.
     * @param date Date object.
     */
    public void setDate(Date new_date) {
        date = new_date;
    }

    /**
     * Abstract method to be implemented by classes that extend CurrentMood.
     */
    public abstract String format();
}
