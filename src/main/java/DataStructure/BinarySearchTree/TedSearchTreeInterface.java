package DataStructure.BinarySearchTree;

/*
An interface is a way for us to guarantee behavior in classes -
sometimes this is referred to as a 'contract'

The idea is, is that even though we can create multiple classes that have same or similar methods,
there's no way for other objects that use those methods
to guarantee that they can use them - for instance, how do we guarantee that an object
is able to call .add or .contains or .get?

The idea being, that with interfaces, we can hotswap different implementations of
certain guaranteed methods,

or, we can also guarantee that a generic can exhibit certain behavior.
 */

public interface TedSearchTreeInterface <T>{
    public void add(T data);
    public boolean contains();
}
