public interface Review extends Author {
    boolean isReviewed();
    boolean isPublished();
    void setPublished(boolean publish);
    void publish();
    void unpublish();
}
