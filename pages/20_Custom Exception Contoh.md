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
