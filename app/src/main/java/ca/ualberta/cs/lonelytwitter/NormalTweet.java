package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.ArrayList;


/**
 * <h1>NormalTweet</h1>
 * NormalTweet extends Tweet and overrides the isImportant function to return false.
 *
 * @author  Riley Voon
 * @version 1.0
 * @since   2018-09-18
 *
 * © 2018 Riley Voon.  All rights reserved.
 *
 */
public class NormalTweet extends Tweet {
    /**
     * Constructor with no arguments
     */
    NormalTweet() {
        super();
    }
    /**
     * Constructor with one argument.
     * @param message to set Tweet message to.
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * Override isImportant to return false
     * @return false
     */
    @Override
    public Boolean isImportant() {
        return false;
    }

}
