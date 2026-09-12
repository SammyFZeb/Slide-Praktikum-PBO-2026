# Perbandingan

<div class="text-orange font-semibold mb-4">Deklarasi Objek: Biasa vs Polimorfisme</div>

<br>

| Aspek | `Kucing hewan1 = new Kucing();` | `Hewan hewan1 = new Kucing();` |
| :--- | :--- | :--- |
| **Tipe Referensi** | Spesifik (*Subclass*) | Fleksibel / General (*Superclass*) |
| **Akses Metode** | Bisa panggil semua metode di `Hewan` dan metode khusus `Kucing`. | Hanya bisa panggil metode yang ada di kelas `Hewan`. |
| **Penggunaan Polimorfisme** | Tidak menggunakan polimorfisme. | Menggunakan polimorfisme (*Upcasting*). |

<style>
table {
  @apply w-full text-sm mt-4 border-collapse;
}
th {
  @apply py-2.5 px-3 text-orange font-bold border-b-2 border-orange/50 text-left;
}
td {
  @apply py-3 px-3 border-b border-gray-500/20 align-top;
}
</style>
