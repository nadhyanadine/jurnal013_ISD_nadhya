public class Main {
    public static void main(String[] args) {
        BST<Character> BST = new BST<>();
        BST.insert('F');
        BST.insert('E');
        BST.insert('H');
        BST.insert('D');
        BST.insert('G');
        BST.insert('C');
        BST.insert('B');
        BST.insert('H');
        BST.insert('K');
        BST.insert('J');

    
        System.out.print("\nPost order : ");
            BST.postorder();
        System.out.print("\nPre order : ");
            BST.preorder();
        System.out.print("\nIn order : ");
            BST.inorder();
        System.out.print("\nKarakter: ");
            BST.search('K');
            BST.search('A');
    }
}