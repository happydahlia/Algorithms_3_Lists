public class SLList_Generic<T> {

    private SLNode_Generic<T> head;

    public SLList_Generic() {
        head = null;
    }

    public void addy(T item) {
        SLNode_Generic<T> newNode = new SLNode_Generic<>(item);

        if (head == null) {
            head = newNode;
        } else {
            SLNode_Generic<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void removy(int pos) {
        if (head == null) {
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        SLNode_Generic<T> current = head;
        int counter = 0;

        while (counter < pos - 1 && current.next != null) {
            current = current.next;
            counter++;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public String toString() {
        if (head == null) {
            return "Empty";
        }

        String finalList = "";
        SLNode_Generic<T> current = head;

        while (current != null) {
            finalList += current.data + "\n";
            current = current.next;
        }

        return finalList;
    }
}
