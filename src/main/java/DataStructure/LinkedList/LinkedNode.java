package DataStructure.LinkedList;

public class LinkedNode {
//    a primitive type for a number with a decimal value
    private double data;
    private LinkedNode next;
    public LinkedNode(double data){
        this.data = data;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }
    public String toString(){
        return ""+data;
    }
}
