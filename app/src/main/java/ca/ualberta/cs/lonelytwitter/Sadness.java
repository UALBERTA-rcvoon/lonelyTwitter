package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

        //to convert Date to String, use format method of SimpleDateFormat class.
        String dateString = dateFormat.format(getDate());

        return "Felt sad :( on " + dateString;

    }
}
