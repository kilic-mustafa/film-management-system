package backend.dataStructures;

import backend.model.Film;
import java.text.DecimalFormat;

public class Stack {

    private final Film [] array;
    private int top;

    private final DecimalFormat df = new DecimalFormat("#0.00");


    public Stack(int size){
        array = new Film[size];
        top = 0;
    }

    public void push(Film film){
        if(this.isFull())
            System.out.println("Stack is Full");
        else{
            top++;
            array[top] = film;
        }
    }

    public Film pop(){
        if(this.isEmpty()){
            System.out.println("Your stack is Empty");
            return null;
        }
        else{
            return array[top--];
        }
    }

    public Film peek() {
        return array[top];
    }


    public boolean isFull(){
        return top == array.length - 1 ;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public void printStack(int n){
        for(int i = top; i > 0; i--){
            System.out.println(i + ". " + array[i].getName() + " - " + df.format(array[i].calculateRevenue()) + " $");
        }
    }
}
