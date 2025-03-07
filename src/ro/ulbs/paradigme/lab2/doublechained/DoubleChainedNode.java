package ro.ulbs.paradigme.lab2.doublechained;

import ro.ulbs.paradigme.lab2.api.Node;

public class DoubleChainedNode implements Node {
    private int value;
    private DoubleChainedNode next, prev;

    public DoubleChainedNode(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public DoubleChainedNode getNextNode() {
        return next;
    }

    public void setNextNode(DoubleChainedNode next) {
        this.next = next;
    }

    public DoubleChainedNode getPrevNode() {
        return prev;
    }

    public void setPrevNode(DoubleChainedNode prev) {
        this.prev = prev;
    }
}

