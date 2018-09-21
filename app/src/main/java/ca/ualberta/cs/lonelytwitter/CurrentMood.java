package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by rcvoon on 9/18/18.
 */

public abstract class CurrentMood {
    private String mood;
    private Date date;

    public CurrentMood() {
        this.mood = "I don't know what my current mood is.";
        this.date = new Date();
    }
    public CurrentMood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    public String getMood() {
        return mood;
    }
    public Date getDate() {
        return date;
    }
    public void setMood(String new_mood) {
        mood = new_mood;
    }
    public void setDate(Date new_date) {
        date = new_date;
    }


    public abstract String format();
}
