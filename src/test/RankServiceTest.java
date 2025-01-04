package test;

import backend.model.Film;
import backend.model.Feedback;
import backend.service.RankingService;

public class RankServiceTest {

    public static void main(String[] args) {
        RankingService rankingService = new RankingService();

        Film film1 = new Film("The Shawshank Redemption", "Drama", 1994,253234940,10);
        Film film2 = new Film("The Dark Knight", "Action", 2008,343444554,15);
        Film film3 = new Film("Inception", "Sci-Fi", 2010,3232434,20);
        Film film4 = new Film("Forrest Gump", "Drama", 1994,23230340,12);
        Film film5 = new Film("Pulp Fiction", "Crime", 1994,12343345,22);
        Film film6 = new Film("Avatar: The Way of Water", "Sci-Fi", 2022,799954545,10);
        Film film7 = new Film("The Matrix", "Sci-Fi", 1999, 50000000, 20);
        Film film8 = new Film("Titanic", "Epic", 1997, 25000000, 40);

        rankingService.addFilm(film1);
        rankingService.addFilm(film2);
        rankingService.addFilm(film3);
        rankingService.addFilm(film4);
        rankingService.addFilm(film5);
        rankingService.addFilm(film6);
        rankingService.addFilm(film7);
        rankingService.addFilm(film8);

        produceReviews(film1, film2, film3, film4, film5, film6, film7, film8);

        System.out.println("=========================== Film Rankings ===========================\n");
        rankingService.printRankings();
    }

    private static void produceReviews(Film film1, Film film2, Film film3, Film film4, Film film5, Film film6, Film film7, Film film8) {

        film1.addReview(new Feedback(9.2, "Masterpiece! A must-watch for everyone."));
        film1.addReview(new Feedback(7.5, "Excellent acting, but the pacing was slow in parts."));
        film2.addReview(new Feedback(7.8, "Incredible action scenes, but the plot could use work."));
        film2.addReview(new Feedback(6.2, "Great performances, but lacked emotional depth."));
        film3.addReview(new Feedback(8.5, "Mind-bending and visually stunning."));
        film3.addReview(new Feedback(6.0, "Interesting, but hard to follow in some parts."));
        film4.addReview(new Feedback(9.5, "Tom Hanks is phenomenal. Truly a classic."));
        film4.addReview(new Feedback(8.7, "A touching story, though it drags a little in the middle."));
        film5.addReview(new Feedback(8.9, "Great writing and acting, a must-watch for fans of crime dramas."));
        film5.addReview(new Feedback(7.0, "A bit overrated in my opinion, but still a good film."));
        film6.addReview(new Feedback(7.9, "A visually impressive sequel, but lacked the charm of the original."));
        film6.addReview(new Feedback(8.3, "Entertaining, but not as impactful as the first Avatar."));
        film1.addReview(new Feedback(8.8, "A brilliant drama that keeps you engaged throughout."));
        film1.addReview(new Feedback(7.2, "Great performances, but I expected a bit more from the plot."));
        film2.addReview(new Feedback(9.0, "An iconic superhero movie with amazing performances and direction."));
        film2.addReview(new Feedback(7.3, "The Dark Knight rises as an action-packed thriller, but lacks subtlety in places."));
        film3.addReview(new Feedback(9.1, "A masterpiece that combines deep storytelling with incredible visuals."));
        film3.addReview(new Feedback(6.9, "The idea is strong, but the execution leaves a lot to be desired."));
        film4.addReview(new Feedback(10.0, "A timeless classic with unmatched emotional depth. Highly recommended."));
        film4.addReview(new Feedback(8.1, "A heartwarming story, but a little too slow in the middle."));
        film5.addReview(new Feedback(9.3, "A genre-defining film with unforgettable moments and top-notch performances."));
        film5.addReview(new Feedback(8.4, "A raw and gritty crime drama with brilliant dialogue and direction."));
        film6.addReview(new Feedback(7.8, "Visually amazing but felt like a rehash of the first film, lacking the novelty."));
        film6.addReview(new Feedback(8.2, "While it didn't break new ground, the visuals are breathtaking and the story enjoyable."));
        film7.addReview(new Feedback(6.2,"A raw and gritty crime drama with brilliant dialogue and direction."));
        film7.addReview(new Feedback(7.8,"The characters felt real and the plot was very engaging."));
        film8.addReview(new Feedback(6.2,"Visually amazing but felt like a rehash of the first film, lacking the novelty."));
        film8.addReview(new Feedback(7.8,"A beautiful spectacle, but the story lacked emotional depth."));
    }
}
