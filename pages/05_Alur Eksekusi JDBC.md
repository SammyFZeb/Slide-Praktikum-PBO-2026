---
layout: default
---

# Alur Eksekusi JDBC

<div class="grid grid-cols-[42%_53%] gap-6 items-start mt-6">
<div class="text-sm leading-normal">

1. **Register Driver** — Menyiapkan driver DBMS
2. **Get Connection** — Membuka koneksi ke *database*
3. **Create Statement** — Membuat instruksi SQL
4. **Execute Query** — Menjalankan *query* & mengambil hasil
5. **Close Connection** — Menutup koneksi

</div>
<div class="flex justify-center items-center h-full">
<div class="transform scale-[0.9] origin-top">

```mermaid
flowchart TD
  A([Register Driver]) --> B([Get Connection])
  B --> C([Create Statement])
  C --> D([Execute Query])
  D --> E([Close Connection])
```

</div>
</div>
</div>
