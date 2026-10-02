# Melempar Exception Secara Eksplisit

<div class="grid grid-cols-2 gap-8 mt-4 text-sm">

<div class="leading-relaxed space-y-4">

<p>
Exception dapat dipicu secara <strong>sengaja</strong> oleh pengembang melalui kode, meskipun tidak terjadi kesalahan sistem secara teknis.
</p>

<div class="border-l-2 border-yellow-500 pl-4 space-y-2">
<p class="font-semibold text-yellow-300">Tujuan Pelemparan Exception Eksplisit</p>
<p>Digunakan untuk mengendalikan <strong>alur eksekusi spesifik</strong> dalam merespons ketidaksesuaian aturan bisnis (business logic), antara lain:</p>
<ul class="space-y-1 mt-1 list-disc list-inside text-gray-300">
  <li>Validasi ketersediaan entitas data pada sistem</li>
  <li>Validasi integritas dan batasan nilai parameter masukan</li>
  <li>Pengecekan otoritas dan otentikasi hak akses</li>
</ul>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-3 border border-gray-600">
<p class="text-xs text-gray-400 mb-1">Catatan Penting:</p>
<p>Setiap exception, baik yang timbul akibat kegagalan sistem maupun yang dilempar secara sengaja, memerlukan <strong>mekanisme penanganan</strong> untuk menjaga stabilitas program.</p>
</div>

</div>

<div>

```java
public class BankAccount {
    private double balance = 500.0;

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException(
                "Saldo tidak mencukupi untuk transaksi ini."
            );
        }
        balance -= amount;
    }
}
```

</div>

</div>
