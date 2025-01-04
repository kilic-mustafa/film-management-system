package backend.service;

import backend.dataStructures.Queue;

import backend.model.Film;

public class ScreeningService {
    Queue screeningData;

    public ScreeningService(int queueCapacity) {
        screeningData = new Queue(queueCapacity);
    }

    public void addScreeningData(Film film) {
        screeningData.enqueue(film);
    }

    public void showScreenings(int n) {
        screeningData.printQueue(n);
    }
}