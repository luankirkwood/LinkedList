package com.company;

public class Node {

    String nodeValue;
    Node nextNode;
    static int counter;
    static int newCounter;
    static int listCounter;

    public void setNextNode(Node updatedNode) {
        this.nextNode = updatedNode;
    }

    Node getLastNode() {
        if (nextNode != null) {
            return nextNode.getLastNode();
        }
        return this;
    }


    public boolean listContains(String value) {

        if (this.nodeValue.equals(value)) {
            return true;
        }

        if (nextNode == null) {
            return false;
        }
        return nextNode.listContains(value);
    }

    public void deleteNode(int index) {

        if (nextNode == null){
            System.err.println("The node you're trying to delete doesn't exist (yet)");
            System.err.println("Try adding more nodes to the list before continuing");
        }

        else if (counter == index-1) {

            Node nextNode = this.nextNode.nextNode;
            this.setNextNode(nextNode);
        }

        else {
            counter++;
            this.nextNode.deleteNode(index);
        }
    }

    public String findInList(int index){

        if (this.nodeValue == null){
            return "There is no node with this value";
        }

        else if (newCounter == index){
            System.out.println(this.nodeValue);
        }

        else{
            newCounter++;
            nextNode.findInList(index);
        }

        return "node value cannot be found";
    }

    public String[] listOfNodes() {

        int n = 0;
        String[] arrayOfNodes = new String[n];

        //count how many items in the "linked list", n
        //create array of size n

        if (nextNode != null){
            listCounter++;
        }

//        if (firstNode.getLastNode() != null){
//            listCounter++;
//
//        }
//        else if (firstNode.getLastNode() == null){
//            n = listCounter;
//
//            List<String> nodes = new ArrayList<>(Arrays.asList(arrayOfNodes));
//        }
        return arrayOfNodes;
    }
}
