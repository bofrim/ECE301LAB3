/*
 * Copyright (c) 2018.
 * From The Lab of CMPUT 301
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * NormalTweet
 *
 * @Author Brad
 * @see Tweet
 * @see ImportantTweet
 */
public class NormalTweet extends Tweet {
    /**
     * Construct a NormalTweet
     *
     * @param message Tweet message
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * Construct a NormalTweet
     *
     * @param message Tweet message
     * @param date Tweet Date
     */
    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Determine that the tweet is not important
     * @return FALSE: The tweet is not important
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
