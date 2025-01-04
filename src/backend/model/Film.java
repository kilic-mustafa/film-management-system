package backend.model;

import backend.dataStructures.LinkedList;

public class Film {
    private static int idCounter = 1;

    private String name;
    private final int id;
    private String genre;
    private int releaseYear;
    private long viewerCount;
    private double ticketPrice;

    private final LinkedList<Feedback> reviews;

    private final LinkedList<Actor> actors;

    public Film(String filmName, String genre, int releaseYear, long viewerCount, double ticketPrice) {
        this.name = filmName;
        this.id = idCounter++;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.viewerCount = viewerCount;
        this.ticketPrice = ticketPrice;
        this.actors = new LinkedList<>();
        this.reviews = new LinkedList<>();
    }

    public double calculateRevenue() {
        return ticketPrice * viewerCount;
    }

    public void addActor(Actor actor) {
        if (!actors.isContains(actor)) {
            actors.add(actor);
        }
        actor.addFilm(this);
    }

    public void addReview(Feedback feedback) {
        reviews.add(feedback);
    }

    public double getAverageRate() {
        double averageRate = 0;
        for (Feedback feedback : reviews) {
            averageRate += feedback.getRate();
        }
        return averageRate / reviews.size();
    }

    public double getRankScoreByRateAndRevenue() {
        double totalRevenue = calculateRevenue();

        return getAverageRate() * totalRevenue;
    }

    public LinkedList<Actor> getActors() {
        return actors;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public static int getIdCounter() {
        return idCounter;
    }
    public static void setIdCounter(int idCounter) {
        Film.idCounter = idCounter;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public long getViewerCount() {
        return viewerCount;
    }

    public void setViewerCount(long viewerCount) {
        this.viewerCount = viewerCount;
    }

    public LinkedList<Feedback> getReviews() {
        return reviews;
    }

    public String toString() {
        return "FilmEntity{" +
                "filmId=" + id +
                ", filmName='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseYear=" + releaseYear +
                ", actorSize=" + actors.size() +
                '}';
    }

    public int compareTo(Film otherFilm) {
        return this.name.compareTo(otherFilm.name);
    }
}
