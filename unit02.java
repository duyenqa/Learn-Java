public class Student {
    private String name;
    private int roll_no;

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll No: " + this.roll_no);
    }

    public void showDetails() {
        this.displayInfo();
    }

    public static void main(String[] args) {
        Student student = new Student("John", 2);
        student.showDetails();
    }
}
