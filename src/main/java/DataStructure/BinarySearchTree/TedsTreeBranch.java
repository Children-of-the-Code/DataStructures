package DataStructure.BinarySearchTree;

import org.jetbrains.annotations.NotNull;

public class TedsTreeBranch <T extends Comparable> implements Comparable<TedsTreeBranch>{
    private TedsTreeBranch left;
    private TedsTreeBranch right;
    private T data;

    public TedsTreeBranch(T data){
        this.data = data;
    }

    @Override
    public int compareTo(@NotNull TedsTreeBranch o) {
        return data.compareTo(o);
    }

    public TedsTreeBranch getLeft() {
        return left;
    }

    public void setLeft(TedsTreeBranch left) {
        this.left = left;
    }

    public TedsTreeBranch getRight() {
        return right;
    }

    public void setRight(TedsTreeBranch right) {
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}