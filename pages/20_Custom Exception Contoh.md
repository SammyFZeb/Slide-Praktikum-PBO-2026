# Contoh Custom Exception — REST API

<div class="grid grid-cols-2 gap-6 mt-4 items-start text-sm">

<div class="space-y-4">

| Skenario | Class | Status | Pesan |
|---|---|---|---|
| Data tidak ditemukan | `DataNotFoundException` | `404` | Data tidak ditemukan |
| Masukan tidak valid | `BadRequestException` | `401` | Data tidak valid |
| Akses tidak sah | `ForbiddenException` | `403` | Akses tidak diberikan |

<div class="mt-4 bg-gray-800 bg-opacity-60 rounded-lg p-3 border border-gray-600 text-xs leading-relaxed">
<p class="font-semibold text-yellow-300 mb-1">💡 Tips</p>
<p>Dengan custom exception terstruktur, response API menjadi konsisten dan mudah dikonsumsi oleh client.</p>
</div>

</div>

<div>

```java
// Contoh penggunaan custom exception
public User getUser(Long id) {
    User user = userRepository.findById(id);

    if (user == null) {
        throw new DataNotFoundException(
            "Data tidak ditemukan"
        );
    }

    return user;
}
```

</div>

</div>
