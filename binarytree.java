//Code: (for Preorder tree traversal data structure concept)
Class Node {
  Int item;
  Node left, right;

  Public Node(int key) {
  Item = key;
  Left = right = null;
  }
}

Class Tree {
  // root of Tree
  Node root;

  Tree() {
  Root = null;
  }

  Void preorder(Node node) {
    If (node == null)
      Return;

    // traverse the root node
    System.out.print(node.item + “->”);
    // traverse the left child
    Preorder(node.left);
    // traverse the right child
    Preorder(node.right);
  }
}
Class Main{
  Public static void main(String[] args) {
    // create object of tree
    Tree tree = new Tree();

    // create nodes of the tree
    Tree.root = new Node(1);
    Tree.root.left = new Node(12);
    Tree.root.right = new Node(9);
    Tree.root.left.left = new Node(5);
    Tree.root.left.right = new Node(6);

    // preorder tree traversal
    System.out.println(“\nPreorder traversal “);
    Tree.preorder(tree.root);
  }
}


Output:
Preorder traversal
1->12->5->6->9->



Name: Karishma Salgaonkar
Class: Sy BCA
Roll no.: 2205013
 