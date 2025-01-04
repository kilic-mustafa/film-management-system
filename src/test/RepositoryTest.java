package test;

import backend.model.Film;
import backend.model.Actor;
import backend.repository.FilmRepository;
import backend.repository.ActorRepository;

public class RepositoryTest {

    public static void main(String[] args) {
        int capacity = 100;
        ActorRepository actorRepository = new ActorRepository(capacity);
        FilmRepository filmRepository = new FilmRepository(capacity);

        Actor actor1 = new Actor("Leonardo DiCaprio");
        Actor actor2 = new Actor("Morgan Freeman");
        Actor actor3 = new Actor("Robert Downey Jr.");
        Actor actor4 = new Actor("Scarlett Johansson");
        Actor actor5 = new Actor("Tom Hanks");
        Actor actor6 = new Actor("Natalie Portman");
        Actor actor7 = new Actor("Christian Bale");
        Actor actor8 = new Actor("Keanu Reeves");
        Actor actor9 = new Actor("Joaquin Phoenix");
        Actor actor10 = new Actor("Anne Hathaway");

        actorRepository.save(actor1);
        actorRepository.save(actor2);
        actorRepository.save(actor3);
        actorRepository.save(actor4);
        actorRepository.save(actor5);
        actorRepository.save(actor6);
        actorRepository.save(actor7);
        actorRepository.save(actor8);
        actorRepository.save(actor9);
        actorRepository.save(actor10);

        Film film1 = new Film("The Shawshank Redemption", "Drama", 1994, 253234940, 10);
        Film film2 = new Film("The Dark Knight", "Action", 2008, 343444554, 15);
        Film film3 = new Film("Inception", "Sci-Fi", 2010, 3232434, 20);
        Film film4 = new Film("Forrest Gump", "Drama", 1994, 23230340, 12);
        Film film5 = new Film("Pulp Fiction", "Crime", 1994, 12343345, 22);
        Film film6 = new Film("Avatar: The Way of Water", "Sci-Fi", 2022, 799954545, 10);
        Film film7 = new Film("The Matrix", "Sci-Fi", 1999, 283334545, 18);
        Film film8 = new Film("Titanic", "Romance", 1997, 65330340, 21);
        Film film9 = new Film("Gladiator", "Action", 2000, 423234444, 17);
        Film film10 = new Film("Interstellar", "Sci-Fi", 2014, 495454343, 19);
        Film film11 = new Film("The Godfather", "Crime", 1972, 250000000, 9);
        Film film12 = new Film("The Matrix Reloaded", "Action", 2003, 460000000, 15);

        filmRepository.save(film1);
        filmRepository.save(film2);
        filmRepository.save(film3);
        filmRepository.save(film4);
        filmRepository.save(film5);
        filmRepository.save(film6);
        filmRepository.save(film7);
        filmRepository.save(film8);
        filmRepository.save(film9);
        filmRepository.save(film10);
        filmRepository.save(film11);
        filmRepository.save(film12);

        film1.addActor(actor1);
        film1.addActor(actor8);
        film1.addActor(actor9);

        film2.addActor(actor1);
        film2.addActor(actor6);

        film3.addActor(actor3);
        film3.addActor(actor7);

        film4.addActor(actor2);
        film4.addActor(actor9);

        film5.addActor(actor5);
        film5.addActor(actor10);

        film6.addActor(actor5);
        film6.addActor(actor9);

        film7.addActor(actor4);
        film7.addActor(actor6);

        film8.addActor(actor4);
        film8.addActor(actor10);

        film9.addActor(actor1);
        film9.addActor(actor7);

        film10.addActor(actor1);
        film10.addActor(actor3);

        film11.addActor(actor2);
        film11.addActor(actor6);

        film12.addActor(actor7);
        film12.addActor(actor10);

        actor1.addFilm(film2);
        actor1.addFilm(film9);
        actor1.addFilm(film11);
        actor1.addFilm(film12);

        actor2.addFilm(film1);
        actor2.addFilm(film4);

        actor3.addFilm(film3);
        actor3.addFilm(film10);

        actor4.addFilm(film7);
        actor4.addFilm(film8);

        actor5.addFilm(film5);
        actor5.addFilm(film6);

        actor6.addFilm(film2);
        actor6.addFilm(film7);
        actor6.addFilm(film11);

        actor7.addFilm(film3);
        actor7.addFilm(film9);
        actor7.addFilm(film12);

        actor8.addFilm(film1);
        actor8.addFilm(film10);

        actor9.addFilm(film6);
        actor9.addFilm(film4);

        actor10.addFilm(film8);
        actor10.addFilm(film5);

        System.out.println("=============== Actors By Id ===============\n");
        System.out.println("◉ (1) --> " + actorRepository.findById(1).getName() + " - Id:"  + actorRepository.findById(1).getId());
        System.out.println("◉ (2) --> " + actorRepository.findById(2).getName() + " - Id:"  + actorRepository.findById(2).getId());
        System.out.println("◉ (3) --> " + actorRepository.findById(3).getName() + " - Id:"  + actorRepository.findById(3).getId());
        System.out.println("◉ (4) --> " + actorRepository.findById(4).getName() + " - Id:"  + actorRepository.findById(4).getId());
        System.out.println("◉ (5) --> " + actorRepository.findById(5).getName() + " - Id:"  + actorRepository.findById(5).getId());
        System.out.println("◉ (6) --> " + actorRepository.findById(6).getName() + " - Id:"  + actorRepository.findById(6).getId());
        System.out.println("◉ (7) --> " + actorRepository.findById(7).getName() + " - Id:"  + actorRepository.findById(7).getId());
        System.out.println("◉ (8) --> " + actorRepository.findById(8).getName() + " - Id:"  + actorRepository.findById(8).getId());
        System.out.println("◉ (9) --> " + actorRepository.findById(9).getName() + " - Id:"  + actorRepository.findById(9).getId());
        System.out.println("◉ (10) --> " + actorRepository.findById(10).getName() + "- Id:"  + actorRepository.findById(10).getId());

        System.out.println("\n=============== Films By Id ===============\n");
        System.out.println("❖ (1) --> " + filmRepository.findById(1).getName() + " - Id:"  + filmRepository.findById(1).getId());
        System.out.println("❖ (2) --> " + filmRepository.findById(2).getName() + " - Id:"  + filmRepository.findById(2).getId());
        System.out.println("❖ (3) --> " + filmRepository.findById(3).getName() + " - Id:"  + filmRepository.findById(3).getId());
        System.out.println("❖ (4) --> " + filmRepository.findById(4).getName() + " - Id:"  + filmRepository.findById(4).getId());
        System.out.println("❖ (5) --> " + filmRepository.findById(5).getName() + " - Id:"  + filmRepository.findById(5).getId());
        System.out.println("❖ (6) --> " + filmRepository.findById(6).getName() + " - Id:"  + filmRepository.findById(6).getId());
        System.out.println("❖ (7) --> " + filmRepository.findById(7).getName() + " - Id:"  + filmRepository.findById(7).getId());
        System.out.println("❖ (8) --> " + filmRepository.findById(8).getName() + " - Id:"  + filmRepository.findById(8).getId());
        System.out.println("❖ (9) --> " + filmRepository.findById(9).getName() + " - Id:"  + filmRepository.findById(9).getId());
        System.out.println("❖ (10) --> " + filmRepository.findById(10).getName() + " - Id:"  + filmRepository.findById(10).getId());
        System.out.println("❖ (11) --> " + filmRepository.findById(11).getName() + " - Id:"  + filmRepository.findById(11).getId());
        System.out.println("❖ (12) --> " + filmRepository.findById(12).getName() + " - Id:"  + filmRepository.findById(12).getId());
    }
}