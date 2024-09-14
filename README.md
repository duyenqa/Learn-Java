# Learn-Java

Get the current date and time
```java
Date date = new Date(); // Initialize Date object
```
## Example
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

Convert format date to dd/mm/yyyy hh:mm:ss
```java
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
```
## Example
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
