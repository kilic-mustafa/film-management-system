package test;

import backend.model.Film;
import backend.model.Actor;
import backend.service.SearchService;

public class SearchServiceTest {
    public static void main(String[] args) {
        SearchService searchService = new SearchService();

        Film film1 = new Film("The Dark Knight", "Action", 2008,343444554,15);
        Film film2 = new Film("Inception", "Sci-Fi", 2010,3232434,15);
        Film film3 = new Film("The Shawshank Redemption", "Drama", 1994,253234940,10);

        Actor actor1 = new Actor("Christian Bale");
        Actor actor2 = new Actor("Leonardo DiCaprio");
        Actor actor3 = new Actor("Morgan Freeman");
        Actor actor4 = new Actor("Gary Oldman");

        film1.addActor(actor1);
        film1.addActor(actor2);
        film2.addActor(actor2);
        film3.addActor(actor3);
        film1.addActor(actor4);

        searchService.insertFilm(film1);
        searchService.insertFilm(film2);
        searchService.insertFilm(film3);

        searchService.insertActor(actor1);
        searchService.insertActor(actor2);
        searchService.insertActor(actor3);
        searchService.insertActor(actor4);

        System.out.println("========================================= Films in order =========================================\n");
        searchService.printFilmsInOrderByName();

        System.out.println("========================================= Actors in order ========================================\n");
        searchService.printActorsInOrderByName();
    }
}
