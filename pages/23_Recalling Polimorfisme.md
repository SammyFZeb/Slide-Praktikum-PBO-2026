---
layout: default
---

# Recalling: Polimorfisme

<div class="grid grid-cols-[40%_55%] gap-6">
<div>

**Polimorfisme**:
Kemampuan untuk mempunyai beberapa bentuk class yang berbeda. Terjadi saat suatu objek bertipe **parent class**, tetapi **pemanggilan constructornya melalui child class**.

Contohnya `Kendaraan bmw = new Mobil();`
Satu referensi array parent (`Kendaraan[]`) dapat menampung campuran berbagai objek *child* nyata.

</div>
<div>

```java
public class Main {
    public static void main(String[] args) {
        
        // Referensinya 'Burung' (Parent), Objeknya 'Elang' (Child)
        Burung burungSatu = new Elang(); 
        
        // Referensinya 'Burung' (Parent), Objeknya 'Bebek' (Child)
        Burung burungDua = new Bebek(); 
        
        // Array Polimorfisme
        Burung[] koleksi = { burungSatu, burungDua };
        
        for(Burung b : koleksi) {
            b.bersuara(); // Panggilan polimorfik
        }
    }
}
```

</div>
</div>