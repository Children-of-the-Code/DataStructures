package DataStructure.Stack;

import Model.Plate;

public class StackNode {
    private Plate data;
    private StackNode next;

    public StackNode(Plate p){
        this.data = p;
    }

    public Plate getData() {
        return data;
    }

    public void setData(Plate data) {
        this.data = data;
    }

    public StackNode getNext() {
        return next;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }
}
