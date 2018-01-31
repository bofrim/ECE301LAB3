/*
 * Copyright (c) 2018.
 * From The Lab of CMPUT 301
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * @Author Brad
 * @Version 2.5
 * @see ca.ualberta.cs.lonelytwitter.Tweet
 * @see ca.ualberta.cs.lonelytwitter.NormalTweet
 */

import java.util.Date;

public class ImportantTweet extends Tweet {
    /**
     * Constructor for ImportantTweet.
     *
     * @param message Tweet message
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructor for ImportantTweet.
     *
     * @param message Tweet message
     * @param date Tweet date
     */
    ImportantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
