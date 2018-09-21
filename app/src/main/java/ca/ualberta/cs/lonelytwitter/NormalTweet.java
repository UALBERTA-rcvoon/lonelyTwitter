package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.ArrayList;


/**
 * Created by rcvoon on 9/18/18.
 */

public class NormalTweet extends Tweet {

    NormalTweet() {
        super();
    }
    NormalTweet(String message){
        super(message);
    }
    @Override
    public Boolean isImportant() {
        return false;
    }

}
