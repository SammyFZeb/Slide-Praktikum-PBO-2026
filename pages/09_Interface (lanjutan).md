# Interface (lanjutan)


<br>

Suatu class dapat mengimplementasi lebih dari 1 Interface.

```java
public class MobilListrik implements Kendaraan, Baterai {
    private String merek;

    public MobilListrik(String merek) {
        this.merek = merek;
    }

    @Override
    public void maju() {
        System.out.println("Mobil " + merek + " maju.");
    }

    @Override
    public void isiDaya() {
        System.out.println("Baterai mobil " + merek + " sedang diisi.");
    }
}
```

Interface dapat dapat meng-extend lebih dari 1 Interface lainnya.


```java
public interface KendaraanOtonom extends Kendaraan, Navigasi {
    public void kemudiOtomatis();
}
```
