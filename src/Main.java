public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Array arr = new Array(20);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr.toString());
    }

}
