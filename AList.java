public class AList {
    private Song[] list;
    private int maxSize;
    private int size;
    public AList() {
        maxSize = 10;
        list = new Song[maxSize];
        size = 0;
    }

    public void addy(Song p){
        if (size == maxSize){
            maxSize = maxSize + 1;
            Song[] newList = new Song[maxSize];
            for (int i = 0; i < size; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }
            list[size] = p;
            size++;
    }
    public void removy (int pos){
        if (pos < 0 || pos >= size) {
            return;
        }
        else{
            for(int i = pos; i<size-1; i++){
                list[i] = list[i+1];
            }
            size--;
        }
    }
    public String toString(){
        String finalList = "";
        for (int i = 0; i<size; i++){
            finalList += list[i].getTitle() + " by " + list[i].getArtist() + " | Duration: "+ list[i].getLength() + "\n";
        }
        return finalList;
    }
    public static void main(String[] args) {
        Song BBC = new Song("Bonbon Chocolat", "Everglow", 3.30);
        Song DallaDalla = new Song ("Dalla Dalla", "Itzy", 3.15);
        AList playlist = new AList();
        playlist.addy(BBC);
        playlist.addy(DallaDalla);
        playlist.removy(0);
        System.out.print(playlist.toString());
    }
}
