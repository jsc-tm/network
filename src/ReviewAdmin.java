import java.util.HashSet;

public class ReviewAdmin {
    private HashSet<Review> toReview;

    public ReviewAdmin() {
        this.toReview = new HashSet<>();
    }

    public boolean addReview(Review review) {
        return this.toReview.add(review);
    }

    public void listReviews() {
        System.out.println("De na te kijken lijst:");
        for (Review r : this.toReview) {
            String reviewed = " - to review";
            if (r.isReviewed()) {
                reviewed = " - review done";
            }
            System.out.println(" " + r + reviewed);
        }
    }

    public static void main(String[] args) {
        MessagePost mp = new MessagePost("wim", "knap werk!");
        mp.addComment("toch niet helemaal akkoord...");
        mp.like();
        mp.like();
        PhotoPost pp = new PhotoPost("betty", "vakantie.jpg", "Op vakantie!");
        pp.like();
        pp.addComment("wow! ik wou dat ik erbij was");
        EventPost ep = new EventPost("bob", "vriend worden");
        Blog b = new Blog("lut", "Dit is mijn eerste blog");
        ReviewAdmin ra = new ReviewAdmin();
        ra.addReview(mp);
        ra.addReview(b);
        ra.addReview(pp);
        ra.addReview(ep);
        ra.listReviews();
    }
}
