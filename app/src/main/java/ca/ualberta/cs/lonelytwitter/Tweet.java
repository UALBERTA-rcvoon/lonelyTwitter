package ca.ualberta.cs.lonelytwitter;


import java.util.Date;
import java.util.ArrayList;

/**
 * Created by rcvoon on 9/18/18.
 */

public abstract class Tweet implements Tweetable {

    private Date date;
    private String message;
    private static final Integer MAX_CHARS = 140;
    private ArrayList<CurrentMood>  moodList;

    Tweet() {
        this.date = new Date();
        this.message = "I am default message";
    }

    Tweet(String message) {
        this.date = new Date();
        this.message = message;
    }

    public Date getDate() {
        return this.date;
    }
    public String getMessage() {
        return this.message;
    }
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= this.MAX_CHARS) {
            this.message = message;
        }
        else {
            throw new TweetTooLongException();
        }
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void addMood(CurrentMood mood) {
        this.moodList.add(mood);
    }

    public abstract Boolean isImportant();

}
