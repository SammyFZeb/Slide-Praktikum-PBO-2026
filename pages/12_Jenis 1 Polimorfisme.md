# Jenis-jenis Polimorfisme

<div class="text-orange text-lg font-semibold mb-3">Compile-time (Static Polymorphism)</div>

<div class="grid grid-cols-2 gap-6">

<div class="text-base text-justify">

**Static Polymorphism** dicapai melalui **overloading method**.

- Nama method sama, tetapi parameternya berbeda.
- Ditentukan saat waktu kompilasi (*compile-time*).

</div>

<div>

```java
class Kalkulator {
    // Metode 1: 2 parameter int
    int tambah(int a, int b) {
        return a + b;
    }

    // Metode 2: 3 parameter int
    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Metode 3: 2 parameter double
    double tambah(double a, double b) {
        return a + b;
    }
}
```

</div>

</div>
