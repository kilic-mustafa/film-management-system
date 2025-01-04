package test;

import backend.model.Film;
import backend.service.ScreeningService;

public class ScreeningServiceTest {
    public static void main(String[] args) {
        final int queueCapacity = 10;
        int n = 6;

        Film film1 = new Film("The Shawshank Redemption", "Drama", 1994,253234940,10);
        Film film2 = new Film("The Dark Knight", "Action", 2008,343444554,15);
        Film film3 = new Film("Inception", "Sci-Fi", 2010,3232434,20);
        Film film4 = new Film("Forrest Gump", "Drama", 1994,23230340,12);
        Film film5 = new Film("Pulp Fiction", "Crime", 1994,12343345,22);
        Film film6 = new Film("Avatar: The Way of Water", "Sci-Fi", 2022,799954545,10);

        ScreeningService screeningService = new ScreeningService(queueCapacity);

        screeningService.addScreeningData(film1);
        screeningService.addScreeningData(film2);
        screeningService.addScreeningData(film3);
        screeningService.addScreeningData(film4);
        screeningService.addScreeningData(film5);
        screeningService.addScreeningData(film6);

        System.out.printf("=============== Last '%d' Screenings ===============\n",n);
        System.out.println();
        screeningService.showScreenings(n);
    }
}
