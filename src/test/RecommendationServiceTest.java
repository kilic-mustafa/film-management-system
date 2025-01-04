package test;

import java.util.Scanner;
import backend.model.Film;
import backend.model.Feedback;
import backend.service.RecommendationService;

public class RecommendationServiceTest {

    public static void main(String[] args) {
        RecommendationService recommendationService = new RecommendationService();

        Film film1 = new Film("The Shawshank Redemption", "Drama", 1994,253234940,10);
        Film film2 = new Film("The Dark Knight", "Action", 2008,343444554,15);
        Film film3 = new Film("Inception", "Sci-Fi", 2010,3232434,20);
        Film film4 = new Film("Forrest Gump", "Drama", 1994,23230340,12);
        Film film5 = new Film("Pulp Fiction", "Crime", 1994,12343345,22);
        Film film6 = new Film("Avatar: The Way of Water", "Sci-Fi", 2022,799954545,10);
        Film film7 = new Film("The Matrix", "Sci-Fi", 1999, 50000000, 20);
        Film film8 = new Film("Titanic", "Romance", 1997, 25000000, 40);
        Film film9 = new Film("Gladiator", "Action", 2000, 423234444, 17);
        Film film10 = new Film("Interstellar", "Sci-Fi", 2014, 495454343, 19);
        Film film11 = new Film("The Godfather", "Crime", 1972, 250000000, 9);
        Film film12 = new Film("The Matrix Reloaded", "Action", 2003, 460000000, 15);
        Film film13 = new Film("Casablanca", "Romance", 1942, 37674925, 8);
        Film film14 = new Film("The Social Network", "Biography", 2010, 224920315, 13);
        Film film15 = new Film("Whiplash", "Drama", 2014, 49492000, 15);
        Film film16 = new Film("Parasite", "Thriller", 2019, 262600000, 19);
        Film film17 = new Film("1917", "War", 2019, 384900000, 14);
        Film film18 = new Film("Good Will Hunting", "Drama", 1997, 225900000, 17);
        Film film19 = new Film("The Truman Show", "Drama", 1998, 264100000, 16);
        Film film20 = new Film("Coco", "Animation", 2017, 807800000, 11);
        Film film21 = new Film("Slumdog Millionaire", "Drama", 2008, 378100000, 13);
        Film film22 = new Film("Mad Max: Fury Road", "Action", 2015, 375800000, 18);
        Film film23 = new Film("Django Unchained", "Western", 2012, 426100000, 20);
        Film film24 = new Film("The Pianist", "Biography", 2002, 120072577, 15);
        Film film25 = new Film("La La Land", "Musical", 2016, 447400000, 14);
        Film film26 = new Film("Inside Out", "Animation", 2015, 857600000, 12);
        Film film27 = new Film("The Wolf of Wall Street", "Biography", 2013, 392000000, 16);
        Film film28 = new Film("The Grand Budapest Hotel", "Comedy", 2014, 173000000, 11);
        Film film29 = new Film("A Beautiful Mind", "Biography", 2001, 313000000, 14);
        Film film30 = new Film("Spotlight", "Drama", 2015, 98700000, 10);
        Film film31 = new Film("The Lord of the Rings: The Fellowship of the Ring", "Fantasy", 2001, 871368364, 12);
        Film film32 = new Film("The Avengers", "Action", 2012, 1518812988, 15);
        Film film33 = new Film("Black Panther", "Action", 2018, 1346913161, 10);
        Film film34 = new Film("Spider-Man: No Way Home", "Action", 2021, 1928048225, 25);
        Film film35 = new Film("Joker", "Drama", 2019, 1074251311, 18);
        Film film36 = new Film("Frozen", "Animation", 2013, 1274219009, 9);
        Film film37 = new Film("Harry Potter and the Sorcerer's Stone", "Fantasy", 2001, 974755371, 14);
        Film film38 = new Film("The Lion King", "Animation", 1994, 968511805, 12);
        Film film39 = new Film("Shrek", "Animation", 2001, 487853320, 14);
        Film film40 = new Film("The Hunger Games", "Action", 2012, 694394724, 15);

        recommendationService.add(film1);
        recommendationService.add(film2);
        recommendationService.add(film3);
        recommendationService.add(film4);
        recommendationService.add(film5);
        recommendationService.add(film6);
        recommendationService.add(film7);
        recommendationService.add(film8);
        recommendationService.add(film9);
        recommendationService.add(film10);
        recommendationService.add(film11);
        recommendationService.add(film12);
        recommendationService.add(film13);
        recommendationService.add(film14);
        recommendationService.add(film15);
        recommendationService.add(film16);
        recommendationService.add(film17);
        recommendationService.add(film18);
        recommendationService.add(film19);
        recommendationService.add(film20);
        recommendationService.add(film21);
        recommendationService.add(film22);
        recommendationService.add(film23);
        recommendationService.add(film24);
        recommendationService.add(film25);
        recommendationService.add(film26);
        recommendationService.add(film27);
        recommendationService.add(film28);
        recommendationService.add(film29);
        recommendationService.add(film30);
        recommendationService.add(film31);
        recommendationService.add(film32);
        recommendationService.add(film33);
        recommendationService.add(film34);
        recommendationService.add(film35);
        recommendationService.add(film36);
        recommendationService.add(film37);
        recommendationService.add(film38);
        recommendationService.add(film39);
        recommendationService.add(film40);

        produceReviews(film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11, film12, film13, film14,
                        film15, film16, film17, film18, film19, film20, film21, film22, film23, film24, film25, film26, film27,
                        film28, film29, film30, film31, film32, film33, film34, film35, film36, film37, film38, film39, film40);

        System.out.println("============================================================= Recommendation Service =============================================================\n");
        String message = "Enter a genre (Sci-Fi - Drama - Action - Crime - Romance - Musical - Fantasy - " +
                         "Biography - Thriller - War - Animation - Western - Comedy) : ";

        System.out.print(message);
        Scanner input = new Scanner(System.in);
        String genre = input.nextLine();
        System.out.println();

        recommendationService.printRatings(genre);
    }

    private static void produceReviews(Film film1, Film film2, Film film3, Film film4, Film film5, Film film6, Film film7, Film film8, Film film9,
                                       Film film10, Film film11, Film film12, Film film13, Film film14, Film film15, Film film16, Film film17, Film film18,
                                       Film film19, Film film20, Film film21, Film film22, Film film23, Film film24, Film film25, Film film26, Film film27,
                                       Film film28, Film film29, Film film30, Film film31, Film film32, Film film33, Film film34, Film film35, Film film36,
                                       Film film37, Film film38, Film film39, Film film40) {

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
        film9.addReview(new Feedback(8.5, "An epic tale of revenge and honor, beautifully directed and acted."));
        film9.addReview(new Feedback(7.2, "A visually stunning film with a compelling lead performance, but the pacing was uneven."));
        film10.addReview(new Feedback(9.3, "A mind-bending journey through space and time, with emotional depth and incredible visuals."));
        film10.addReview(new Feedback(8.0, "A visually spectacular and ambitious sci-fi film, though a bit overlong."));
        film11.addReview(new Feedback(9.8, "A cinematic masterpiece that redefined the crime genre with impeccable storytelling and acting."));
        film11.addReview(new Feedback(8.7, "An iconic film with memorable performances, though the slow pace may not appeal to everyone."));
        film12.addReview(new Feedback(7.5, "An action-packed sequel with stunning fight scenes, though the plot is overly convoluted."));
        film12.addReview(new Feedback(6.8, "Visually impressive but lacks the originality and impact of the first Matrix film."));
        film13.addReview(new Feedback(9.5, "A timeless classic with an unforgettable love story."));
        film13.addReview(new Feedback(8.7, "Beautifully crafted, with excellent performances and a moving story."));
        film14.addReview(new Feedback(8.5, "A fascinating look into the rise of Facebook and the drama behind it."));
        film14.addReview(new Feedback(7.9, "Great performances, but the pacing could have been better."));
        film15.addReview(new Feedback(9.2, "An intense and exhilarating story of ambition and obsession."));
        film15.addReview(new Feedback(8.8, "Excellent direction and phenomenal acting, especially by J.K. Simmons."));
        film16.addReview(new Feedback(9.6, "A gripping, thought-provoking thriller with masterful storytelling."));
        film16.addReview(new Feedback(8.9, "An unforgettable experience that keeps you on the edge of your seat."));
        film17.addReview(new Feedback(9.0, "A visually stunning war movie with an immersive narrative."));
        film17.addReview(new Feedback(8.5, "Impressive single-shot technique but slightly predictable story."));
        film18.addReview(new Feedback(9.4, "A heartfelt and inspiring drama with superb performances."));
        film18.addReview(new Feedback(8.7, "An emotional rollercoaster with a memorable message."));
        film19.addReview(new Feedback(8.8, "A unique and thought-provoking story about reality and control."));
        film19.addReview(new Feedback(8.2, "Jim Carrey shines in this smart and satirical drama."));
        film20.addReview(new Feedback(9.5, "Heartwarming and visually delightful, a Pixar masterpiece."));
        film20.addReview(new Feedback(8.9, "A touching story about family and memory, with vibrant visuals."));
        film21.addReview(new Feedback(8.7, "A compelling underdog story with a unique narrative structure."));
        film21.addReview(new Feedback(8.1, "Beautifully shot and well-acted, though a bit melodramatic at times."));
        film22.addReview(new Feedback(9.1, "A relentless and breathtaking action movie, truly unforgettable."));
        film22.addReview(new Feedback(8.6, "Amazing visuals and stunts, but the story is somewhat basic."));
        film23.addReview(new Feedback(9.3, "A bold and entertaining western with Tarantino's signature style."));
        film23.addReview(new Feedback(8.8, "Great storytelling and acting, though it's quite violent."));
        film24.addReview(new Feedback(9.5, "An emotionally powerful tale of survival and resilience."));
        film24.addReview(new Feedback(8.8, "A heartbreaking and beautifully acted World War II drama."));
        film25.addReview(new Feedback(9.2, "A magical musical that captures the beauty and struggles of dreams."));
        film25.addReview(new Feedback(8.7, "Colorful and enchanting, with mesmerizing performances."));
        film26.addReview(new Feedback(9.0, "Emotionally deep and visually stunning, a Pixar triumph."));
        film26.addReview(new Feedback(8.8, "A clever and touching exploration of emotions and growing up."));
        film27.addReview(new Feedback(8.9, "An engaging and chaotic look into the world of finance."));
        film27.addReview(new Feedback(8.4, "Leonardo DiCaprio's best, but the pace can be overwhelming."));
        film28.addReview(new Feedback(9.0, "A quirky and visually stunning film with a charming narrative."));
        film28.addReview(new Feedback(8.6, "Funny, heartwarming, and brilliantly directed."));
        film29.addReview(new Feedback(9.3, "A deeply inspiring and well-acted biographical drama."));
        film29.addReview(new Feedback(8.9, "Emotionally engaging with Russell Crowe at his best."));
        film30.addReview(new Feedback(8.8, "A gripping journalistic drama with a powerful message."));
        film30.addReview(new Feedback(8.5, "Strong performances and an impactful story."));
        film31.addReview(new Feedback(9.4, "An epic fantasy with breathtaking visuals and a timeless story."));
        film31.addReview(new Feedback(8.9, "A masterpiece that sets the gold standard for fantasy films."));
        film32.addReview(new Feedback(9.0, "Action-packed and thrilling, a perfect superhero ensemble."));
        film32.addReview(new Feedback(8.5, "Great entertainment with standout moments, though crowded at times."));
        film33.addReview(new Feedback(9.1, "A culturally significant and thrilling superhero film."));
        film33.addReview(new Feedback(8.6, "Strong visuals and performances, though the plot is formulaic."));
        film34.addReview(new Feedback(9.3, "A thrilling and emotional conclusion to Spider-Man's story."));
        film34.addReview(new Feedback(8.7, "Amazing action scenes, though the multiverse concept can be confusing."));
        film35.addReview(new Feedback(9.5, "A dark and haunting character study with an unforgettable performance."));
        film35.addReview(new Feedback(8.8, "Joaquin Phoenix is phenomenal in this gritty and intense drama."));
        film36.addReview(new Feedback(9.0, "A magical and heartwarming Disney classic for all ages."));
        film36.addReview(new Feedback(8.7, "Catchy songs and lovable characters make it a standout."));
        film37.addReview(new Feedback(9.3, "A spellbinding start to an unforgettable fantasy saga."));
        film37.addReview(new Feedback(8.9, "Faithful to the book and beautifully brought to life."));
        film38.addReview(new Feedback(9.5, "An iconic animation with timeless lessons and stunning visuals."));
        film38.addReview(new Feedback(9.0, "Emotional, entertaining, and beautifully animated."));
        film39.addReview(new Feedback(8.9, "A hilarious and heartwarming story with unique characters."));
        film39.addReview(new Feedback(8.5, "Great humor and a fun twist on fairy tales."));
        film40.addReview(new Feedback(8.8, "A thrilling dystopian tale with an inspiring heroine."));
        film40.addReview(new Feedback(8.4, "Well-acted and exciting, though slightly rushed in pacing."));
    }
}