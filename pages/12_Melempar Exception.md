# Melempar Exception Secara Sengaja

<div class="grid grid-cols-2 gap-8 mt-4 text-sm">

<div class="leading-relaxed space-y-4">

<p>
Exception bisa muncul secara <strong>sengaja</strong> meskipun tidak ada error teknis pada kode.
</p>

<div class="border-l-2 border-yellow-500 pl-4 space-y-2">
<p class="font-semibold text-yellow-300">Mengapa perlu melempar exception secara sengaja?</p>
<p>Untuk mengimplementasikan <strong>alur-alur khusus</strong> pada program, misalnya:</p>
<ul class="space-y-1 mt-1">
  <li>📭 Data kosong / tidak ditemukan</li>
  <li>🚫 Input tidak valid</li>
  <li>🔐 Akses data tidak sah</li>
</ul>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-3 border border-gray-600">
<p class="text-xs text-gray-400 mb-1">Ingat:</p>
<p>Baik exception karena <em>error</em> maupun yang <em>sengaja dilempar</em>, keduanya tetap perlu <strong>penanganan khusus</strong>.</p>
</div>

</div>

<div>

```java
public class BankAccount {
    private double balance = 500.0;

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException(
                "Saldo tidak mencukupi!"
            );
        }
        balance -= amount;
    }
}
```

</div>

</div>
