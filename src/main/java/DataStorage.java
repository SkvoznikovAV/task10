public class DataStorage<E> {
    private E[] data;
    private static final int DEFAULT_SIZE = 5;
    private int currentSize;

    public DataStorage(int size) {
        this.data = (E[]) new Object[size];
        currentSize = 0;
    }

    public DataStorage() {
        this(DEFAULT_SIZE);
    }

    public void add(E value) {
        data[currentSize] = value;
        currentSize++;

        if (currentSize==data.length) {
            E[] newData =(E[]) new Object[currentSize+10];
            for (int i = 0; i < data.length ; i++) {
                newData[i]=data[i];
            }

            this.data=newData;
        }
    }

    public void print() {
        for (int i = 0; i < currentSize; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
    }

    public void exchange(int i, int j) {
        if (i<0 || i>currentSize-1 || j<0 || j>currentSize-1)
            throw new ArrayIndexOutOfBoundsException("Один из индексов выходит за пределы хранилища");

        E temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
