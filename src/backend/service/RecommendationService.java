package backend.service;

import backend.model.Film;
import java.text.DecimalFormat;
import backend.dataStructures.LinkedList;

public class RecommendationService {
    LinkedList<Film> films = new LinkedList<>();
    private final DecimalFormat df = new DecimalFormat("#0.00");

    public void add (Film film) {
        films.add(film);
    }

    public LinkedList<Film> findByGenre(String genre) {
        LinkedList<Film> recommendationFilms = new LinkedList<>();
        for (Film film : films) {
            if (genre.equals(film.getGenre())) {
                recommendationFilms.add(film);
            }
        }
        return recommendationFilms;
    }

    public void printRatings(String genre) {
        for (Film film : findByGenre(genre)) {

            System.out.printf("◈ %s (%d) - %s - IMDB: %s\n",
                    film.getName(),
                    film.getReleaseYear(),
                    film.getGenre(),
                    df.format(film.getAverageRate()));
        }
    }
}


