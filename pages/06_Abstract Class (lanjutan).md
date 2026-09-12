# Abstract Class (lanjutan)

Contoh penggunaan abstract class

<div class="grid grid-cols-2 gap-4">

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

<div v-click="2" class="">

```java
// Mobil wajib mengimplementasikan method 'maju()' dari Kendaraan
public class Mobil extends Kendaraan {

    @Override
    public void maju() {
        System.out.println("Mobil maju.");
    }
}
```

</div>

<div v-click="3" class="">

```java
public class Main {
    public static void main(String[] args) {
        // Error, tidak bisa meng-instansiasi kelas abstrak secara langsung:
        // Kendaraan myKendaraan = new Kendaraan();

        Mobil myMobil = new Mobil();
        
        myMobil.maju();   // Output: Mobil maju.
        myMobil.berhenti(); // Output: Kendaraan berhenti.
    }
}
```

</div>
</div>
