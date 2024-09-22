class Person {
  public String name;
  private int age;
  
  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  
  public void setAge(byte age){
      this.age = age;
  }
  
  public void setAge(int age){
      this.age = age;
  }
  
  public void setAge(short age){
      this.age = age;
  }
  
  public void setAge(long age){
      this.age = (int) age;
  }
  
  public int getAge(){
      return this.age;
  }
}


public class Main{
    public static void main(String[] args) {
        Person person = new Person("Kim Duyen", 30);
        byte b = 20;
        person.setAge(b);
        System.out.println(person.getAge());
        
        short c = 21;
        person.setAge(c);
        System.out.println(person.getAge());
        
        int d = 22;
        person.setAge(d);
        System.out.println(person.getAge());
        
        long e = 23;
        person.setAge(e);
        System.out.println(person.getAge());
    }
}
