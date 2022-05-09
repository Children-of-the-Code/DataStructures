package DataStructure.Stack;

import DataStructure.Stack.TedsStack;
import Model.Plate;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        /*
        What are we doing -
        whether you realize or not, using strictly arrays for our storage within java
        is excessively hands-on and convoluted

        (we have a lot to keep track of, our arrays can't dynamically expand,
        if we want to do something like check if array contains a value or remove a value,
        these end up being complicated operations)

        We need to store data algorithmically
        Arrays were doing this too - but we can create objects that contain all the behavior
        we need for this storage

        In java, these objects are provided by default, and they are called under
        our blanket term 'collections'

        Lists
        Queues
        Sets
        Maps
         */

        /*for testing this demo, I no longer want to hardcode in
        my datastructure operations...
        because this will get too confusing

        rather, I want to make a console line menu
         */
        TedsStack stack = new TedsStack();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Print action (push/pop)");
//            get a string from the user input
            String userInput = scanner.nextLine();
//            the math class contains lots of useful static methods
//            for instance: math.random produces a random decimal value between 0 and 1
            double random1 = Math.random();
            double random2 = Math.random();

            if(userInput.equals("push")){
//                push some plate
//                create a random type of plate
//                to get a random number between 0 and n, you can multiply the random decimal by n (math!)
//                and we know that there is a certain amount of plate colors, which will let us generate the nth plate color
                int plateColorIndex = (int) (random1*Plate.Color.values().length);
                Plate.Color plateColor = Plate.Color.values()[plateColorIndex];
                int plateSizeIndex = (int) (random2*Plate.Size.values().length);
                Plate.Size plateSize = Plate.Size.values()[plateSizeIndex];

                Plate randomPlate = new Plate(plateColor, plateSize);
                System.out.println(randomPlate + " Added to stack!");

                stack.push(randomPlate);
            }
            if(userInput.equals("pop")){
                Plate poppedPlate = stack.pop();
                System.out.println(poppedPlate + " Popped!");
            }
//            if i do this, it's possible that there are no longer any memory
//            references to what has been popped
//            what happens?
//            some amount of memory space was previously allocated to the existence
//            of an object in memory
//            BUT:
//            java has automatic memory management! and garbage collection!
//            so... that memory is automatically cleared for future usage
//            (that process is called garbage collection)

            stack.pop();

            /*
            not having to worry about memory management is a big bonus for java
            (java also does some internal memory optimization that, under ideal
            circumstances, is even more efficient)
             */
        }

        /*
        brian wants to make a DS that deals with physics problems
        some important Math library functions
        Math.exp
        Math.abs
        Math.min/max
        Math.pow
        Math.log

        anything you'd want to...
        ideally you'd store data points in your DS

        and then store the operations that you need to perform
        as a method in a service class
        that just performs some aggregate operation on all data points in your DS
        the point here separation of concerns.. a DS should perform DS operations, and anything
        that isn't vital to storing information should be performed elsewhere

        alternatively.. we could try extending a DS and adding our specific methods to it there
        but again, adding specific behavior to a Data structure will be difficult if we intend
        it to contain any type of java object (ie if we use something called generics)
         */

    }


}
