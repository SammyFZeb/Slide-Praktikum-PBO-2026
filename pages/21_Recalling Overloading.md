---
layout: default
---

# Recalling: Method Overloading

<div class="grid grid-cols-[40%_55%] gap-6">
<div>

**Method Overloading**:
Mekanisme menulis ulang method dengan **nama yang sama**, tetapi **berbeda parameter** (jumlah, tipe data, atau urutan). Implementasinya bisa berbeda.

*Compiler* akan otomatis menentukan fungsi mana yang paling cocok dengan inputan.

*(Catatan: TIDAK BOLEH overload hanya berdasarkan perbedaan return type)*

</div>
<div>

```java
public class Kalkulator {
    
    // Method 1: Dua parameter int
    public int tambah(int a, int b) {
        return a + b;
    }
    
    // Method 2: Tiga parameter int (Overloaded)
    public int tambah(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method 3: Parameter double (Overloaded)
    public double tambah(double a, double b) {
        return a + b;
    }
}
```

</div>
</div>