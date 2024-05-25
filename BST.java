public class BST<E extends Comparable<E>> {
    public BSTNode<E> root;
    public BST() {
            root = null;
        }
    
    public void insert(E data)
        {
            if (root == null) {
                root = new BSTNode<E>(data); 
            } else {
                root.insert(data); 
            }
        }
    
    public void search(E val) {
            E hasil = searchBSTHelper(root, val);
            if (hasil != null) {
                System.out.println("Karakter " + hasil + " ada didalam program");
            } else
                System.out.println("Karakter " + val + " tidak terdapat didalam program");
        }
        
    public E searchBSTHelper(BSTNode<E> node, E val) {
            E result = null;
            if (node != null) {
                if (val.equals(node.getData()))
                    result = node.getData();
                else if (val.compareTo(node.getData()) < 0)
                    result = searchBSTHelper(node.getLeftNode(), val);
                else
                    result = searchBSTHelper(node.getRightNode(), val);
            }
            return result;
        }
    public boolean BSTsearch(E val) 
    {
        return search(root, val);
    }

    private boolean search(BSTNode r, E val) 
    {
        if (r.getData() == val) 
            return true;
        if (r.getLeftNode() != null)
            if (search(r.getLeftNode(), val))
                return true;
        if (r.getRightNode() != null) 
            if (search(r.getRightNode(), val))
                return true;
        return false;
    }

    public void inorder() 
    {
        inorder(root);
    }
    private void inorder(BSTNode r)
    {
        if (r != null)
        {
            inorder(r.getLeftNode());
            System.out.print(r.getData() + " ");
            inorder(r.getRightNode());
        }
    }
    public void preorder() 
    {
        preorder(root);
    }
    private void preorder(BSTNode r)
    {
        if (r != null)
        {
            System.out.print(r.getData() + " ");
            preorder(r.getLeftNode());
            preorder(r.getRightNode());
        }
    }
    public void postorder() 
    {
        postorder(root);
    }
    private void postorder(BSTNode r)
    {
        if (r != null)
        {
            postorder(r.getLeftNode());
            postorder(r.getRightNode());
            System.out.print(r.getData() + " ");
        }
    }
}
    

