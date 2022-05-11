package DataStructure.BinarySearchTree;

//we are extending exception - so, we are inheriting all of its behavior,
//and an existing exception object can be casted to our more specific exception
public class AlreadyExistsException extends Exception{
    public AlreadyExistsException(String errorMessage, Throwable error){
//        'super' is calling the constructor of our parent class (Exception)
        super(errorMessage, error);
    }
}
