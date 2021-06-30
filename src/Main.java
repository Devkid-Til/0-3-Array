public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Array arr = new Array(20);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr.toString());

        arr.add(1,100);
        System.out.println(arr.toString());

        arr.addFirst(-1);
        System.out.println(arr.toString());

        System.out.println(arr.contains(1000));
        System.out.println(arr.contains(1));
        System.out.println(arr.find(1));

        arr.set(1, 10);
        System.out.println(arr);

        arr.delete(2);
        System.out.println(arr);
    }

}
