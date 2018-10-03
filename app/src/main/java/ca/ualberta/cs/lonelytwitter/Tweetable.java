package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * <h1>Tweetable</h1>
 * Tweetable is an interface that requires classes which implement it to implement
 * the getMessage() and getDate() methods.
 *
 * @author  Riley Voon
 * @version 1.0
 * @since   2018-09-18
 *
 * © 2018 Riley Voon.  All rights reserved.
 *
 */

public interface Tweetable {
    public String getMessage();
    public Date getDate();
}
