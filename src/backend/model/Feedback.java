package backend.model;

public class Feedback {

    private final double rate;
    private final String review;

    public Feedback(double rate, String comment) {
        this.rate = rate;
        this.review = comment;
    }

    public double getRate() {
        return rate;
    }

    public String getReview() {
        return review;
    }
}
