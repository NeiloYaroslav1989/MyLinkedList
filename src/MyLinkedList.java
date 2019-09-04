public class MyLinkedList {

    Node first;
    Node last;
    int size;

    private static class Node {
        Object value;
        Node previous;
        Node next;

        private boolean hasNext() {
            return this.next != null;
        }
    }

    public Node getNext(Node node) {
        return node.next;
    }
    public Node getPrevious(Node node) {
        return node.previous;
    }


    public boolean add (Object object) {
        Node element = new Node();
        element.value = object;
        element.previous = null;
        element.next = null;
        size++;

        if (first == null) {
            first = element;
            first.next = null;
            first.previous = null;

            last = first;
        } else {
            Node previousElement = last;
            previousElement.next = element;
            element.previous = previousElement;
            last = element;
        }
        return true;
    }

    public boolean remove (Object object) {
        Node current = first;
        Node nextElement;
        Node previousElement;

        while (current.hasNext()) {
            if (current.value.equals(object)) {
                nextElement = current.next;
                previousElement = current.previous;

                nextElement.previous = previousElement;
                previousElement.next = nextElement;
            }
            current = current.next;
        }

        size--;
        return true;
    }

    public Object get (int index) {
        Node element = first;
        int indexElement = 0;

        while (element.hasNext()) {
            if (index == indexElement) {
                break;
            }
            element = element.next;
            indexElement++;
        }
        return element.value;
    }

    private Node getElement (int index) {
        Node element = first;
        int indexElement = 0;

        while (element.hasNext()) {
            if (index == indexElement) {
                break;
            }
            element = element.next;
            indexElement++;
        }
        return element;
    }

    public void set (int index, Object object) {
        Node indexNode = getElement(index);
        indexNode.value = object;
    }

    public int size () {
        return size;
    }





}
