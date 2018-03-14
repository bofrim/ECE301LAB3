package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

public interface Tweetable {
    String getMessage(); // Refactor: Removed redundant public modifier

    Date getDate(); // Refactor: Removed redundant public modifier
}
