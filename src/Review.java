public interface Review {
    boolean isReviewed();
    boolean isPublished();
    void setPublished(boolean publish);
    void publish();
    void unpublish();
}
