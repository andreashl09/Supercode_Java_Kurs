public class IntArrayList {
    private int[] list = new int[10];
    private int countElements = 0;

    public void add(int element) {
        list[countElements] = element;
        countElements++;
    }

    public int get(int index) {
        if (index >= countElements)
            throw new IndexOutOfBoundsException(); // Fehler werfen!
        return list[index];
    }

    // list = { -10, 20, 40 }
    // countElements = 3
    // remove(2)
    // list = { -10, 40 }
    // countElements = 2
    public boolean remove(int index) {
        if (index >= countElements || index < 0)
            return false;

        for (int i = index; i < size() - 1; i++) {
            list[i] = list[i + 1];
        }
        countElements--;
        return true;

    }

    public boolean isEmpty() {
        return countElements == 0;
    }

    public int size() {
        return countElements;
    }

    public int indexOf(int element) {
        for (int i = 0; i < countElements; i++) {
            if (list[i] == element)
                return i;
        }
        return -1;
    }

    public IntArrayList slice(int startIndex, int endIndex) {
        startIndex = Math.min(startIndex, endIndex);
        endIndex = Math.max(startIndex, endIndex);

        if (startIndex < 0)
            throw new IllegalArgumentException();
        IntArrayList sliceList = new IntArrayList();
        if ((startIndex + Math.abs(endIndex) == list.length))
            return sliceList;

        for (int i = startIndex; i < endIndex; i++) {
            sliceList.add(list[i]);
        }

        return sliceList;

    }

    public IntArrayList slice(int startIndex) {
        if (Math.abs(startIndex) > startIndex)
            throw new IllegalArgumentException();
        if (startIndex < 0)
            return slice(list.length - Math.abs(startIndex), list.length);

        return slice(0, list.length - startIndex);
    }
}