# Melempar Exception Secara Eksplisit

<div class="space-y-6 mt-8 text-sm leading-relaxed">

<p class="text-base">
Exception dapat dipicu secara <strong>sengaja</strong> oleh pengembang melalui kode, meskipun tidak terjadi kesalahan sistem secara teknis.
</p>

<div class="border-l-4 border-yellow-500 pl-5 space-y-3">
<p class="font-bold text-yellow-300 text-base">Tujuan Pelemparan Exception Eksplisit</p>
<p>Digunakan untuk mengendalikan <strong>alur eksekusi spesifik</strong> dalam merespons ketidaksesuaian aturan bisnis (business logic), antara lain:</p>
<ul class="space-y-2 mt-2 list-disc list-inside text-gray-300">
  <li>Validasi ketersediaan entitas data pada sistem</li>
  <li>Validasi integritas dan batasan nilai parameter masukan</li>
  <li>Pengecekan otoritas dan otentikasi hak akses</li>
</ul>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-5 border border-gray-600">
<p class="text-base text-gray-300 mb-1 font-semibold">Catatan Penting:</p>
<p>Setiap exception, baik yang timbul akibat kegagalan sistem maupun yang dilempar secara sengaja, memerlukan <strong>mekanisme penanganan</strong> untuk menjaga stabilitas program.</p>
</div>

</div>

---

# Contoh Kode Pelemparan Exception

<p class="text-sm text-gray-300 mb-4 mt-4">Menggunakan kata kunci <code>throw</code> untuk memicu exception ketika aturan bisnis tidak terpenuhi.</p>

<div class="mt-4 w-full">

```java
public class BankAccount {
    private double balance = 500.0;

    public void withdraw(double amount) {
        // Validasi aturan bisnis
        if (amount > balance) {
            // Melempar exception jika kondisi gagal terpenuhi
            throw new IllegalArgumentException(
                "Saldo tidak mencukupi untuk memproses transaksi penarikan ini."
            );
        }
        
        // Alur normal jika validasi berhasil
        balance -= amount;
    }
}
```

</div>
