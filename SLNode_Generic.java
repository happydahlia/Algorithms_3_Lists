public class SLNode_Generic<T> {
    T data;
    SLNode_Generic<T> next;

    public SLNode_Generic(T d) {
        this.data = d;
        this.next = null;
    }
}

