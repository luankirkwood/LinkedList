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
        list.addToList("this is a value at a certain");
        list.addToList("seven");

        System.out.println("Finding if the list contains the value...");
        if (list.listContains("three")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println("Deleting node...");
//        list.deleteNode(4);

        System.out.println("Trying to find the node at this index");
        System.out.println("Node value at this index ");
        list.findInList(1);
        System.out.println(Arrays.toString(list.listOfNodes()));
    }
}
