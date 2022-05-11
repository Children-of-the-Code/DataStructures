package DataStructure.BinarySearchTree;

public class TedSearchTree <T extends Comparable<T>>{
    TedsTreeBranch head;

    public void add(T data) throws AlreadyExistsException {
        /*
        caveat 1- if the head is null, make the inserted item the head

        we need to a loop that goes 'down' the tree
        and branches to the left of right of the current node
        depending on the compareto value of the new item
        compared to the node's data
        so:
        if we navigate to the left or right,
        and the node is taken, we continue with our loop
        if we find a free space, then we occupy with the inserted data

        1. check if head is null, if so, fill head
        maintain a current node = head;
        while(looking for space)
        if(new.compareTo(current)<0)
            if(left taken)
                current = current.left;
            else
                current.left = new;
        else if(new.compareTo(current)>0)
            if(right taken)
                current  = current.right;
            else
                current.right = new
        else if(new.compareTo(current == 0)
            throw an error (why not?)
            the logic of our binary search tree only works if we have unique items only

         */

        if(head == null) {
            head = new TedsTreeBranch(data);
            System.out.println("Added to head: "+ data);
        }else{
            TedsTreeBranch<T> current = head;
            while(true){
                if(data.compareTo(current.getData()) < 0){
//                    branch left
                    System.out.println(data + " is less than " + current.getData() +", looking left");
                    if(current.getLeft() == null){
//                        nothing on the left, let's fill it
                        System.out.println("Filling left node with "+data);
                        TedsTreeBranch<T> newNode = new TedsTreeBranch<T>(data);
                        current.setLeft(newNode);
                        return;
                    }else{
                        System.out.println("Branching left");
                        current = current.getLeft();

                    }
                }else if(data.compareTo(current.getData()) > 0){
//                    branch right
                    System.out.println(data + " is greater than "+ current.getData() + ", looking right");
                    if(current.getRight() == null){
//                        nothing on the right, let's fill it
                        System.out.println("Filling right node with "+data);
                        TedsTreeBranch<T> newNode = new TedsTreeBranch<T>(data);
                        current.setRight(newNode);
                        return;
                    }else{
                        System.out.println("Branching right");
                        current = current.getRight();

                    }
                }else{
//                    what happens when we find our item - compareTo == 0?
                    throw new AlreadyExistsException(data + "Already exists in tree!", new Exception());
                }
            }
        }
    }

    public boolean contains() {
        return false;
    }
}
