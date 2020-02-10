package com.company;

public class Node {

    String nodeValue;
    Node nextNode;
    static int counter;
    static int findCounter;
    static int lengthCounter = 0;

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

        else if (findCounter == index){
            System.out.println(this.nodeValue);
        }

        else{
            findCounter++;
            nextNode.findInList(index);
        }

        return "node value cannot be found";
    }

    public int getLength() {

        if (this.nodeValue != null){

            lengthCounter++;
        }

        if (this.nextNode == null){
            return lengthCounter;
        }
        else {
            nextNode.getLength();
        }

        return lengthCounter;
    }

//    public String [] makeIntoList(Node node){
//
//        String[] arrayOfNodes = new String[1];
//        List<String> nodes = new ArrayList<>(Arrays.asList(arrayOfNodes));
//
//        for (int i = 0; i < arrayOfNodes.length; i++){
//
//            if (this.nodeValue != null) {
//                nodes.add(nodeValue);
//
//                i++;
//            }
//        }
//
//
//       return arrayOfNodes;
//    }
}
