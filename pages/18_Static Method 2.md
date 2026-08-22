# Static Method
<br>

```java
public class Main {
    public static void main(String[] args) {
        Ship.info();                        // 1. Static Method (Langsung via Class, tanpa 'new')
        Ship ferry = new Ship("Merak");   
        ferry.sail();                       // 2. Instance Method (Dipanggil dari objek 'ferry')
    }
}
```

<div class="mt-4 text-xs">

| Aspek | Instance Method | Static Method |
| :--- | :--- | :--- |
| **Kepemilikan** | Milik masing-masing objek | Milik `Class` secara keseluruhan |
| **Pemanggilan** | `objek.method()` *(butuh `new`)* | `Class.method()` *(tanpa `new`)* |
| **Akses Konteks** | Mengenali keyword `this` / `self` | **Tidak** mengenal `this` / `self` |
| **Fungsi Utama** | Mengolah data/status unik objek | Operasi *helper*, *utility*, & fungsi umum |

</div>