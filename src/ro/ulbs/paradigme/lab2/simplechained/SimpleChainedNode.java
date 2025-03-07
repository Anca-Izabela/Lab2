package ro.ulbs.paradigme.lab2.simplechained;

import ro.ulbs.paradigme.lab2.api.Node;

public class SimpleChainedNode implements Node {
    private int value;
    private SimpleChainedNode next;

    public SimpleChainedNode(int value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public SimpleChainedNode getNextNode() {
        return next;
    }

    public void setNextNode(SimpleChainedNode next) {
        this.next = next;
    }
}

