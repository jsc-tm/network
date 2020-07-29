public class Blog implements Review {
    private String author;
    private String text;
    private boolean reviewed = false;
    private boolean published = false;

    public Blog(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
