package backend.model;

import backend.dataStructures.LinkedList;

public class Actor {
    private static int idCounter = 1;

    private final int id;
    private String name;

    final private LinkedList<Film> films;

    public Actor(String name) {
        this.id = idCounter++;
        this.name = name;
        this.films = new LinkedList<>();
    }

    public void addFilm(Film film) {
        if (!films.isContains(film)) {
            films.add(film);
        }
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

    public LinkedList<Film> getFilms() {
        return films;
    }

    public String toString() {
        return "ActorEntity{" +
                "actorId=" + id +
                ", actorName='" + name + '\'' +
                ", filmSize=" + films.size() +
                '}';
    }

    public int compareTo(Actor otherActor) {
        return this.name.compareTo(otherActor.name);
    }
}