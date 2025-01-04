package backend.repository;

import backend.model.Actor;
import backend.dataStructures.HashTable;
import backend.dataStructures.LinkedList;

public class ActorRepository {
    private final HashTable<Actor> actorTable;

    public ActorRepository(int capacity) {
        actorTable = new HashTable<>(capacity);
    }

    public void save(Actor actor) {
        actorTable.put(actor.getId(), actor);
    }

    public Actor findById(int actorId) {
        return actorTable.get(actorId);
    }

    public LinkedList<Actor> findAll() {
        return actorTable.getAll();
    }

    public void deleteById(int actorId) {
        actorTable.remove(actorId);
    }

    public void update(Actor actor) {
        actorTable.put(actor.getId(), actor);
    }
}
