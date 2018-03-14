package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
// REFACTOR: Removed unused imports

/**
 * Created by bradofrim on 2018-02-13.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    public void addTweet(Tweet tweet) throws IllegalArgumentException {
        if(this.hasTweet(tweet)) {
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
    }


    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }


    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets() {
        Collections.sort(tweets);
        return this.tweets;
    }

    public int getCount() {
        return tweets.size();
    }


}
