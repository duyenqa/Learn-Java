class Student {
  public Student(){
    System.out.println("Constructor no param");
  }
  
  public Student(String name, int roll_no){
    this();
    System.out.println("Name: " + name + ", " + "ID: " + roll_no);
  }

    public static void main(String[] args) {
        Student student = new Student("John", 2);
    }
}
