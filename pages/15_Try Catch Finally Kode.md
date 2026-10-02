# Contoh `try` — `catch` — `finally`

<div class="grid grid-cols-2 gap-6 mt-4 items-start">

<div>

```java
try {
    System.out.print("Masukkan nilai pembagi: ");
    int angka = Integer.parseInt(sc.nextLine());
    System.out.println("Hasil komputasi: " + (100 / angka));
} catch (NumberFormatException e) {
    System.out.println("Kesalahan: Input harus berupa bilangan bulat.");
} catch (ArithmeticException e) {
    System.out.println("Kesalahan: Pembagian dengan nol tidak valid.");
} finally {
    System.out.println("Siklus operasi selesai dieksekusi.");
    sc.close();
}
```

</div>

<div class="text-sm leading-relaxed space-y-4">

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-4 border border-gray-600">
<p class="font-semibold text-yellow-300 mb-2">Penjelasan Semantik:</p>
<p class="italic text-gray-300">Blok <strong>try</strong> mengisolasi area eksekusi normal. Ketika terjadi anomali, sistem akan membangkitkan (<strong>throw</strong>) objek exception. Objek tersebut ditangkap (<strong>catch</strong>) oleh parameter blok penanganan yang berkesesuaian. Setelah evaluasi usai, blok <strong>finally</strong> dieksekusi sebagai rutinitas akhir.</p>
</div>

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-4 border border-blue-700">
<p class="font-semibold text-blue-300 mb-2">Alternatif Pendelegasian Penanganan</p>
<p class="text-gray-300">Apabila sebuah metode tidak diinstruksikan untuk menangani exception secara mandiri, pendelegasian ke metode pemanggil dapat dilakukan menggunakan deklarasi <code class="text-cyan-400">throws</code>.</p>
</div>

</div>

</div>
