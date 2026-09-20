---
layout: default
---

# Recalling: Struktur Class & Encapsulation

<div class="grid grid-cols-2 gap-4">
<div>

**Class & Object**:
Class adalah blueprint, object adalah realisasinya (via `new`). Atribut/properti mendefinisikan *state*, method mendefinisikan *behavior*.

**Encapsulation**:
Praktik menyembunyikan detail internal class (Data Hiding) lewat *access modifier* `private`. Interaksi dari luar hanya diizinkan via `public` method (Getter/Setter).

</div>
<div>

```java
public class User {
    // Properti (private untuk Encapsulation)
    private String username;
    private String password;

    // ... Constructor & Method ...
}

// Instansiasi Object
User user1 = new User();
```

</div>
</div>