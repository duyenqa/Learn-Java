class Person {
  public String name;
  public int age;
  
  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  public void displayInfo(){
      System.out.println("Name: " + name + ", " + "Age: " + age);
  }
}

class Student extends Person{
  public Student(String name, int age){
    super(name, age);
  }
}

public class Main{
    public static void main(String[] args) {
        Student student = new Student("Kim Duyen", 30);
        student.displayInfo();
    }
}
