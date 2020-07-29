public class Blog implements Review, Author {
    private String author;
    private String text;
    private boolean reviewed = false;
    private boolean published = false;

    public Blog(String author, String text) {
        this.author = author;
        this.text = text;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
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
