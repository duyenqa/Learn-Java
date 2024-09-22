class Student {
  public Student(){
    this("John", 2);
    System.out.println("Constructor no param");
  }
  
  public Student(String name, int roll_no){
    System.out.println("Name: " + name + ", " + "ID: " + roll_no);
  }

    public static void main(String[] args) {
        Student student = new Student();
    }
}
