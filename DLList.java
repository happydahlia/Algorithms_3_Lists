public class DLList {
    private DLNode head;
    public DLList(){
        head = null;
    }
    public void addy(Song s){
        DLNode newNode = new DLNode(s);
        if (head == null){
            head = newNode;
        }
        else{
            DLNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }
    public void removy (int pos){
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
        DLNode current = head;

        while (counter < pos-1 && current.next != null){
            current = current.next;
            counter++;
        }
        if (current.next != null) {
            DLNode nodeToRemove = current.next;
            current.next = nodeToRemove.next;

            if (nodeToRemove.next != null) {
                nodeToRemove.next.prev = current;
            }
        }
        else{
            return;
        }
    }
    public String toString(){
        DLNode current = head;
        String finalList = "";
        while (current != null){
            finalList += current.data.getTitle() + " by " + current.data.getArtist() + " | Duration: "+ current.data.getLength() + "\n";
            current = current.next;
        }
        return finalList;
    }
}
