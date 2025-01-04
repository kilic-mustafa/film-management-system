package backend.dataStructures;

import backend.model.Film;

public class Heap {

    private Film[] heap;
    private int size;

    public Heap(int capacity) {
        this.heap = new Film[capacity];
        this.size = 0;
    }

    public void add(Film film) {
        ensureCapacity();
        heap[size] = film;
        heapifyUp(size);
        size++;
    }

    public Film extractMax() {
        if (size == 0) {
            return null;
        }

        Film maxFilm = heap[0];
        Film lastFilm = heap[size - 1];
        heap[0] = lastFilm;
        size--;
        heapifyDown(0);

        return maxFilm;
    }

    public Film peekMax() {
        if (size == 0) {
            return null;
        }
        return heap[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == heap.length) {
            Film[] newHeap = new Film[heap.length * 2];
            System.arraycopy(heap, 0, newHeap, 0, heap.length);
            heap = newHeap;
        }
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;

            double currentScore = heap[index].getRankScoreByRateAndRevenue();
            double parentScore = heap[parentIndex].getRankScoreByRateAndRevenue();

            if (currentScore > parentScore || (currentScore == parentScore && heap[index].getReleaseYear() > heap[parentIndex].getReleaseYear())) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int largest = index;

        if (leftChildIndex < size) {
            double leftScore = heap[leftChildIndex].getRankScoreByRateAndRevenue();
            double largestScore = heap[largest].getRankScoreByRateAndRevenue();

            if (leftScore > largestScore || (leftScore == largestScore && heap[leftChildIndex].getReleaseYear() > heap[largest].getReleaseYear())) {
                largest = leftChildIndex;
            }
        }

        if (rightChildIndex < size) {
            double rightScore = heap[rightChildIndex].getRankScoreByRateAndRevenue();
            double largestScore = heap[largest].getRankScoreByRateAndRevenue();

            if (rightScore > largestScore || (rightScore == largestScore && heap[rightChildIndex].getReleaseYear() > heap[largest].getReleaseYear())) {
                largest = rightChildIndex;
            }
        }

        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    private void swap(int i, int j) {
        Film temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
