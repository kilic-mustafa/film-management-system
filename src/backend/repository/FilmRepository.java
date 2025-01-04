package backend.repository;

import backend.model.Film;
import backend.dataStructures.HashTable;
import backend.dataStructures.LinkedList;

public class FilmRepository {
    private final HashTable<Film> filmTable;

    public FilmRepository(int capacity) {
        filmTable = new HashTable<>(capacity);
    }

    public void save(Film film) {
        filmTable.put(film.getId(), film);
    }

    public Film findById(int filmId) {
        return filmTable.get(filmId);
    }

    public LinkedList<Film> findAll() {
        return filmTable.getAll();
    }

    public void deleteById(int filmId) {
        filmTable.remove(filmId);
    }

    public void update(Film film) {
        filmTable.put(film.getId(), film);
    }

}
