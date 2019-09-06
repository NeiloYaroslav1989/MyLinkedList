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

        private boolean hasPrevious() {
            return this.previous != null;
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

        while (current.hasNext()) {
            if (current.value.equals(object)) {
                linkReplace(current);
                doLinkNull(current);
                break;
            }
            current = current.next;
        }
        if (last.value.equals(object)) {
            linkReplace(current);
            doLinkNull(current);
        }

        size--;
        return true;
    }

    private void linkReplace (Node current) {
        Node nextElement = current.next;
        Node previousElement = current.previous;

        nextElement.previous = previousElement;
        previousElement.next = nextElement;
    }

    private void doLinkNull (Node current) {
        current.next = null;
        current.previous = null;
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

    public Object getDuplexSearch (int index) {
        int halfSize = size / 2;
        Node element;

        if (index <= halfSize) {
            int elementIndex = 0;
            element = first;
            while (element.hasNext()) {
                if (index == elementIndex) {
                    break;
                }
                element = element.next;
                elementIndex++;
            }
        } else {
            element = last;
            int elementIndex = size - 1;
            while (element.hasPrevious()) {
                if (index == elementIndex) {
                    break;
                }
                element = element.previous;
                elementIndex--;
            }
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

    public boolean contains (Object object) {
        Node current = first;
        boolean isContains = false;

        while (current.hasNext()) {
            if (current.value.equals(object)) {
                isContains = true;
                break;
            } else {
                current = current.next;
            }
        }
        if (last.value.equals(object)) {
            isContains = true;
        }
        return isContains;
    }

    public void clear () {
        Node current = last;
        Node previous = last.previous;

        while (current != null || previous != null) {
            previous = current.previous;
            current.next = null;
            current.previous = null;
            current = previous;
        }
        first = null;
        last = null;
        size = 0;
    }
}
