package DataStructure.Stack;

import Model.Plate;

public class TedsStack {
    StackNode head;
    /*
    the most basic way of storing an infinite amount of information
    (at least in terms of how basic it is to implement)

    Imagine a stack of plates:
    You take and remove plates from the top of the stack.
    If you want to pick up a plate, you're going to pick up the most recently place plate.
     */
//    No constructor: By default java proves a blank constructor automatically

    /*what do we need to start this data structure?
    interestingly... we don't even need something like an array
     */
    public void push(Plate p){
        /*
        We are setting the head to our new item, and setting the 'next' reference to the old head
         */
        StackNode node = new StackNode(p);
        node.setNext(head);
        head = node;
    }
    public Plate pop(){

        if(head==null){
            return null;
        }
        StackNode old = head;
        head = head.getNext();
        return old.getData();
/*
        We just need to return the head, and set the head reference to head.getNext()
        There is a edge case here: what if I try to pop something where head is null (stack is empty?)
        I would get a null reference exception
         */

        /*what happens when something is removed from the stack and nothing is pointing to that object
        anymore?
         */
    }
}


/*Stacks:

Let's say for instance that we have 3 methods

m1{
m2();
}
m2{
m3();
m4();
}
m3{
}
m4{
}
m1();

Stacks are implicitly implemented in all programming languages that have functions
(so all of them)
 */