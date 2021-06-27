public class Array {
    private int[] data;
    private int size;

    /**
     * 构造函数，传入数组容量capacity构造Array
     * @param capacity
     */
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     * 无参数构造函数，默认数组的容量capacity=10
     */
    public Array() {
        this(10);
    }

    /**
     * 获取数组中元素的个数
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取数组容量
     * @return data.length
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 返回数组是否为空
     * @return true;false
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 向所有元素后添加一个新元素
     * @param e
     * @throws IllegalAccessException
     */
    public void addLast(int e) throws IllegalAccessException {
        add(size, e);
    }
    public void addFirst(int e) throws IllegalAccessException {
        add(0, e);
    }
    /**
     * 向数组中第index位置插入一个新元素
     */
    public void add(int index, int e) throws IllegalAccessException {
        if (size == data.length) {
            throw new IllegalAccessException("Add Failed. Array is full.");
        }
        if (index < 0 || index > size) {
            throw new IllegalAccessException("Add Failed. Require index >= 0 and index <= size");
        }
        for (int i = size - 1; i >= index; i --) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size ++;
    }

}
