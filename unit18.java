public abstract class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void showRole();
}

class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void showRole() {
        System.out.println("I am a teacher. My name is " + name);
    }
}

class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void showRole() {
        System.out.println("I am a student. My name is " + name);
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Person teacher = new Teacher("Alice", 30);
        Person student = new Student("Bob", 20);

        teacher.showRole(); // Output: I am a teacher. My name is Alice
        student.showRole(); // Output: I am a student. My name is Bob
    }
}
