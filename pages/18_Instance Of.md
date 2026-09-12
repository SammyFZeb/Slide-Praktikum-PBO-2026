# Instance Of


<br>

Operator instanceof digunakan untuk mengecek apakah objek adalah sebuah instance dari sebuah Object type (class / subclass / interface). Biasa digunakan ketika menggunakan konsep polimorfisme.

Contoh sederhana:

```java
public class TestClass{
  public static void main(String[] args) {
    TestClass test = new TestClass();
    System.out.println(test instanceof TestClass); // True
  }
}
```