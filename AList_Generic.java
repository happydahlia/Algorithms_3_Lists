public class AList_Generic<T> {
    private T[] list;
    private int maxSize;
    private int size;

    public AList_Generic() {
        maxSize = 10;
        list = (T[]) new Object[maxSize];
        size = 0;
    }

    public void addy(T item) {
        if (size == maxSize) {
            maxSize = maxSize * 2;
            T[] newList = (T[]) new Object[maxSize];

            for (int i = 0; i < size; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }

        list[size] = item;
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

    public String toString() {
        if (size == 0) {
            return "Empty";
        }

        String finalList = "";
        for (int i = 0; i < size; i++) {
            finalList += list[i] + "\n";
        }
        return finalList;
    }

}
