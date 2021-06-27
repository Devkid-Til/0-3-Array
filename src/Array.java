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

}
