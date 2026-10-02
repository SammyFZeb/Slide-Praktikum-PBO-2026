# Latihan — Mesin ATM Sederhana

<div class="grid grid-cols-12 gap-6 mt-3 items-start text-sm">

<div class="col-span-7 space-y-4">

<p>Buatlah program Java yang mensimulasikan mesin ATM sederhana dengan ketentuan berikut:</p>

<div class="space-y-3">

<div class="border-l-2 border-blue-500 pl-3">
<span class="font-bold">1. Custom Exception</span>
<p class="text-xs text-gray-300 mt-0.5">
Buat dua custom exception yang meng-extend <code>RuntimeException</code>:<br>
— <code>InsufficientBalanceException</code> (saldo tidak cukup)<br>
— <code>InvalidAmountException</code> (nominal tidak valid)
</p>
</div>

<div class="border-l-2 border-emerald-500 pl-3">
<span class="font-bold">2. Class ATM</span>
<p class="text-xs text-gray-300 mt-0.5">
Buat class <code>ATM</code> dengan method <code>withdraw(double amount)</code>.<br>
Gunakan <code>throw</code> untuk melempar exception sesuai kondisi.
</p>
</div>

<div class="border-l-2 border-yellow-500 pl-3">
<span class="font-bold">3. Program Utama dengan try-catch</span>
<p class="text-xs text-gray-300 mt-0.5">
Tangkap setiap exception dengan pesan yang sesuai. Gunakan <code>finally</code> untuk mencetak saldo akhir.
</p>
</div>

</div>

</div>

<div class="col-span-5">
<span class="text-xs font-mono uppercase text-gray-400 block mb-2">Contoh Output:</span>

```
=== MESIN ATM ===
Saldo awal: Rp 1.000.000

Percobaan tarik: Rp 500.000
Penarikan berhasil.
Saldo akhir: Rp 500.000

Percobaan tarik: Rp 800.000
Error: Saldo tidak mencukupi!
Saldo akhir: Rp 500.000

Percobaan tarik: Rp -100
Error: Nominal tidak valid!
Saldo akhir: Rp 500.000
```

</div>

</div>
