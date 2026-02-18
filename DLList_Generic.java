public class DLList_Generic<T> {

    private DLNode_Generic<T> head;

    public DLList_Generic() {
        head = null;
    }

    public void addy(T item) {
        DLNode_Generic<T> newNode = new DLNode_Generic<>(item);

        if (head == null) {
            head = newNode;
        } else {
            DLNode_Generic<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void removy(int pos) {
        if (head == null) {
            return;
        }

        if (pos == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        int counter = 0;
        DLNode_Generic<T> current = head;

        while (counter < pos - 1 && current.next != null) {
            current = current.next;
            counter++;
        }

        if (current.next != null) {
            DLNode_Generic<T> nodeToRemove = current.next;
            current.next = nodeToRemove.next;

            if (nodeToRemove.next != null) {
                nodeToRemove.next.prev = current;
            }
        }
    }

    public String toString() {
        if (head == null) {
            return "Empty List";
        }

        DLNode_Generic<T> current = head;
        String finalList = "";

        while (current != null) {
            finalList += current.data + "\n"; // calls toString()
            current = current.next;
        }
        return finalList;
    }
}

