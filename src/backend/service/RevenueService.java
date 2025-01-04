package backend.service;

import backend.model.Film;
import backend.dataStructures.Stack;

public class RevenueService {
    Stack revenueData;

    public RevenueService(int stackSize){
         revenueData = new Stack(stackSize);
    }

    public void addRevenueData(Film film) {
        revenueData.push(film);
    }

    public void showRevenues(int n) {
        revenueData.printStack(n);
    }
}
