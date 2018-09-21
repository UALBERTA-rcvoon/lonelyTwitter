package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.ArrayList;


/**
 * Created by rcvoon on 9/18/18.
 */

public class ImportantTweet extends Tweet {

    ImportantTweet() {
        super();
    }

    ImportantTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return true;
    }

}
