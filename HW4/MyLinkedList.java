package HW4;

import java.lang.reflect.Array;
import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E> {

    private Node<E> first, last;
    private int size;

    public MyLinkedList() {
        this.size=0;
    }

    @Override
    public void add(E element) {
        if(size==0){
            first = new Node<>(element);
            last = first;
            size++;
        }
        else {
            last.setNextNode(new Node<>(element));
            last = last.getNextNode();
            size++;
        }
    }

    @Override
    public void add(int index, E element) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException();
        if (index == size) {
            add(element);
        }
        else {
            Node<E> node = getNode(index);
            node.setNextNode(new Node<>(element, node.getNextNode()));
            size++;
        }
    }

    private Node<E> getNode(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        Node<E> node = first;
        for (; index != 1; index--) {
            node = node.getNextNode();
        }
        return node;
    }


    @Override
    public void clear() {
        Node<E> node;
        for(Node<E> iNode = this.first; iNode != null; iNode = node) {
            node = iNode.getNextNode();
            iNode.setElement(null);
            iNode.setNextNode(null);
        }
        this.first = this.last = null;
        this.size=0;

    }

    @Override
    public E get(int index) {
        return getNode(index).getElement();
    }

    @Override
    public int indexOf(E element) {
        int index = 0;
        Node<E> node;
        if (element == null) {
            for(node = this.first; node != null; node = node.getNextNode()) {
                if (node.getElement() == null) {
                    return index;
                }
                ++index;
            }
        } else {
            for(node = this.first; node != null; node = node.getNextNode()) {
                if (element.equals(node.getElement())) {
                    return index;
                }
                ++index;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        if (size==0)
            return null;
        if (index > size || index < 1)
            throw new IndexOutOfBoundsException();
        else {
            E removeElement = getNode(index).getElement();
            Node<E> node = getNode(index-1);
            node.setNextNode(node.getNextNode().getNextNode());
            size--;
            return removeElement;
        }
    }

    @Override
    public E set(int index, E element) {
        if (index > size || index < 1)
            throw new IndexOutOfBoundsException();
        if (size==0) {
            first = new Node<>(element);
            return null;
        }
        else {
            E oldElement = getNode(index).getElement();
            getNode(index).setElement(element);
            return oldElement;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[this.size];
        int index = 0;

        for(Node<E> var3 = this.first; var3 != null; var3 = var3.getNextNode()) {
            arr[index++] = var3.getElement();
        }

        return arr;
    }

    @Override
    public String toString() {
        if (size==0)
            return "[]";
        StringBuilder pass = new StringBuilder().append('[');
        for (Node<E> cur = first; cur!=null; cur = cur.getNextNode()) {
            pass.append(cur.getElement());
            pass.append(", ");
        }
        pass.setCharAt(pass.length() - 2, ']');
        return pass.deleteCharAt(pass.length() - 1).toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> lastReturned;
            private Node<E> next = first;
            private int nextIndex=0;

            @Override
            public boolean hasNext() {
                return nextIndex < size();
            }

            @Override
            public E next() throws IndexOutOfBoundsException {
                this.lastReturned = this.next;
                this.next = this.next.getNextNode();
                ++this.nextIndex;
                return this.lastReturned.getElement();
            }
        };
    }
}
