public class DLNode {
    Song data;
    DLNode next;
    DLNode prev;

    public DLNode(Song d) {
        this.data = d;
        this.next = null;
        this.prev = null;
    }
}
