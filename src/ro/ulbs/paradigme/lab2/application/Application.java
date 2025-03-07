package ro.ulbs.paradigme.lab2.application;

import ro.ulbs.paradigme.lab2.api.*;
import ro.ulbs.paradigme.lab2.simplechained.*;
import ro.ulbs.paradigme.lab2.doublechained.*;

public class Application {
    public static void main(String[] args) {
        MyList simpleList = new SimpleChainedList();
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Lista simplu inlantuita:");
        for (int v : values) {
            simpleList.addValue(v);
        }
        simpleList.removeNodeByValue(4);
        simpleList.removeNodeByValue(6);
        simpleList.removeNodeByValue(8);
        simpleList.removeNodeByValue(10);
        simpleList.listNodes();
        System.out.println("Suma: " + simpleList.getSum());
        System.out.println("Este sortata? " + simpleList.isSorted());

        MyList doubleList = new DoubleChainedList();
        System.out.println("\nLista dublu inlantuita:");
        for (int v : values) {
            doubleList.addValue(v);
        }
        doubleList.removeNodeByValue(1);
        doubleList.removeNodeByValue(2);
        doubleList.removeNodeByValue(3);
        doubleList.listNodes();
        System.out.println("Suma: " + doubleList.getSum());
        System.out.println("Este sortata? " + doubleList.isSorted());
    }
}

