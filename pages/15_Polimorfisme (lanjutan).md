# Polimorfisme (lanjutan)

<br>

```java
public class Main {
    public static void main(String[] args) {

        Kucing kucing = new Kucing();
        Anjing anjing = new Anjing();
        Kelinci kelinci = new Kelinci();

        Hewan[] hewanArray = {kucing, anjing, kelinci};

        for (Hewan h : hewanArray) {
            h.bersuara();
        }
    }
}
```