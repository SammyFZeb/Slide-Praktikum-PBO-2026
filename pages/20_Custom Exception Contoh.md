# Tabel Penggunaan Custom Exception — REST API

<div class="grid grid-cols-2 gap-6 mt-4 items-start text-sm">

<div class="space-y-4">

| Skenario Kegagalan | Class Exception | Kode HTTP | Deskripsi Respons |
|---|---|---|---|
| Sumber daya tidak ditemukan | `DataNotFoundException` | `404` | Data referensi tidak tersedia |
| Parameter masukan keliru | `BadRequestException` | `400` | Format masukan melanggar skema |
| Otoritas akses ditolak | `ForbiddenException` | `403` | Akses ditolak oleh sistem otorisasi |

<div class="mt-4 bg-gray-800 bg-opacity-60 rounded-lg p-3 border border-gray-600 text-xs leading-relaxed">
<p class="font-semibold text-yellow-300 mb-1">Praktik Terbaik Arsitektural</p>
<p>Pemanfaatan class exception kustom yang terstandardisasi memfasilitasi sentralisasi penanganan error (error handling centralization), sehingga format respons layanan (API) lebih deterministik dan mempermudah integrasi sistem pihak klien.</p>
</div>

</div>

<div>

```java
// Contoh integrasi pada logic layer
public User retrieveUserRecord(Long userId) {
    User user = userRepository.findById(userId);

    if (user == null) {
        throw new DataNotFoundException(
            "Identitas pengguna tidak teregistrasi pada sistem."
        );
    }

    return user;
}
```

</div>

</div>
