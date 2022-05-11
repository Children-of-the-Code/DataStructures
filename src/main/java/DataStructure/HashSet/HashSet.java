package DataStructure.HashSet;

public class HashSet<T> {
//    I've been scoping my variables in certain ways..
//    for instance: here I am scoping to an object (4 ways total)
//    bucket will exist within an object
    T[] bucket;
    int bucketSize;
//    other types of scope:
//    static scope (1 for each class, 1 global variable
//    block (scoped within a block of code, like a for loop)
//    method (scoped within a method)

    HashSet(int bucketSize){
//        the hashcode is a unique identifier for an object depending on its information stored
//        the bucket is the sparsely-populated array in which all of our hashset items are stored
        this.bucketSize = bucketSize;
//        need to cast an array of objects into an array of the type i'm using..
        bucket = (T[]) new Object[bucketSize];

    }
    public void add(T data){
//        % is a modulus operator - it is the remainder after a division
//        so.. if i want to know the position where a very large number should fit in an array
//        of 10000,
//        i divide the number by 10000 and use the remainder as a position
//        eg: 49835272983457 within an array of 10000: I take the number 3457 by using that number
//        % 10000
        int hashedPosition = Math.abs(data.hashCode() % bucketSize);
        bucket[hashedPosition] = data;
    }
    public boolean contains(T data){
        int hashedPosition = Math.abs(data.hashCode() % bucketSize);
        return data.equals(bucket[hashedPosition]);
    }
}
