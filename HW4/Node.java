package HW4;

public class Node<E> {

    private E element;
    private Node nextNode;

    public Node(E element) {
        this.element = element;
    }

    public Node(E element, Node<E> nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }

    public boolean isLast(){
        return this.nextNode==null;
    }

    public boolean hasNext(){
        return this.nextNode!=null;
    }
}
