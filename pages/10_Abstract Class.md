# Abstract Class
<div class="grid grid-cols-2 gap-4">

<div>

Keyword abstract dapat diterapkan pada class maupun method untuk menambahkan security pada program.

Abstract Class tidak dapat diinstansiasi (tidak bisa dibuat objeknya secara langsung menggunakan new), tetapi dapat diturunkan ke sebuah subclass.

Abstract Method dideklarasikan tanpa memiliki body / implementasi (tanpa tanda kurung kurawal {}).

Subclass yang mewarisi abstract class wajib mengimplementasikan (override) semua abstract method yang ada di dalamnya.

</div>

<div>
<div v-click="1" class="">

```java
public abstract class Kendaraan {
    String merek;

    public abstract void maju();

    public void berhenti() {
        System.out.println("Kendaraan berhenti.");
    }
}
```

</div>
</div>
</div>
