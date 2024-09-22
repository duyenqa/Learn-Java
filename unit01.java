public class Student {
    public String name;
    public int roll_no;

    public Student(String name, int roll_no){
        this.name = name; 
        this.roll_no = roll_no;
    }
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.roll_no);
    }
}

public class Main {
    public static void main(String[] args) {
        Student st = new Student("John", 2);
        st.displayInfo();
    }
}
