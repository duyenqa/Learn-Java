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
## Mảng 1 chiều
- ArrayList là một lớp triển khai của List Interface trong Collections Framework nên nó sẽ có một vài đặc điểm và phương thức tương đồng với List
- Sử dụng ArrayList khi ứng dụng cần truy xuất phần tử nhiều hơn cập nhật và xóa phần tử.
- Sử dụng LinkedList khi ứng dụng cần cập nhật và xóa phần tử nhiều hơn là truy cập phần tử.
  
**a. Khai báo mảng**
```java
List<Integer> listNumberInteger = Arrays.asList(15,2,34,40,51,65);
```
==> Mảng cố định

```java
//Numbers
List<Integer> listNumberInteger = new ArrayList<>(Arrays.asList(15,2,34,40,51,65));
ArrayList<Integer> arrListInteger = new ArrayList<>();
ArrayList<String> arrListInteger1 = new ArrayList<>(3);

ArrayList<Integer> listNumberInteger = new ArrayList<>(Arrays.asList(15,2,34,40,51,65));
Vector<Integer> listNumberInteger = new Vector<>(Arrays.asList(1, 2, 3));
List<Integer> list1 = new LinkedList<>(Arrays.asList(11, 26, 38, 4, 57, 6));

//Strings
List<String> listStrings = new ArrayList<>(Arrays.asList("Java", "Python", "Android", "NodeJS", "Angular", "AI"));
```
==> Mảng động, tự động điều chỉnh kích thước mảng khi thêm, xóa phần tử

**b. Thêm phần tử**
- Khai báo 1 constructor hoặc tạo 1 hàm setter cũng được.
  
```java
public HelloWorld(){
    arrListInteger.add(40);
    arrListInteger.add(10);
    arrListInteger.add(92);
    arrListInteger.add(56);
    arrListInteger.add(38);
    arrListInteger.add(16);
}
```
**c. Lấy danh sách các phần tử**

```java
public List<Integer> getList() {
    return arrListInteger;
}
```

**d. Xóa 1 phần tử số nguyên**

```java
public boolean removeOneElement(int position){
    arrListInteger.remove(position);
    return true;
}
```

**e. Xóa 1 phần tử chuỗi**

```java
public boolean removeOneElement(String skill){
    return listStrings.remove(skill);
}
```

**f. Cập nhật 1 phần tử số nguyên**

```java
public boolean updateOneElement(int position, int number){
    arrListInteger.set(position, number);
    return true;
}
```

**g. Cập nhật 1 phần tử chuỗi**

```java
public boolean updateOneElement(int position, String text){
    listStrings.set(position, text);
    return true;
}
```

**h. Xóa tất cả các phần tử**

```java
//các số nguyên
arrListInteger.clear();

//chuỗi
listStrings.clear();
```

**i. Sắp xếp các phần tử**
  
```java
//các số nguyên tăng dần
Collections.sort(arrListInteger, (s1, s2) -> s1.compareTo(s2));
//hoặc:
Collections.sort(arrListInteger);

//các số nguyên giảm dần
Collections.sort(arrListInteger, Comparator.reverseOrder());

//các chuỗi tăng dần
Collections.sort(listStrings, (s1, s2) -> s1.compareTo(s2));
//hoặc:
Collections.sort(listStrings);

//Các chuỗi giảm dần
Collections.sort(listStrings, Comparator.reverseOrder());
```

**i. Đảo ngược các phần tử**

```java
//các số nguyên
Collections.reverse(arrListInteger);

//chuỗi
Collections.reverse(listStrings);
```

**k. Tần xuất xuất hiện các phần tử**

```java
public class CountWord {
    public static void main(String[] args){
        List<String> strings = Arrays.asList("Java", "Python", "Android", "NodeJS", "Java", "Python");
        for (int i = 0; i < strings.size(); i++) {
            if (strings.indexOf(strings.get(i)) == i) {
                int count = 0;
                for (int j = 0; j < strings.size(); j++) {
                    if (strings.get(i).equals(strings.get(j))) {
                        count++;
                    }
                }
                System.out.println(strings.get(i) + " repeat " + count);
            }
        }
    }
}
```

## Date
**a. Lấy ngày giờ hiện tại**

```java
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
    }
}
```
Actual result:
```txt
Sat Sep 14 19:20:53 ICT 2024
```

**b. Convert format date to dd/mm/yyyy hh:mm:ss**

```java
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
        Date date = new Date();

        String formattedDate = dateFormat.format(date);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
```
Actual result:
```txt
Formatted Date: 14/09/2024 07:20:53
```

## Overview OOP

![Mind Map OOP](https://github.com/duyenqa/Learn-Java/blob/main/OOP_v1.png "my mind map")

## Author
By Ngô Thị Kim Duyên
