package com.company;

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

    public void getLength() {
        firstNode.getLength();
    }

    public String[] listOfNodes() {

        int n = firstNode.getLength();
        String[] arrayOfNodes = new String[n];

        Node nodeBeingChecked = firstNode;

        for (int i = 0; i <= n; i++){

            if (nodeBeingChecked == null){
                return arrayOfNodes;
            }

            if (nodeBeingChecked.nextNode == null){

                arrayOfNodes[i] = nodeBeingChecked.nodeValue;

                return arrayOfNodes;
            }

            else {
                arrayOfNodes[i] = nodeBeingChecked.nodeValue;

                nodeBeingChecked = nodeBeingChecked.nextNode;
            }
        }

        return arrayOfNodes;
    }
}