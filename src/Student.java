public class Student implements Comparable<Student> {

    private String name;
    private int score;

    public Student(String name, int age) {
        this.name = name;
        this.score = age;

    }


    @Override
    public boolean equals(Object student) {
        if (this == student)
            return true;
        if (student == null)
            return false;
        if (student.getClass() != this.getClass())
            return false;

        Student another = (Student) student;
        return another.name.equals(this.name);
    }

    @Override
    public int compareTo(Student another) {
        return this.score - another.score;

    }

    @Override
    public String toString() {
        return String.format("Student(name: %s score: %d)", name, score);
    }

    public static void main(String[] args) throws IllegalAccessException {
        Array<Student> arr = new Array<>(10);

        arr.addLast(new Student("Alice", 12));
        arr.addLast(new Student("Bobo", 26));
        arr.addLast(new Student("Jiaqi", 20));

        Student another = new Student("Jiaqi", 20);

        System.out.println(arr.toString());


    }
}





