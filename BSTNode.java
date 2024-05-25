public class BSTNode<E extends Comparable<E>> {
    public BSTNode<E> leftNode;
    public E data;  
    public BSTNode<E> rightNode;

    public BSTNode(E item) {
        data = item;
        leftNode = rightNode = null;
    }

    public E getData() {
        return data;
    }
    public BSTNode<E> getLeftNode() {
        return leftNode;
    }

    public BSTNode<E> getRightNode() {
        return rightNode;
    }
    public void insert(E insertValue) {
        if (insertValue.compareTo(data) < 0) {
        if (leftNode == null) {
            leftNode = new BSTNode<E>(insertValue);
        } else {
            leftNode.insert(insertValue);
            }
        }
        else if (insertValue.compareTo(data) > 0) {
            if (rightNode == null) {
                rightNode = new BSTNode<E>(insertValue);
            } else { 
                rightNode.insert(insertValue);
            }
        }
    }
}
