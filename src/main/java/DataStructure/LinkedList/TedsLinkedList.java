package DataStructure.LinkedList;

public class TedsLinkedList {
//    the value of memory references that point to nothing is 'null'
    LinkedNode head;
    /*
    A list is a data structure of elements in a particular order
    that can be iterated over
     */
    public void addAtFront(double data){
        LinkedNode newNode = new LinkedNode(data);
        newNode.setNext(head);
        head = newNode;
    }
    public void addAtEnd(double data){
        LinkedNode current  = head;
        while(current.getNext()!=null){
            current = current.getNext();
        }
//        by the time we get to this point, current.get next is null, and we should set it to some useful value
        LinkedNode newNode = new LinkedNode(data);
        current.setNext(newNode);
    }
    public void addInOrder(double data){
        LinkedNode current  = head;
        if(current == null){
            head = new LinkedNode(data);
            return;
        }
        while(current.getNext()!=null && data > current.getNext().getData()){
            current = current.getNext();
        }
//        what if it's in the middle?

        LinkedNode newNode = new LinkedNode(data);
        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }
    public double get(int index){
        LinkedNode current  = head;
//        if we need to get a specific index, then we know that we need to iterate
//        through linked list n number of times
        for(int i = 0; i < index; i++){
            current = current.getNext();
            if(current == null){
                return 0;
            }
        }
        return current.getData();
    }
    public String toString(){

        String representation = "";
        LinkedNode current  = head;
        while(current!=null){

            representation = representation + ", "+ current.toString();
            current = current.getNext();
        }
        return representation;
    }
}
