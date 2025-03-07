package ro.ulbs.paradigme.lab2.doublechained;

import ro.ulbs.paradigme.lab2.api.MyList;
import ro.ulbs.paradigme.lab2.api.Node;

public class DoubleChainedList implements MyList {
    private DoubleChainedNode head;

    @Override
    public void addValue(int value) {
        DoubleChainedNode node = new DoubleChainedNode(value);
        if (head == null) {
            head = node;
        } else {
            DoubleChainedNode temp = head;
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(node);
            node.setPrevNode(temp);
        }
    }

    @Override
    public void listNodes() {
        DoubleChainedNode temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " ");
            temp = temp.getNextNode();
        }
        System.out.println();
    }

    @Override
    public Node getNodeByValue(int value) {
        return null;
    }

    @Override
    public boolean isSorted() {
        DoubleChainedNode temp = head;
        while (temp != null && temp.getNextNode() != null) {
            if (temp.getValue() > temp.getNextNode().getValue()) {
                return false;
            }
            temp = temp.getNextNode();
        }
        return true;
    }

    @Override
    public int getSum() {
        int sum = 0;
        DoubleChainedNode temp = head;
        while (temp != null) {
            sum += temp.getValue();
            temp = temp.getNextNode();
        }
        return sum;
    }

    @Override
    public void removeNodeByValue(int value) {
        if (head == null) return;

        if (head.getValue() == value) {
            head = head.getNextNode();
            return;
        }

        DoubleChainedNode temp = head;
        while (temp != null) {
            if (temp.getValue() == value) {
                if (temp.getPrevNode() != null) {
                    temp.getPrevNode().setNextNode(temp.getNextNode());
                }
                if (temp.getNextNode() != null) {
                    temp.getNextNode().setPrevNode(temp.getPrevNode());
                }
                return;
            }
            temp = temp.getNextNode();
        }
    }
}
