# Learn-Java

## Biến
**a. Biến tham trị**
- Thực hiện với dữ liệu nguyên thủy.
- Khi bạn truyền một biến vào một phương thức, một bản sao của giá trị của biến đó sẽ được truyền vào phương thức, và bất kỳ thay đổi nào đối với biến trong phương thức sẽ không ảnh hưởng đến biến gốc bên ngoài phương thức.

```java
public class PassByValue {
    public void changeValue(int x) {
        x = 10;
    }

    public static void main(String[] args) {
        PassByValue pbv = new PassByValue();
        int a = 5;
        System.out.println("Trước khi gọi phương thức: " + a);
        pbv.changeValue(a);
        System.out.println("Sau khi gọi phương thức, giá trị của a: " + a);
    }
}
```
_**Kết quả:**_
```txt
Trước khi gọi phương thức: 5
Sau khi gọi phương thức, giá trị của a: 5
```
**b. Biến tham chiếu**
- Được thực hiện thông qua việc sử dụng các đối tượng. 
- Khi bạn truyền một đối tượng vào một phương thức, bạn đang truyền một tham chiếu tới đối tượng đó, nghĩa là bất kỳ thay đổi nào đối với đối tượng trong phương thức cũng sẽ ảnh hưởng đến đối tượng gốc bên ngoài phương thức.

```java
class Job {
    public String name;
}

public class PassReferenceValue {
    public void modifyJob(Job job) {
        job.name = "Meow meow";
    }

    public static void main(String[] args){
        PassReferenceValue passReferenceValue = new PassReferenceValue();
        Job job = new Job();
        job.name = "Kim Duyên";

        System.out.println("Before call the method: " + job.name);
        passReferenceValue.modifyJob(job);
        System.out.println("After call the method: " + job.name);
    }
}
```

_**Kết quả:**_
```txt
Before call the method: Kim Duyên
After call the method: Meow meow
```
**c. Biến tĩnh**
- Có từ khóa static để đánh dấu biến thuộc về class, không phải object.
- Tồn tại cho đến khi chương trình kết thúc
- Tiết kiệm bộ nhớ

```java
class HelloWorld {
    public static int staticVariable = 50;
    public int instanceVariable = 0; 
    
    public static void main(String[] args) {
        HelloWorld obj1 = new HelloWorld();
        System.out.println(HelloWorld.staticVariable);
        
        obj1.instanceVariable = 10;
        System.out.println(obj1.instanceVariable);
    }
}
```
_**Kết quả:**_
```txt
50
10
```
**e. Boxing**
- Chuyển đổi một kiểu nguyên thủy sang kiểu Wrapper
```java
public class Boxing {
    public static void main(String[] args){
        int num1 = 10;
        Integer wrappedNum1 = num1; //or: Integer wrappedNum1 = Integer.valueOf(num1)
        System.out.println(wrappedNum1);

        float num2 = 5.75f;
        Float wrappedNum2 = num2;  //or: Float wrappedNum2 = Float.valueOf(num2);
        System.out.println(wrappedNum2);

        long num3 = 12345L;
        Long wrappedNum3 = num3;  //or: Long wrappedNum = Long.valueOf(num);
        System.out.println(wrappedNum3);
    }
}
```

**d. Unboxing**
- Chuyển từ một kiểu Wrapper sang kiểu nguyên thủy

```java
public class Unboxing {
    public static void main(String[] args){
        Integer wrapperInt = Integer.valueOf(10);
        int primitiveInt = wrapperInt;
        System.out.println("The value of primitiveInt is: " + primitiveInt);

        Float wrapperFloat = Float.valueOf(5.75f);
        float primitiveFloat = wrapperFloat;
        System.out.println("The value of primitiveFloat is: " + primitiveFloat);

        Long wrapperLong = Long.valueOf(1000L);
        long primitiveLong = wrapperLong;
        System.out.println("Long: " + primitiveLong);

        Double wrapperDouble = Double.valueOf(3.14);
        double primitiveDouble = wrapperDouble;  // unboxing
        System.out.println("Double: " + primitiveDouble);

        Byte wrapperByte = Byte.valueOf((byte) 10);
        byte primitiveByte = wrapperByte;  // unboxing
        System.out.println("Byte: " + primitiveByte);

        Short wrapperShort = Short.valueOf((short) 5);
        short primitiveShort = wrapperShort;  // unboxing
        System.out.println("Short: " + primitiveShort);
    }
}
```


## Overview OOP

![Mind Map OOP](https://github.com/duyenqa/Learn-Java/blob/main/OOP_v1.png "my mind map")

## Author
By Ngô Thị Kim Duyên
