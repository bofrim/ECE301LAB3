package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by bradofrim on 2018-02-13.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAdd() {

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    // REFACTOR: Removed @Test annotation
    public void testAddTweetError() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
        tweets.addTweet(tweet);
    }

    public void testHasTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("hello");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet() {
        //using index
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("hello");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("hello");

        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetTweets() {
        TweetList tweets = new TweetList();
        ArrayList<Tweet> literalList = new ArrayList<Tweet>();

        Tweet tweet1 = new NormalTweet("hello");
        Tweet tweet2 = new NormalTweet("hello2");

        literalList.add(tweet1);
        literalList.add(tweet2);

        tweets.add(tweet1);
        tweets.add(tweet2);

        assertEquals(tweets.getTweets(), literalList);
    }

    public void testGetCount() {
        TweetList tweets = new TweetList();

        Tweet tweet1 = new NormalTweet("hello");
        Tweet tweet2 = new NormalTweet("hello2");

        tweets.add(tweet1);
        tweets.add(tweet2);

        assertEquals(tweets.getCount(), 2);
    }
}
