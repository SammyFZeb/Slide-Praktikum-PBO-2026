# Interface

<div class="grid grid-cols-2 gap-4">

<div>

Interface berbentuk abstract secara implisit, baik dari keyword Interface nya, maupun method-method didalamnya.

Jika Class diibaratkan sebagai sebuah Blueprint, Interface di sisi lain diibaratkan sebagai sebuah Contract yang wajib dipatuhi (dalam arti diimplementasikan).

Method-method pada interface secara implisit memiliki akses modifier public.

Perhatikan penulisan interface serta pengimplementasiannya pada gambar disamping

</div>

<div>
<div v-click="1" class="">

```java
public interface Kendaraan {
    public void maju();
    public void berhenti();
}
```

</div>
<div v-click="2" class="">

```java
// Mobil wajib mengimplementasikan semua method
// dari interface Kendaraan
public class Mobil implements Kendaraan {
    private String merek;

    public Mobil(String merek) {
        this.merek = merek;
    }

    @Override
    public void maju() {
        System.out.println("Mobil " + merek + " maju.");
    }

    @Override
    public void berhenti() {
        System.out.println("Mobil " + merek + " berhenti.");
    }
}
```

</div>
</div>
</div>
