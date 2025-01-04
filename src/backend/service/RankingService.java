package backend.service;

import backend.model.Film;
import java.text.DecimalFormat;
import backend.dataStructures.Heap;
import backend.dataStructures.LinkedList;

public class RankingService {

    private final LinkedList<Film> films;
    private final DecimalFormat df = new DecimalFormat("#0.00");

    public RankingService() {
        this.films = new LinkedList<>();
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public void printRankings() {
        LinkedList<Film> sortedFilms = getSortedFilms();

        int rank = 1;
        for (Film film : sortedFilms) {
            String rankSuffix = getOrdinalSuffix(rank);
            System.out.printf("%d%s - %s (%d) - Rank Score: %s\n",
                    rank, rankSuffix, film.getName(),
                    film.getReleaseYear(),
                    df.format(film.getRankScoreByRateAndRevenue()));
            rank++;
        }
    }

    private LinkedList<Film> getSortedFilms() {
        Heap heap = new Heap(films.size());

        for (Film film : films) {
            heap.add(film);
        }

        LinkedList<Film> sortedFilms = new LinkedList<>();
        while (!heap.isEmpty()) {
            Film film = heap.extractMax();
            sortedFilms.add(film);
        }
        return sortedFilms;
    }


    private String getOrdinalSuffix(int rank) {
        if (rank % 10 == 1 && rank != 11) {
            return "st";
        } else if (rank % 10 == 2 && rank != 12) {
            return "nd";
        } else if (rank % 10 == 3 && rank != 13) {
            return "rd";
        } else {
            return "th";
        }
    }
}