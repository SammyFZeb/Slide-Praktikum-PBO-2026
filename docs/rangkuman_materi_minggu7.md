# Rangkuman Materi: Exception Handling di Java

Dokumen ini merupakan rangkuman eksekutif dari materi presentasi praktikum Pertemuan 7 mengenai konsep **Exception Handling**. Dokumen ini dapat digunakan sebagai bahan bacaan referensi cepat bagi mahasiswa maupun asisten.

---

## 1. Error vs Exception

Secara arsitektur, terdapat perbedaan yang fundamental antara *Error* dan *Exception*, meskipun keduanya mengganggu berjalannya program:

*   **Error:** Merupakan kondisi kritis berskala sistemik di mana program sama sekali **tidak dapat berjalan semestinya**. Kondisi ini berada di luar kendali *programmer* untuk diperbaiki pada saat *runtime* (misalnya: *Out of Memory*, disk penuh, *Stack Overflow*).
*   **Exception:** Merupakan anomali pada tingkat *runtime* yang dirancang sebagai mekanisme terstruktur. Exception mengalihkan eksekusi dari **alur normal** menuju **alur penanganan khusus** sehingga aplikasi dapat merespons anomali tanpa harus terhenti secara paksa (*crash*).

---

## 2. Hierarki Class Exception

Semua *error* dan *exception* di Java berada di bawah hierarki class tertinggi, yaitu `Throwable`. Pada tingkatan *Exception*, terdapat dua kategori utama:

1.  **Checked Exception:**
    *   **Karakteristik:** Diidentifikasi dan diwajibkan oleh kompilator pada saat proses kompilasi. Jika tidak ditangani, program tidak akan bisa di-*compile*.
    *   **Konteks:** Umumnya berkaitan dengan operasi I/O dan sistem eksternal (contoh: `IOException`, `SQLException`).
2.  **Unchecked Exception (Runtime Exception):**
    *   **Karakteristik:** Tidak diwajibkan oleh kompilator. Terjadi pada saat eksekusi berjalan (*runtime*).
    *   **Konteks:** Berkaitan dengan kesalahan logika pemrograman atau validasi di dalam aplikasi (contoh: `NullPointerException`, `ArithmeticException`, `NumberFormatException`).

---

## 3. Mekanisme `try` — `catch` — `finally`

Ini merupakan struktur kontrol sentral yang digunakan Java untuk menangkap *exception*:

*   `try { ... }`: Blok untuk menempatkan logika/alur bisnis utama. Apabila terjadi exception di baris manapun dalam blok ini, eksekusi akan langsung melompat ke blok `catch`.
*   `catch (ExceptionType e) { ... }`: Blok yang dikhususkan untuk menangkap spesifik exception dan meresponsnya (misalnya melakukan logging, memberikan pesan error pada *user*, atau mengembalikan nilai *default*).
*   `finally { ... }`: Blok opsional yang **selalu dieksekusi**, terlepas dari apakah exception terjadi atau tidak. Umumnya digunakan untuk operasi penutupan/pembersihan (*resource cleanup*) seperti menutup koneksi database atau aliran berkas.

---

## 4. Pelemparan (Throw) dan Propagasi (Throws) Exception

*   **Pelemparan Eksplisit (`throw`):**
    Kita bisa dengan sengaja memicu exception menggunakan kata kunci `throw` (misal: `throw new IllegalArgumentException(...)`). Ini umumnya digunakan ketika **aturan bisnis** gagal terpenuhi, contoh: *saldo tidak cukup untuk ditarik*, *format NIM salah*.
*   **Pendelegasian & Propagasi (`throws`):**
    Jika suatu metode tidak bertanggung jawab untuk menangani suatu *exception* secara internal, metode tersebut bisa mendelegasikan tanggung jawabnya ke metode pemanggil (*caller*) menggunakan kata kunci `throws` di deklarasi *method* (misal: `public void readFile() throws IOException`).

---

## 5. Custom Exception

Dalam arsitektur perangkat lunak yang kompleks, seperti pengembangan REST API, *exception* bawaan Java terkadang tidak cukup representatif.
Pengembang dapat menciptakan hierarki exception berbasis domain dengan mewarisi ( *extends* ) `RuntimeException` atau `Exception`. 

*   **Manfaat:** Memudahkan kategorisasi kesalahan bisnis (misal: `DataNotFoundException`, `ForbiddenException`).
*   **Struktur:** Seringkali diperkaya dengan variabel tambahan seperti *HTTP Status Code* (`404`, `400`, `403`) untuk menyelaraskan *error* internal dengan respons API kepada klien.
