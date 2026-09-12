# Instance Of


<br>

Contoh lain ketika ada sebuah Class Cat extend Class Animal:

```java
public class TestClass{
  public static void main(String[] args) {
    Cat kucing = new Cat();
    System.out.println(kucing instanceof Animal); // True
  }
}
```