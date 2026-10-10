# Contoh `try` — `catch` — `finally`

<div class="mt-6 w-full">

```java
try {
    System.out.print("Masukkan nilai pembagi: ");
    int angka = Integer.parseInt(sc.nextLine());

    // Alur normal
    System.out.println("Hasil komputasi: " + (100 / angka));

} catch (NumberFormatException e) {
    // Penanganan exception parsing data
    System.out.println("Kesalahan: Input harus berupa bilangan bulat.");

} catch (ArithmeticException e) {
    // Penanganan exception matematika
    System.out.println("Kesalahan: Pembagian dengan nol tidak valid.");

} finally {
    // Dieksekusi pada akhir kondisi apapun
    System.out.println("Siklus operasi selesai dieksekusi.");
    sc.close();
}
```

</div>

---

# Penjelasan Eksekusi Exception

<div class="space-y-8 mt-8 text-sm leading-relaxed">

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-6 border border-gray-600">
<p class="font-semibold text-yellow-300 mb-3 text-base">Penjelasan Semantik:</p>
<p class="text-gray-300 text-base">Blok <strong>try</strong> mengisolasi area eksekusi normal. Ketika terjadi anomali, sistem akan melempar (<strong>throw</strong>) objek exception. Objek tersebut ditangkap (<strong>catch</strong>) oleh parameter blok penanganan yang berkesesuaian. Setelah evaluasi usai, blok <strong>finally</strong> dieksekusi sebagai rutinitas akhir.</p>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-6 border border-blue-700">
<p class="font-semibold text-blue-300 mb-3 text-base">Alternatif Pendelegasian Penanganan</p>
<p class="text-gray-300 text-base">Apabila sebuah metode tidak diinstruksikan untuk menangani exception secara mandiri, pendelegasian ke metode pemanggil dapat dilakukan menggunakan deklarasi <code class="text-cyan-400 bg-gray-900 px-2 py-1 rounded">throws</code>.</p>
</div>

</div>
