# Jenis-jenis Polimorfisme

<div class="text-orange text-lg font-semibold mb-2">Runtime (Dynamic Polymorphism)</div>

<div class="grid grid-cols-2 gap-4">

<div>

<div class="text-sm mb-2">

**Dynamic Polymorphism** dicapai melalui **overriding method**.

- Subclass mengubah implementasi metode dari superclass (nama & parameter sama persis).
- Ditentukan saat program berjalan (*runtime*).

</div>

```java
public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();

        hewan1.bersuara(); // Output: Meow!
        hewan2.bersuara(); // Output: Guk guk!

        hewan1.lompat(); // Error!
    }
}
```

</div>

<div>

```java
class Hewan {
    void bersuara() {
        System.out.println("Hewan membuat suara");
    }
}

class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meow!");
    }
    
    void lompat() {
        System.out.println("Jleng!!");
    }
}

class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk guk!");
    }
}
```

</div>

</div>
