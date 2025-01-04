package backend.dataStructures;

import backend.model.Film;
import backend.model.Actor;

public class BinarySearchTree<T> {

    public class Node {
        T data;
        Node left, right;

        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public T getData() {
            return data;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }

    private Node root;

    public Node getRoot() {
        return root;
    }

    public BinarySearchTree() {
        root = null;
    }

    public void insert(T data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node node, T data) {
        if (node == null) {
            return new Node(data);
        }

        if (data instanceof Film film) {
            Film nodeFilm = (Film) node.data;
            if (film.compareTo(nodeFilm) < 0) {
                node.left = insertRecursive(node.left, data);
            } else {
                node.right = insertRecursive(node.right, data);
            }
        } else if (data instanceof Actor actor) {
            Actor nodeActor = (Actor) node.data;
            if (actor.compareTo(nodeActor) < 0) {
                node.left = insertRecursive(node.left, data);
            } else {
                node.right = insertRecursive(node.right, data);
            }
        }
        return node;
    }
}
