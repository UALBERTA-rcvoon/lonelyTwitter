package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.ArrayList;


/**
 * <h1>ImportantTweet</h1>
 * ImportantTweet extends Tweet and overrides the isImportant function to return true.
 *
 * @author  Riley Voon
 * @version 1.0
 * @since   2018-09-18
 *
 * © 2018 Riley Voon.  All rights reserved.
 *
 */

public class ImportantTweet extends Tweet {
    /**
     * Constructor with no arguments
     */
    ImportantTweet() {
        super();
    }
    /**
     * Constructor with one argument.
     * @param message to set Tweet message to.
     */
    ImportantTweet(String message) {
        super(message);
    }
    /**
     * Override isImportant to return true
     * @return true
     */
    @Override
    public Boolean isImportant() {
        return true;
    }

}
