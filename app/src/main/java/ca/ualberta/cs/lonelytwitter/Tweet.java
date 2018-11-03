package ca.ualberta.cs.lonelytwitter;


import java.util.Date;
import java.util.ArrayList;

/**
 * <h1>Tweet</h1>
 * Tweet is an abstract class that defines the methods and variables used
 * in ImportantTweet and NormalTweet.
 *
 * @author  Riley Voon
 * @version 1.0
 * @since   2018-09-18
 *
 * © 2018 Riley Voon.  All rights reserved.
 *
*/

public abstract class Tweet implements Tweetable {

    private Date date;
    private String message;
    private static final Integer MAX_CHARS = 140;
    private ArrayList<CurrentMood> moodList;


    /**
    * Constructor with no arguments for Tweet.
    * Sets date to current date and message to a default message.
    */
    Tweet() {
        this.date = new Date();
        this.message = "I am default message";
        this.moodList = new ArrayList<CurrentMood>(); // assign moodList to an empty arraylist so moodList is assigned somewhere
    }
    /**
    * Constructor which accepts a String.
    * Sets date to current date and message to passed argument.
    */
    Tweet(String message) {
        this.date = new Date();
        this.message = message;
        this.moodList = new ArrayList<CurrentMood>(); // assign moodList to an empty arraylist so moodList is assigned somewhere
    }
    /**
    * Accessor method for date.
    * @return the date of the tweet object as a Date object.
    */
    public Date getDate() {
        return this.date;
    }
    /**
    * Accessor method for message.
    * @return the message of the tweet object as a string.
    */
    public String getMessage() {
        return this.message;
    }
    /**
    * Mutator method for message.
    * @param String variable.
    */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= MAX_CHARS) { // access by instance reference instead of this.MAX_CHARS, better form
            this.message = message;
        }
        else {
            throw new TweetTooLongException();
        }
    }
    /**
    * Mutator method for date.
    * @param Date object.
    */
    public void setDate(Date date) {
        this.date = date;
    }
    /**
    * Mutator method for moodlist.
    * @param CurrentMood object to add to the moodlist.
    */
    public void addMood(CurrentMood mood) {
        this.moodList.add(mood);
    }

    /**
     * Abstract method to be implemented by classes that extend Tweet.
     */
    public abstract Boolean isImportant();
    /**
     * Overrides the toString method to display a custom string.
     * @return message.
     */
    @Override
    public String toString() {
        return this.getMessage();
    }
}
