import java.util.ArrayList;

abstract public class Post implements Review, Author {
    private String username;  // username of the post's author
    private long timestamp;
    private boolean reviewed = false;
    private boolean published = false;

    /**
     * Constructor for objects of class Post.
     *
     * @param author    The username of the author of this post.
     */
    public Post(String author) {
        username = author;
        timestamp = System.currentTimeMillis();
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String getAuthor() {
        return username;
    }

    @Override
    public void setAuthor(String author) {  }

    /**
     * Return the time of creation of this post.
     *
     * @return The post's creation time, as a system time value.
     */
    public long getTimeStamp()
    {
        return timestamp;
    }

    /**
     * Display the details of this post.
     *
     * (Currently: Print to the text terminal. This is simulating display
     * in a web browser for now.)
     */
    public void display()
    {
        System.out.println(username);
        System.out.println(this.displayContent());
        System.out.print(timeString(timestamp));
    }

    abstract protected String displayContent();

    /**
     * Create a string describing a time point in the past in terms
     * relative to current time, such as "30 seconds ago" or "7 minutes ago".
     * Currently, only seconds and minutes are used for the string.
     *
     * @param time  The time value to convert (in system milliseconds)
     * @return      A relative time string for the given time
     */

    private String timeString(long time)
    {
        long current = System.currentTimeMillis();
        long pastMillis = current - time;      // time passed in milliseconds
        long seconds = pastMillis/1000;
        long minutes = seconds/60;
        if(minutes > 0) {
            return minutes + " minutes ago";
        }
        else {
            return seconds + " seconds ago";
        }
    }

    @Override
    public boolean isReviewed() {
        return reviewed;
    }

    @Override
    public boolean isPublished() {
        return published;
    }

    @Override
    public void setPublished(boolean publish) {
        published = publish;
        if (publish) reviewed = true;
    }

    @Override
    public void publish() {
        setPublished(true);
    }

    @Override
    public void unpublish() {
        setPublished(false);
    }
}
