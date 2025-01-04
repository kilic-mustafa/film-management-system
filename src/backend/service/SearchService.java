package backend.service;

import backend.model.Film;
import backend.model.Actor;
import backend.dataStructures.BinarySearchTree;

public class SearchService {

    BinarySearchTree<Film> filmTree = new BinarySearchTree<>();
    BinarySearchTree<Actor> actorTree = new BinarySearchTree<>();


    public void printFilmsInOrderByName() {
        if (filmTree != null && filmTree.getRoot() != null) {
            inOrderTraversalFilm(filmTree.getRoot(),true);
        }
        System.out.println();
    }

    public void printActorsInOrderByName() {
        if (actorTree != null && actorTree.getRoot() != null) {
            inOrderTraversalActor(actorTree.getRoot(),true);
        }
        System.out.println();
    }

    private void inOrderTraversalFilm(BinarySearchTree.Node node, boolean isFirstFilm) {
        if (node != null) {
            inOrderTraversalFilm(node.getLeft(), isFirstFilm);

            Film film = (Film) node.getData();
            System.out.print("❖ Film: " + film.getName() + " (" + film.getReleaseYear() + ")");
            System.out.print(" || Acted Actors: ");

            for (Actor actor : film.getActors()) {
                if (actor.getName() != null) {
                    if (isFirstFilm) {
                        System.out.print(actor.getName());
                        isFirstFilm = false;
                    } else {
                        System.out.print(" - " + actor.getName());
                    }
                }
            }
            System.out.println();
            isFirstFilm = true;
            inOrderTraversalFilm(node.getRight(),isFirstFilm);
        }

    }

    private void inOrderTraversalActor(BinarySearchTree.Node node,boolean isFirstActor) {
        if (node != null) {
            inOrderTraversalActor(node.getLeft(),isFirstActor);

            Actor actor = (Actor) node.getData();
            System.out.print("◉ Actor: " + actor.getName());
            System.out.print(" || Acted Films: ");

            for (Film film : actor.getFilms()) {
                if (film != null && film.getName() != null) {
                    if (isFirstActor) {
                        System.out.print(film.getName() + " (" + film.getReleaseYear() + ")");
                        isFirstActor = false;
                    } else {
                        System.out.print(" - " + film.getName() + " (" + film.getReleaseYear() + ")");
                    }
                }
            }

            System.out.println();
            isFirstActor = true;
            inOrderTraversalActor(node.getRight(), isFirstActor);
        }
    }

    public void insertFilm(Film film) {
        filmTree.insert(film);
    }

    public void insertActor(Actor actor) {
        actorTree.insert(actor);
    }
}