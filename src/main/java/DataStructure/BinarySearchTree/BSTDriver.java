package DataStructure.BinarySearchTree;

import java.util.Scanner;

public class BSTDriver {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        TedSearchTree<String> tree = new TedSearchTree<>();
        while(true){
            String in = userInput.nextLine();
            try {
                tree.add(in);
            }catch(AlreadyExistsException err){
//                do something else here, like inform the user that the animal exists already
                err.printStackTrace();
            }catch(Exception someOtherException){
//                do something else
            }
        }
        /*
        generics?
        related to the parent Object class
        all objects are descended from the class Object,
        which contains some of its own methods, like toString, hashcode, equals
        but other than that, it contains really nothing

        it's important regardless to understand the relationship to those object-
        the relationship to any object to Object or from our
        custom exception AlreadyExistsException to exception :
        we are inheriting the behavior of the parent
        unless we override the behavior ourselves

        for instance, we override toString(), equals() very often

        OOP principles:

        inheritance - see above

        polymorphism - overriding behavior from parents, as well as method
        overloading (this is when we have multiple methods with the same name
        but different parameters)

        abstraction - when the complicated behavior of objects is hidden - for instance,
        the behavior of arraylist is not available to the developer - we just use it
        like a regular array and it works

        encapsulation - the hiding of data or methods from other classes/developers,
        who don't always need to know everything (and this prevents them from accessing
        unintended data or behavior)

         */

        /*

        What we've doing since Monday is working with Collections -
        the Collections API in java is a set of premade data structures that we can use

        Lists,
            ArrayList,
            LinkedList
                The difference being, they are good for their own purposes-
                ArrayList is more efficient at adding at the end and getting a specific index
                LinkedList is more efficient at adding at the front, removing items
        Queues,
            Stack - LIFO
            Queue - FIFO
            ArrayDeque - double-sided (both stack and queue)
            PriorityQueue - a queue with multiple sections that are assign priorities
        Maps,
            Maps? Are unique keys that can be mapped to any value each
            We use the key to determine place within the datastructure, which can then
            access the values stored within
            TreeMap
            HashMap
        Sets
            TreeSet - like our BST - ordered set of unique items
            HashSet - hashing adds items to a large sparsely populated array,
            but uses its data to find its appropriate index (2 identical items will have the same
            hash value)

         */

        /*
        Interfaces vs classes:
        interfaces are implemented
        classes are extended (with regards to OOP)
        THE DIFFERENCE IS
        you can only extend a single class
        you can implement an infinite amount of interfaces

        very common interview Q:
        interface vs abstract class-
        abstract class is a class wherin all the methods do not have implementations
        you need to extend and implement them
         */
    }
}
/*
time complexity of adding to end arraylist? O(1) - the time it takes to add to AL
has no relationship to the amount of elements
time complexity of adding to end linkedlist? O(N) - the time it takes scales
directly with the amount of elements (because the entire LL must be traversed)
time complexity of adding to BST? O(log(n)) - because the problem is split in half
in every iteration, doubling the size only adds a single iteration to adding items

w/r/t complexity - having a for loop generally makes a problem o(n)
having a nested for loop (for loop inside for loop) makes a problem o(n^2)
splitting problems in half in every loop iteration makes a problem o(log(n))

 */
