public class DynamicArray
{
    private int[] arr;
    private int length;
    private int capacity;

    // Constructor to initialize the dynamic array
    public DynamicArray(int capacity)
    {
        this.capacity = capacity;
        this.length = 0;
        this.arr = new int[this.capacity];
    }


}
