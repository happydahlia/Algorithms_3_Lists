public class SLList {
    private SLNode head;
    public SLList(){
        head = null;
    }
    public void addy(Song s){
        SLNode newNode = new SLNode(s);
        if (head == null){
            head = newNode;
        }
        else{
            SLNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void removy (int pos){
        if (head == null) {
            return;
        }
        if (pos == 0) {
            head = head.next;
            return;
        }
        int counter = 0;
        SLNode current = head;

        while (counter < pos-1 && current.next != null){
            current = current.next;
            counter++;
        }
        if (current.next != null){
            current.next = current.next.next;
        }
        else{
            return;
        }

    }
    public String toString(){
        SLNode current = head;
        String finalList = "";
        while (current != null){
            finalList += current.data.getTitle() + " by " + current.data.getArtist() + " | Duration: "+ current.data.getLength() + "\n";
            current = current.next;
        }
        return finalList;
    }
}
