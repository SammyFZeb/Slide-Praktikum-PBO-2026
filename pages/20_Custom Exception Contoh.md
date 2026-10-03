# Custom Exception Pada Kasus REST API

<div class="space-y-6 mt-8 text-sm">

| Skenario Kegagalan          | Class Exception         | Kode HTTP | Deskripsi Respons                   |
| --------------------------- | ----------------------- | --------- | ----------------------------------- |
| Sumber daya tidak ditemukan | `DataNotFoundException` | `404`     | Data referensi tidak tersedia       |
| Parameter masukan keliru    | `BadRequestException`   | `400`     | Format masukan melanggar skema      |
| Otoritas akses ditolak      | `ForbiddenException`    | `403`     | Akses ditolak oleh sistem otorisasi |

<div class="bg-gray-800 bg-opacity-60 rounded-lg p-6 border border-gray-600 leading-relaxed mt-8">
<p class="font-semibold text-yellow-300 mb-3 text-base">Praktik Terbaik Arsitektural</p>
<p class="text-gray-300 text-base">Pemanfaatan class exception kustom yang terstandardisasi memfasilitasi sentralisasi penanganan error (error handling centralization), sehingga format respons layanan (API) lebih deterministik dan mempermudah integrasi sistem pihak klien.</p>
</div>

</div>

---

# Integrasi Custom Exception pada Kode

<p class="text-sm text-gray-300 mb-4 mt-4">Penerapan custom exception pada tingkat layanan (service) atau logika bisnis aplikasi.</p>

<div class="mt-6 w-full">

```java
// Contoh integrasi pada logic layer
public User retrieveUserRecord(Long userId) {
    // Mencari entitas pengguna ke basis data
    User user = userRepository.findById(userId);

    // Melempar custom exception jika entitas tidak tersedia
    if (user == null) {
        throw new DataNotFoundException(
            "Identitas pengguna tidak teregistrasi pada sistem."
        );
    }

    return user;
}
```

</div>
