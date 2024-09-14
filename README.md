# Learn-Java

## Date
**a. Get the current date and time**
```java
Date date = new Date(); // Initialize Date object
```
## Example 1
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
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
```
## Example 2
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

## Array

**a. Filter numbers**
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

List<Integer> evenNumbers = numbers.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());
System.out.println(evenNumbers);
```
Actual result:

```
[2, 4, 6, 8]
```

**b. Total numbers in list**
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

int sum = numbers.stream()
        .reduce(0, Integer::sum);
System.out.println(sum);
```
Actual result:

```
45
```

**c. Update values in list**
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

int updateList = numbers.stream()
        .map(n -> n * 2)
        .collect(Collectors.toList());
System.out.println(updateList);
```
Actual result:

```
[2, 4, 6, 8, 10, 12, 14, 16, 18]
```

**d. Sort numbers in list**
```java
List<Integer> numbers = Arrays.asList(36, 67, 56, 12, 99, 50, 97, 90, 13, 7);

List<Integer> sortedNumbers = numbers.stream()
        .sorted()
        .collect(Collectors.toList());
System.out.println(sortedNumbers);
```
or other solution:

```java
List<Integer> numbers = Arrays.asList(36, 67, 56, 12, 99, 50, 97, 90, 13, 7);
Collections.sort(numbers);
System.out.println(numbers);
```
Actual result:

```
[7, 12, 13, 36, 50, 56, 67, 90, 97, 99]
```

**d. Is the list sorted ?**
- a.compareTo(b) > 0: a > b
- a.compareTo(b) < 0: a < b
- a.compareTo(b) = 0: a = b

## Example 1: Check 2 number

```java
Integer number1 = 19;
Integer number2 = 12;

if (number1.compareTo(number2) < 0) {
    System.out.println(number1 + " is less than " + number2);
} else if (number1.compareTo(number2) > 0) {
    System.out.println(number1 + " is greater than " + number2);
} else {
    System.out.println(number1 + " is equal " + number2);
}
```
Actual result
```
19 is greater than 12
```

## Example 2: List string
```java
List<String> words = Arrays.asList("apple", "banana", "cherry", "orange");
boolean isSorted = words.stream()
        .reduce((a, b) -> {
            if (a.compareTo(b) > 0) {
                throw new RuntimeException("No sort");
            }
            return b;
        })
        .isPresent();
if (isSorted) {
    System.out.println("The list is sorted: " + isSorted);
}else {
    System.out.println("The list is not sorted.");
}
```
Actual result:

```
The list is sorted: true
```
**_Explain:_**
```
["apple", "banana", "cherry", "orange"]
```

Compare a = apple, b = banana ==> a < b --> b = banana

Compare a = banana, b = cherry ==> a < b --> b = cherry

Compare a = cherry, b = orange ==> a < b --> b = orange

```
["banana", "apple", "orange", "cherry"]
```

Compare a = banana, b = apple ==> a > b --> "No sort"

## Author
By Ngô Thị Kim Duyên
