package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        MyLinkedList list = new MyLinkedList();

        list.addToList("one");
        list.addToList("two");
        list.addToList("three");
        list.addToList("four");
        list.addToList("five");
        list.addToList("six");
        list.addToList("seven");
        list.addToList("look at me");
        list.addToList("I finally did it");
        list.addToList("even though it took me forever");

        System.out.println("Finding if the list contains the value...");
        if (list.listContains("three")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println("Deleting node...");
        list.deleteNode(3);

        System.out.println("Node value at this index ");
        list.findInList(1);
        System.out.println(Arrays.toString(list.listOfNodes()));
    }
}
