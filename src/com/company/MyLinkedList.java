package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyLinkedList {

    private Node firstNode = null;

    void addToList(String value) {

        Node newNode = new Node();
        newNode.nodeValue = value;

        if (firstNode == null) {
            firstNode = newNode;
        } else {
            firstNode.getLastNode().setNextNode(newNode);
        }
    }

    public boolean listContains(String value) {
        return firstNode.listContains(value);
    }

    public void deleteNode(int index) {
        firstNode.deleteNode(index);
    }

    public void findInList(int index) {
        firstNode.findInList(index);
    }

    public String[] listOfNodes(){
        return firstNode.listOfNodes();
    }
}