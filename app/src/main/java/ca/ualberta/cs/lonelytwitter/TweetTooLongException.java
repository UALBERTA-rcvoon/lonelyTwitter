package ca.ualberta.cs.lonelytwitter;

/**
 * <h1>TweetTooLongException</h1>
 * TweetTooLongException extends Exception and displays a custom exception message.
 *
 * @author  Riley Voon
 * @version 1.0
 * @since   2018-09-18
 *
 * © 2018 Riley Voon.  All rights reserved.
 *
 */

public class TweetTooLongException extends Exception{


    /**
     * Constructor which displays a custom exception message.
     */
    TweetTooLongException() {
        super("The message is too long! Please keep your tweets within 140 characters.");
    }

}
