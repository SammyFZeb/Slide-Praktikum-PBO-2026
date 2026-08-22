# Static Method
<br>
    
```java {all|8-11|13-16|all}
public class Ship {
    private String name;

    public Ship(String name) {
        this.name = name;
    }

    // 1. Instance Method (Perlu objek: ferry.sail())
    public void sail() {
        System.out.println("Kapal " + this.name + " berlayar.");
    }

    // 2. Static Method (Langsung via Class: Ship.info())
    public static void info() {
        System.out.println("Semua kapal berlayar di laut.");
    }
}
```

<strong>Static method</strong> terikat langsung pada <em>Class</em>, bukan pada objek individual. Kita tidak perlu membuat <code>new Ship()</code> untuk memanggil <code>info()</code>.