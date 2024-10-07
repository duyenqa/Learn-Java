//Tạo lớp trừu tượng
public abstract class Person{
    public String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void setAge(int age){
        if(age >= 0 && age <= 100){
            this.age = age;
        }
    }
    
    public void setAge(byte age){
        if(age >= 0 && age <= 100){
            this.age = age;
        }
    }
    
    public void setAge(long age){
        if(age >= 0 && age <= 100){
            this.age = (int) age;
        }
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void getInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Person person = new Person("Duyen", 30); //Error: Cannot instantiate the type Person
    }
}
