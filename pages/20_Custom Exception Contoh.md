# Contoh Custom Exception — REST API

<div class="grid grid-cols-12 gap-6 mt-4 items-start text-sm">

<div class="col-span-5">

| Skenario | Class | Status | Pesan |
|---|---|---|---|
| Data tidak ditemukan | `DataNotFoundException` | `404` | Data tidak ditemukan |
| Masukan tidak valid | `BadRequestException` | `401` | Data yang dimasukkan tidak valid |
| Akses tidak sah | `ForbiddenException` | `403` | Akses terhadap data tidak diberikan |

<div v-click class="mt-4 bg-gray-800 bg-opacity-60 rounded-lg p-3 border border-gray-600 text-xs leading-relaxed">
<p class="font-semibold text-yellow-300 mb-1">💡 Tips</p>
<p>Dengan custom exception yang terstruktur, response API menjadi konsisten dan mudah dikonsumsi oleh frontend atau client lainnya.</p>
</div>

</div>

<div v-click class="col-span-7">

```java {all|1-11|13-21|23-31|all}
public class DataNotFoundException
        extends RuntimeException {
    public DataNotFoundException(String msg) {
        super(msg);
    }
    public int getStatusCode() { return 404; }
}

public class BadRequestException
        extends RuntimeException {
    public BadRequestException(String msg) {
        super(msg);
    }
    public int getStatusCode() { return 401; }
}

public class ForbiddenException
        extends RuntimeException {
    public ForbiddenException(String msg) {
        super(msg);
    }
    public int getStatusCode() { return 403; }
}

// --- Contoh Penggunaan ---
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
