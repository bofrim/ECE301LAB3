/*
 * Copyright (c) 2018.
 * From The Lab of CMPUT 301
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * @author: Brad
 * @version 2.5
 * @see NormalTweet
 * @see ImportantTweet
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Constructor for a tweet object
     * @param message tweet message
     */
    Tweet(String message){

        this.message = message;
        date = new Date();

    }

    /**
     * Constructor for a tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Get the message of a tweet instance.
     *
     * @return tweet message
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException the tweet message is over 140 characters
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Gets the date of a tweet instance.
     *
     * @return the tweet date
     */
    public Date getDate(){
        return date;
    }

    /**
     * Sets the date of a tweet instance.
     *
     * @param date tweet date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Determine that a tweet is important.
     *
     * @return boolean representing the importance of a tweet
     */
    public abstract Boolean isImportant();

    /**
     * Convert the tweet to a string.
     *
     * @return string representing the tweet
     */
    public String toString() {
        return date.toString() + " | " + message;
    }

}
