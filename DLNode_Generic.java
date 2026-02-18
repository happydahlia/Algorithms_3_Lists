public class DLNode_Generic<T> {
        T data;
        DLNode_Generic<T> next;
        DLNode_Generic<T> prev;

        public DLNode_Generic(T d) {
            this.data = d;
            this.next = null;
            this.prev = null;
        }
}


